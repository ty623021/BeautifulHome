package ty.cmd.base.http;

import io.reactivex.disposables.Disposable;

/**
 * 线程订阅
 *
 * @param <T>
 */
public interface SubscriptionHelper<T> {
    void add(Disposable subscription);

    void cancel(Disposable t);

    void cancelAll();
}
