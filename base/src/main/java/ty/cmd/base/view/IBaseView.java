package ty.cmd.base.view;

/**
 * baseView
 */
public interface IBaseView<T> {

    /**
     * 返回成功对象
     *
     * @param t
     */
    void onSuccess(T t);

    /**
     * 请求失败
     *
     * @param msg 请求异常信息
     */
    void onError(String msg);


}
