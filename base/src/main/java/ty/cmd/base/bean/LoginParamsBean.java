package ty.cmd.base.bean;

import java.io.Serializable;

public class LoginParamsBean implements Serializable {
    private UserInfoModel userInfo;
    private int commentAndReplyNum;//评论和回复未读数
    private int forumCardThumbNum;//点赞未读数

    public int getCommentAndReplyNum() {
        return commentAndReplyNum;
    }

    public void setCommentAndReplyNum(int commentAndReplyNum) {
        this.commentAndReplyNum = commentAndReplyNum;
    }

    public int getForumCardThumbNum() {
        return forumCardThumbNum;
    }

    public void setForumCardThumbNum(int forumCardThumbNum) {
        this.forumCardThumbNum = forumCardThumbNum;
    }

    public UserInfoModel getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoModel userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "LoginParamsBean{" +
                "userInfo=" + userInfo +
                ", commentAndReplyNum=" + commentAndReplyNum +
                ", forumCardThumbNum=" + forumCardThumbNum +
                '}';
    }
}
