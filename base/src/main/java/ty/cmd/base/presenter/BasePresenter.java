package ty.cmd.base.presenter;

import android.content.Context;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import ty.cmd.base.http.CustomException;
import ty.cmd.base.http.ResponseTransformer;
import ty.cmd.base.http.SchedulerProvider;
import ty.cmd.base.http.SubscriptionManager;
import ty.cmd.base.view.IBaseView;
import ty.cmd.base.widget.LoadingFragment;


public class BasePresenter {
    private static BasePresenter basePresenter;
    private IBaseView mView;
    private Disposable disposable;

    public static BasePresenter getInstance() {
        if (basePresenter == null) {
            basePresenter = new BasePresenter();
        }
        return basePresenter;
    }

    public void init(IBaseView v) {
        this.mView = v;
    }

    /**
     * 取消订阅
     */
    public void onDestroy() {
        SubscriptionManager.getInstance().cancel(disposable);
        if (mView != null) {
            mView = null;
        }
    }

    /**
     * 无loading
     * 添加线程管理并订阅
     *
     * @param
     */
    public void toSubscribe(Observable ob) {
        disposable = ob.compose(ResponseTransformer.handleResult())
                .compose(SchedulerProvider.getInstance().applySchedulers())
                .subscribe(info -> {
                    // 处理数据
                    mView.onSuccess(info);
                }, throwable -> {
                    // 处理异常
                    CustomException.ResponseThrowable exception = (CustomException.ResponseThrowable) throwable;
                    mView.onError(exception.message);
                });
        SubscriptionManager.getInstance().add(disposable);
    }

    /**
     * 有loading
     * 添加线程管理并订阅
     *
     * @param ob
     * @param context
     * @param progressTitle 进度条文字为null则不显示loading
     */
    public void toSubscribe(Observable ob, Context context, String progressTitle) {
        LoadingFragment loading = LoadingFragment.showLoading(context, progressTitle);
        disposable = ob.compose(ResponseTransformer.handleResult())
                .compose(SchedulerProvider.getInstance().applySchedulers())
                .subscribe(info -> {
                            // 处理数据
                            mView.onSuccess(info);
                        }, throwable -> {
                            // 处理异常
                            CustomException.ResponseThrowable exception = (CustomException.ResponseThrowable) throwable;
                            mView.onError(exception.message);
                        }, () -> LoadingFragment.dismiss(loading)
                );
        SubscriptionManager.getInstance().add(disposable);
    }
}
