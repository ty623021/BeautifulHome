package ty.cmd.beautifulhome.view;

public interface ILoginView<T> {

    void loginSuccess(T t);

    void loginError(String msg);
}
