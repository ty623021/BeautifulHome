package ty.cmd.base.http;


import android.content.Context;

import java.lang.ref.WeakReference;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import ty.cmd.base.widget.LoadingFragment;

/**
 * 回调
 */
public abstract class HttpObserver<T> implements Observer<T> {
    private WeakReference<Context> mView;
    private LoadingFragment loading;

    public HttpObserver() {
    }

    public HttpObserver(Context context) {
        mView = new WeakReference<>(context);
    }

    public HttpObserver(Context context, String progressTitle) {
        mView = new WeakReference<>(context);
        loading = LoadingFragment.showLoading(mView.get(), progressTitle);
    }

    @Override
    public void onSubscribe(Disposable d) {
    }

    @Override
    public void onComplete() {
        LoadingFragment.dismiss(loading);
    }

    @Override
    public void onError(Throwable t) {
        CustomException.ResponseThrowable throwable;
        if (t instanceof CustomException.ResponseThrowable) {
            throwable = (CustomException.ResponseThrowable) t;
        } else {
            throwable = CustomException.handleException(t);
        }
        onFail(throwable.message);
    }

    @Override
    public void onNext(T t) {
        onSuccess(t);
    }

    public abstract void onSuccess(T t);

    public abstract void onFail(String message);

}
