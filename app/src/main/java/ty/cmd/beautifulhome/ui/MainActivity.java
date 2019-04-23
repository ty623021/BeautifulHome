package ty.cmd.beautifulhome.ui;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.List;

import ty.cmd.base.base.BaseActivity;
import ty.cmd.base.bean.LoginParamsBean;
import ty.cmd.base.bean.PublishModel;
import ty.cmd.base.bean.SelectPublishListParamsBean;
import ty.cmd.base.http.Constant;
import ty.cmd.base.http.HttpManager;
import ty.cmd.beautifulhome.R;
import ty.cmd.beautifulhome.presenter.impl.LoginPresenterImpl;
import ty.cmd.beautifulhome.view.ILoginView;

public class MainActivity extends BaseActivity<SelectPublishListParamsBean> implements ILoginView<LoginParamsBean> {

    private LoginPresenterImpl loginPresenter;
    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        params.put(Constant.currPage, 1 + "");
        params.put(Constant.pageSize, 10 + "");
        params.put(Constant.type, 1 + "");
        // basePresenter 加载首页数据列表
        presenter.toSubscribe(HttpManager.getRequest().homeList(params), this, "正在加载...");

        //登录presenter 登录
//        login();

        findViewById(R.id.login).setOnClickListener(v -> login());
        name = findViewById(R.id.name);
    }

    private void login() {
        loginPresenter = new LoginPresenterImpl(this);
        HashMap map = new HashMap();
        map.put("loginId", "13671965542");
        map.put("loginPwd", "123456");
        map.put("deviceType", "3");
        loginPresenter.doLogin(this, map);
    }

    @Override
    public void onSuccess(SelectPublishListParamsBean bean) {
        if (bean != null && bean.getData() != null) {
            List<PublishModel> data = bean.getData();
            Log.e("size", data.size() + "");
            name.setText(data.size() + "条数据");
        }
    }

    @Override
    public void onError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess(LoginParamsBean userInfo) {
        Log.e("userInfo", userInfo.toString() + "");
        if (userInfo != null) {
            name.setText(userInfo.getUserInfo().getUserName() + "");
        }
    }

    @Override
    public void loginError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
