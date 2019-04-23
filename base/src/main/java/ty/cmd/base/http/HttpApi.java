package ty.cmd.base.http;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import ty.cmd.base.bean.BaseHttpBean;
import ty.cmd.base.bean.LoginParamsBean;
import ty.cmd.base.bean.SelectPublishListParamsBean;

/**
 * 网络请求接口
 */
public interface HttpApi {

    //登录
    @FormUrlEncoded
    @POST("action/login")
    Observable<BaseHttpBean<LoginParamsBean>> login(@FieldMap Map<String, String> params);

    //发送短信
    @FormUrlEncoded
    @POST("action/sendSms")
    Observable<BaseHttpBean<LoginParamsBean>> sendSms(@FieldMap Map<String, String> params);

    //首页列表
    @FormUrlEncoded
    @POST("action/selectPublishListHome")
    Observable<BaseHttpBean<SelectPublishListParamsBean>> homeList(@FieldMap Map<String, String> params);

}
