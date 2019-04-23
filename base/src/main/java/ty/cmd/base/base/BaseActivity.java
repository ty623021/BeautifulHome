package ty.cmd.base.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.HashMap;

import ty.cmd.base.http.SubscriptionManager;
import ty.cmd.base.presenter.BasePresenter;
import ty.cmd.base.view.IBaseView;


public abstract class BaseActivity<T> extends AppCompatActivity implements IBaseView<T> {

    protected BasePresenter presenter;
    protected HashMap params = new HashMap();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = BasePresenter.getInstance();
        presenter.init(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
        SubscriptionManager.getInstance().cancelAll();
    }
}
