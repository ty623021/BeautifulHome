package ty.cmd.base.http;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 网络请求管理类
 */
public class HttpManager {
    // 服务器地址
    private static final String BASE_URL = Constant.APP_IP;
    private static HttpManager mInstance;
    private static Retrofit retrofit;
    private static volatile HttpApi request = null;

    public static HttpManager getInstance() {
        if (mInstance == null) {
            synchronized (HttpManager.class) {
                if (mInstance == null) {
                    mInstance = new HttpManager();
                }
            }
        }
        return mInstance;
    }

    public void init() {
        OkHttpClient client = new OkHttpClient.Builder().build();
        retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static HttpApi getRequest() {
        if (request == null) {
            synchronized (Request.class) {
                request = retrofit.create(HttpApi.class);
            }
        }
        return request;
    }
}
