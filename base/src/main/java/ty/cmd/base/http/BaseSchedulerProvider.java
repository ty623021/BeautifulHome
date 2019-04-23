package ty.cmd.base.http;

import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;

/**
 * 线程切换
 */
public interface BaseSchedulerProvider {

    @NonNull
    Scheduler io();

    @NonNull
    Scheduler ui();

    @NonNull
    <T> ObservableTransformer<T, T> applySchedulers();

}
