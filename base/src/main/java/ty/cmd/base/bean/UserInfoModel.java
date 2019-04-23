package ty.cmd.base.bean;


import java.io.Serializable;

/**
 * 登录者，用户详细信息
 *
 * @author JeyZheng
 *         <p>
 *         Mar 17, 2015 10:58:18 AM
 */
public class UserInfoModel implements Serializable {
    private static final long serialVersionUID = -6381412183441588801L;
    private String liveUrl;            //直播地址
    private String userName;            // 用户名
    private String shortIndex;            // 首字母
    private String birthDay;            // 生日
    private String age;                    //
    private String provinceName;        // 省名
    private String cityName;            // 城市
    private String profession;            // 职业
    private String gender;                // 0 : female; 1 : male
    private String vipLevel;            // 会员星级
    private String tlb;                    // 途乐币
    private String loginId;            // 途乐帐号
    private String password;            // 帐号密码
    private String fqxy;            // 分期协议
    private String loginPwd;
    private String createTime;
    // 云通讯账户信息
    private String subAccount;
    private String subToken;
    private String voipAccount;
    private String voipToken;

    private String phoneNum;
    private String hobbies;
    private String signature;          //个性签名
    private String school;
    private String job;                    // 就职公司（工作单位）
    private String userIcon;                //用户头像

    private String visitTime;
    private String concernTotal; //关注数
    private String friendTotal;  //粉丝数
    private String commentReplyNum;

    private String isAuth;                // 是否认证（新增）
    private String auth;                // 是否认证（新增）
    private String isAuto;                // 是否认证（新增） 0:无认证 1：官方认证 2：组织认证
    private String vipEndTime;        // vip到期时间（新增）
    private long grow;                    // 会员成长值（新增）
    private String isFriend;            //1:是朋友，0:不是朋友
    private String isConcern;  //1.已关注


    // 活动返回新增字段
    private String userIndex;
    private String distance; // 距离
    private String roleId; // 1.2.5.6.8 自媒体发布权限  1.2.3.6.8 公益发布权限  7.8  活动支付  在活动详情中roleid为0没有支付权限，1，有支付权限

    private String modelName;//奥迪a4l", --车型名称
    private String carImg; //车型图片
    private String carNo; //车库的  车牌号

    private String plateNumber;//车牌号

    public String getFqxy() {
        return fqxy;
    }

    public void setFqxy(String fqxy) {
        this.fqxy = fqxy;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getLiveUrl() {
        return liveUrl;
    }

    public void setLiveUrl(String liveUrl) {
        this.liveUrl = liveUrl;
    }

    public String getIsFriend() {
        return isFriend;
    }

    public void setIsFriend(String isFriend) {
        this.isFriend = isFriend;
    }

    public String getCommentReplyNum() {
        return commentReplyNum;
    }

    public void setCommentReplyNum() {
        this.commentReplyNum = commentReplyNum;
    }

    public String getIsConcern() {
        return isConcern;
    }

    public void setIsConcern(String isConcern) {
        this.isConcern = isConcern;
    }

    public String getVisitTime() {
        return visitTime;
    }

    public String getIsAuth() {
        return isAuth;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getVipEndTime() {
        return vipEndTime;
    }

    public long getGrow() {
        return grow;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getShortIndex() {
        return shortIndex;
    }

    public void setShortIndex(String shortIndex) {
        this.shortIndex = shortIndex;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel;
    }

    public String getTlb() {
        return tlb;
    }

    public void setTlb(String tlb) {
        this.tlb = tlb;
    }

    public String getLoginId() {
        return loginId;
    }


    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getSubAccount() {
        return subAccount;
    }

    public void setSubAccount(String subAccount) {
        this.subAccount = subAccount;
    }

    public String getSubToken() {
        return subToken;
    }

    public void setSubToken(String subToken) {
        this.subToken = subToken;
    }

    public String getVoipAccount() {
        return voipAccount;
    }

    public void setVoipAccount(String voipAccount) {
        this.voipAccount = voipAccount;
    }

    public String getVoipToken() {
        return voipToken;
    }

    public void setVoipToken(String voipToken) {
        this.voipToken = voipToken;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon;
    }

    public String getConcernTotal() {
        return concernTotal;
    }

    public void setConcernTotal(String concernTotal) {
        this.concernTotal = concernTotal;
    }

    public String getFriendTotal() {
        return friendTotal;
    }

    public void setFriendTotal(String friendTotal) {
        this.friendTotal = friendTotal;
    }


    public String getUserIndex() {
        return userIndex;
    }

    public void setUserIndex(String userIndex) {
        this.userIndex = userIndex;
    }


    public void setIsAuto(String isAuto) {
        this.isAuto = isAuto;
    }

    public String getIsAuto() {
        return isAuto;
    }


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getCarImg() {
        return carImg;
    }

    public void setCarImg(String carImg) {
        this.carImg = carImg;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setIsAuth(String isAuth) {
        this.isAuth = isAuth;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }


    @Override
    public String toString() {
        return "UserInfoModel{" +
                "liveUrl='" + liveUrl + '\'' +
                ", userName='" + userName + '\'' +
                ", shortIndex='" + shortIndex + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", age='" + age + '\'' +
                ", provinceName='" + provinceName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", profession='" + profession + '\'' +
                ", gender='" + gender + '\'' +
                ", vipLevel='" + vipLevel + '\'' +
                ", tlb='" + tlb + '\'' +
                ", loginId='" + loginId + '\'' +
                ", password='" + password + '\'' +
                ", fqxy='" + fqxy + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", createTime='" + createTime + '\'' +
                ", subAccount='" + subAccount + '\'' +
                ", subToken='" + subToken + '\'' +
                ", voipAccount='" + voipAccount + '\'' +
                ", voipToken='" + voipToken + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", hobbies='" + hobbies + '\'' +
                ", signature='" + signature + '\'' +
                ", school='" + school + '\'' +
                ", job='" + job + '\'' +
                ", userIcon='" + userIcon + '\'' +
                ", visitTime='" + visitTime + '\'' +
                ", concernTotal='" + concernTotal + '\'' +
                ", friendTotal='" + friendTotal + '\'' +
                ", commentReplyNum='" + commentReplyNum + '\'' +
                ", isAuth='" + isAuth + '\'' +
                ", auth='" + auth + '\'' +
                ", isAuto='" + isAuto + '\'' +
                ", vipEndTime='" + vipEndTime + '\'' +
                ", grow=" + grow +
                ", isFriend='" + isFriend + '\'' +
                ", isConcern='" + isConcern + '\'' +
                ", userIndex='" + userIndex + '\'' +
                ", distance='" + distance + '\'' +
                ", roleId='" + roleId + '\'' +
                ", modelName='" + modelName + '\'' +
                ", carImg='" + carImg + '\'' +
                ", carNo='" + carNo + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                '}';
    }
}
