package ty.cmd.base.bean;

/**
 * 基础对象
 */
public class BaseHttpBean<T> {
    /**
     * 取值：1（操作成功），0（操作失败）
     */
    private String resultType;
    /**
     * 返回结果码(参考文档最开始部分的结果吗)，100000为成功，其余都为失败
     */
    private int resultCode;
    /**
     * 返回的描述
     */
    private String resultDesc;
    /**
     * 结果对象
     */
    private T result;

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }


    public boolean isOK() {
        return 100000 == resultCode;
    }

    @Override
    public String toString() {
        return "BaseHttpBean{" +
                "resultType='" + resultType + '\'' +
                ", resultCode='" + resultCode + '\'' +
                ", resultDesc='" + resultDesc + '\'' +
                ", result=" + result +
                '}';
    }
}
