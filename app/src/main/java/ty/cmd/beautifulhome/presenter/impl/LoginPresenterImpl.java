package ty.cmd.beautifulhome.presenter.impl;

import android.content.Context;

import java.util.HashMap;

import ty.cmd.base.bean.LoginParamsBean;
import ty.cmd.base.http.HttpObserver;
import ty.cmd.beautifulhome.model.UserModel;
import ty.cmd.beautifulhome.presenter.ILoginPresenter;
import ty.cmd.beautifulhome.view.ILoginView;

public class LoginPresenterImpl implements ILoginPresenter {

    private ILoginView iLoginView;
    private UserModel userModel;

    public LoginPresenterImpl(ILoginView view) {
        iLoginView = view;
        userModel = new UserModel();
    }

    @Override
    public void doLogin(Context context, HashMap map) {
        userModel.login(map, new HttpObserver<LoginParamsBean>(context, "正在登录...") {
            @Override
            public void onSuccess(LoginParamsBean info) {
                iLoginView.loginSuccess(info);
            }

            @Override
            public void onFail(String message) {
                iLoginView.loginError(message);
            }
        });
    }

    @Override
    public void sendSms(HashMap map) {
        userModel.sendSms(map, new HttpObserver<LoginParamsBean>() {
            @Override
            public void onSuccess(LoginParamsBean info) {
                iLoginView.loginSuccess(info);
            }

            @Override
            public void onFail(String message) {
                iLoginView.loginError(message);
            }
        });
    }
}
