package ty.cmd.base.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 发布信息列表
 */
public class SelectPublishListParamsBean implements Serializable {
    private List<PublishModel> data;

    public List<PublishModel> getData() {
        return data;
    }

    public void setData(List<PublishModel> data) {
        this.data = data;
    }
}
