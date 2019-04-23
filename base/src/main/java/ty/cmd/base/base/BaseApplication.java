package ty.cmd.base.base;

import android.app.Application;

import ty.cmd.base.http.HttpManager;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        HttpManager.getInstance().init();
    }
}
