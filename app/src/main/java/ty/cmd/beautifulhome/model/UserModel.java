package ty.cmd.beautifulhome.model;

import java.util.Map;

import io.reactivex.Observable;
import ty.cmd.base.http.HttpManager;
import ty.cmd.base.http.HttpObserver;
import ty.cmd.base.model.BaseModel;


public class UserModel extends BaseModel implements IUserModel {

    @Override
    public void login(Map params, HttpObserver observer) {
        Observable login = HttpManager.getRequest().login(params);
        request(login, observer);
    }

    @Override
    public void sendSms(Map params, HttpObserver observer) {
        Observable sendSms = HttpManager.getRequest().sendSms(params);
        request(sendSms, observer);
    }
}
