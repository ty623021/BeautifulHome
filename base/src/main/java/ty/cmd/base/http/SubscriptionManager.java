package ty.cmd.base.http;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * 线程订阅管理
 */
public class SubscriptionManager implements SubscriptionHelper {
    public static SubscriptionManager subscriptionManager;
    private CompositeDisposable mDisposables;

    public SubscriptionManager() {
        if (mDisposables == null) {
            mDisposables = new CompositeDisposable();
        }
    }

    @Override
    public void add(Disposable disposable) {
        if (disposable == null) return;
        mDisposables.add(disposable);
    }

    @Override
    public void cancel(Disposable disposable) {
        if (mDisposables != null) {
            mDisposables.delete(disposable);
        }
    }

    @Override
    public void cancelAll() {
        if (mDisposables != null) {
            mDisposables.clear();
        }
    }

    public static SubscriptionManager getInstance() {
        if (subscriptionManager == null) {
            synchronized (SubscriptionManager.class) {
                if (subscriptionManager == null) {
                    subscriptionManager = new SubscriptionManager();
                }
            }
        }
        return subscriptionManager;
    }
}
