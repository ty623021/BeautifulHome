package ty.cmd.base.http;

public class Constant {
    /**
     * API地址
     */
    public static final String APP_IP = getAppIp(Environment.PRODUCTION);

    private static String getAppIp(Environment environment) {
        switch (environment) {
            case PRODUCTION://正式环境
                return "http://210.73.202.85:8880/goodnum/";
            case TESTING://测试环境
                return "http://192.168.1.107:8080/goodnum/";
            default:
                return "";
        }

    }
    public enum Environment {
        // 生产环境
        PRODUCTION,
        // 测试环境
        TESTING,
    }

    public final static String currPage = "currPage";
    public final static String pageSize = "pageSize";
    public final static String userName = "userName";
    public final static String passWord = "passWord";
    public final static String type = "type";
}
