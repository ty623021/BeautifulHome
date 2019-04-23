package ty.cmd.base.http;


import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import ty.cmd.base.bean.BaseHttpBean;

/**
 * 网络请求过滤器
 * 解析Response数据,进一步处理
 * 直接将需要使用的数据处理提取出来，并且将Exception统一处理！
 */
public class ResponseTransformer {

    public static <T> ObservableTransformer<BaseHttpBean<T>, T> handleResult() {
        return upstream -> upstream
                .onErrorResumeNext(throwable -> {
                    return Observable.error(CustomException.handleException(throwable));
                })
                .flatMap((Function<BaseHttpBean<T>, ObservableSource<T>>) tResponse -> {
                    if (tResponse.isOK()) {
                        return Observable.just(tResponse.getResult());
                    } else {
                        return Observable.error(new CustomException.ResponseThrowable(tResponse.getResultDesc(), tResponse.getResultCode()));
                    }
                });
    }

}
