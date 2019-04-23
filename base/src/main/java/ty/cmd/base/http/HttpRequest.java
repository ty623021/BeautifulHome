package ty.cmd.base.http;

import io.reactivex.Observable;
import io.reactivex.Observer;
import ty.cmd.base.bean.BaseHttpBean;

public class HttpRequest {

    public HttpRequest() {
    }

    /**
     * 网络请求
     *
     * @param ob
     * @param observer
     * @param <T>
     */
    public <T> void request(Observable<BaseHttpBean<T>> ob, Observer<T> observer) {
        ob.compose(ResponseTransformer.handleResult())
                .compose(SchedulerProvider.getInstance().applySchedulers())
                .subscribe(observer);
    }
}
