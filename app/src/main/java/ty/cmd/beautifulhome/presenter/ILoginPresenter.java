package ty.cmd.beautifulhome.presenter;

import android.content.Context;

import java.util.HashMap;

public interface ILoginPresenter {
    void doLogin(Context context, HashMap map);

    void sendSms(HashMap map);
}
