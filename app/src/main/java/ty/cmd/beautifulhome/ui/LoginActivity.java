package ty.cmd.beautifulhome.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import io.reactivex.Observable;
import ty.cmd.base.base.BaseActivity;
import ty.cmd.base.bean.UserInfoModel;
import ty.cmd.base.http.Constant;
import ty.cmd.base.http.HttpManager;


public class LoginActivity extends BaseActivity<UserInfoModel> {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        params.put(Constant.userName, "13671965542");
        params.put(Constant.passWord, "123456");
        Observable login = HttpManager.getRequest().login(params);
        presenter.toSubscribe(login);
    }


    @Override
    public void onError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT);
    }

    @Override
    public void onSuccess(UserInfoModel userModel) {
        Log.e("userModel", userModel.toString());
    }
}
