package ty.cmd.beautifulhome.model;

import java.util.Map;

import ty.cmd.base.http.HttpObserver;


public interface IUserModel {

    void login(Map params, HttpObserver observer);

    void sendSms(Map params, HttpObserver observer);

}
