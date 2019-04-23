package ty.cmd.base.bean;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by zx on 2017/12/15.
 */

public class PublishModel implements Serializable {
    /**
     * 发布信息id
     */
    private String pid;

    /**
     * -竞拍信息id
     */
    private String aId;
    /**
     * 用户id
     */
    private String loginId;

    /**
     * 1出租、2出售 3求购
     */
    private int dType;
    /**
     * 用户昵称
     */
    private String userName;
    /**
     * 用户头像
     */
    private String userIcon;
    /**
     * 用户等级
     */
    private String level;
    /**
     * 用户手机号
     */
    private String phoneNum;
    /**
     * 发布类型
     */
    private int type;
    /**
     * 发布类型描述
     */
    private String typeDesc;
    /**
     * 发布号码
     */
    private String publishNum;
    /**
     * 发布号码类别
     */
    private String publishNumType;
    /**
     * 归属地城市id
     */
    private String cityId;

    private String cityName;
    /**
     * 运营商
     */
    private String operatorType;
    /**
     * 过户方式
     */
    private String changeWay;
    /**
     * 出租时间
     */
    private String leaseTime;

    /**
     * 售价
     */
    private String salePrice;
    /**
     * 售价类型
     */
    private String salePriceType;

    /**
     * -描述
     */
    private String describe;

    /**
     * 描述
     */
    private String describer;
    /**
     * 当前价格
     */
    private int nowPrice;

    /**
     * -置顶
     */
    private String isTop;

    /**
     * 置顶开始时间
     */
    private String startTimeTop;

    /**
     * 置顶结束时间
     */
    private String endTimeTop;

    /**
     * 是否特价
     */
    private String isSpecialPrice;
    /**
     * 商家星级等级、个人、金牌商家
     */
    private String isBusMan;

    /**
     * 特价开始时间
     */
    private String startTimeSPrice;

    /**
     * 特价结束时间
     */
    private String endTimeSPrice;
    /**
     * 是否可以过户
     */
    private String isCanTransfer;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 修改时间
     */
    private String updateTime;
    /**
     * 置换详情
     */
    private String exchangeDesc;


    private Map<String, String> map;

    /**
     * 1竞拍中 0竞拍结束 2未开始
     */
    private String status;
    /**
     * 距离开始的时间
     */
    private long toBegin;
    /**
     * 距离结束的时间
     */
    private long seconds;
    /**
     * 城市置顶
     */
    private String isCityTop;
    /**
     * 城市特价
     */
    private String isCitySpecialPrice;
    /**
     * 是否为 官方合作（=3：官方合作，!=3：个人）
     */
    private String roleId;
    /**
     * 个人所有的靓号
     */
    private String allPublishNum;
    /**
     * 个人收藏的数量
     */
    private String collectCount;
    /**
     * "isCollect":"0" 取消收藏1收藏
     */
    private String isCollect;

    /**
     * "isCollect":"0" 取消收藏1收藏
     */
    private boolean isCollection;

    /**
     * 0可以刷新1不可以刷新
     */
    private String isUpdate;

    /**
     * 付款须知
     */
    private String fkxz;
    /**
     * 分期协议
     */
    private String fqxy;
    /**
     * "orderStatus":"0"--订单状态 0待付款 1已付款 2 完成 5已退款
     */
    private String orderStatus;

    private String modifyTime;//订单修改时间

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 阅读数量
     */
    private int lookNum;
    /**
     * 跳转本地内容
     */
    private String pushVC;

    //广告连接地址
    private String lj;
    /**
     * 广告标题
     */
    private String imageTitle;
    /**
     * 广告作者
     */
    private String imageAuthor;
    //广告图片
    private String imageUrl;
    //本地广告
    private String imageLocal;
    // 0未评价 1已评价
    private int isPl;
    // 0吉 1 中吉  2 大吉
    private String isJx;
    //估价
    private String evaluate;

    //退款金额
    private String refundMoney;
    //实际付款价格
    private String orderPrice;
    //支付方式 weichatpay alipay
    private String orderPayChannel;
    //支付时间
    private String orderCreateTime;
    //订单剩余款项支付截至时间
    private String paymentDeadline;

    //是否分期 0不分期 1分期
    private String isByStages;
    //分3期的价格
    private String sanqiPrice;
    //分6期
    private String liuqiPrice;
    //分9期
    private String shierqiPrice;

    private int nper;// 期数
    private int remainingNper;//剩余期数
    private String totalMoney;// 总金额
    private String installmentId;// 分期编号
    private double eachMoney;// 每期金额
    private String overdueDays;// 逾期天数
    private double overdueMoney;// 逾期金额（滞纳金）
    private String repaymentDate;//本期还款日期
    private String nextDate;//下期还款日
    private String paymentMoney;//已付款金额

    // 是否选中
    private boolean isSelect;
    private String insertTime;//足迹插入时间
    private String fid;//足迹id

    //已卖出时 买家信息
    private String loginIdB;
    private String userNameB;
    private String userIconB;
    private String phoneNumB;
    private String levelB;
    private String roleIdB;

    // 过户单地址
    private String imagePath;
    // 过户单上传时间
    private String uploadTime;


    //=============================网店============================
    private String onlineStoreType; //网店类型
    private String onlineStoreName;//网店名称
    private String onlineStoreUrl;//网店网址
    private String isBusinesses;//  是否企业店铺
    private String creditRating;// 信用等级
    private String trademarkType;// 商标类型
    private String storeType;//店铺类型
    private String registeredType;//注册类型
    private String area;//区域

    //=============================网店============================

    //=============================建筑资质============================


    //=============================建筑资质============================


    //=============================公司============================

    private String manageDeadline;//经营期限
    private String registeredAmount;//注册金额
    private String companyName;//公司名称
    private String taxType;//纳税类型
    private String assets;//附带资产
    private String shareTransfer;//股权转让
    private String isPaidIn;//注册资本类型 true 实缴 false 认缴

    //=============================公司============================

    //=============================版权============================
    private String copyrightName;//版权名称
    private String copyrightClass;//版权分类
    private String accreditWay;//授权方式
    private String brandType;//商标类型
    private String combinationType;//组合类型
    private String patentType;//专利类型
    private String industry;//所属行业

    //=============================版权============================


    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    public boolean getIsSelect() {
        return isSelect;
    }

    public void setIsSelect(boolean isSelect) {
        this.isSelect = isSelect;
    }

    public String getPushVC() {
        return pushVC;
    }

    public void setPushVC(String pushVC) {
        this.pushVC = pushVC;
    }

    public String getFqxy() {
        return fqxy;
    }

    public void setFqxy(String fqxy) {
        this.fqxy = fqxy;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getNextDate() {
        return nextDate;
    }

    public void setNextDate(String nextDate) {
        this.nextDate = nextDate;
    }

    public String getInstallmentId() {
        return installmentId;
    }

    public void setInstallmentId(String installmentId) {
        this.installmentId = installmentId;
    }

    public String getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(String paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public int getNper() {
        return nper;
    }

    public void setNper(int nper) {
        this.nper = nper;
    }

    public int getRemainingNper() {
        return remainingNper;
    }

    public void setRemainingNper(int remainingNper) {
        this.remainingNper = remainingNper;
    }

    public String getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(String totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double getEachMoney() {
        return eachMoney;
    }

    public void setEachMoney(double eachMoney) {
        this.eachMoney = eachMoney;
    }

    public String getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(String overdueDays) {
        this.overdueDays = overdueDays;
    }

    public double getOverdueMoney() {
        return overdueMoney;
    }

    public void setOverdueMoney(double overdueMoney) {
        this.overdueMoney = overdueMoney;
    }

    public String getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(String repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public String getIsByStages() {
        return isByStages;
    }

    public void setIsByStages(String isByStages) {
        this.isByStages = isByStages;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getOnlineStoreType() {
        return onlineStoreType;
    }

    public void setOnlineStoreType(String onlineStoreType) {
        this.onlineStoreType = onlineStoreType;
    }

    public String getOnlineStoreName() {
        return onlineStoreName;
    }

    public void setOnlineStoreName(String onlineStoreName) {
        this.onlineStoreName = onlineStoreName;
    }

    public String getOnlineStoreUrl() {
        return onlineStoreUrl;
    }

    public void setOnlineStoreUrl(String onlineStoreUrl) {
        this.onlineStoreUrl = onlineStoreUrl;
    }

    public String getIsBusinesses() {
        return isBusinesses;
    }

    public void setIsBusinesses(String isBusinesses) {
        this.isBusinesses = isBusinesses;
    }

    public String getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(String creditRating) {
        this.creditRating = creditRating;
    }

    public String getTrademarkType() {
        return trademarkType;
    }

    public void setTrademarkType(String trademarkType) {
        this.trademarkType = trademarkType;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public String getRegisteredType() {
        return registeredType;
    }

    public void setRegisteredType(String registeredType) {
        this.registeredType = registeredType;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public String getAssets() {
        return assets;
    }

    public void setAssets(String assets) {
        this.assets = assets;
    }

    public String getLeaseTime() {
        return leaseTime;
    }

    public void setLeaseTime(String leaseTime) {
        this.leaseTime = leaseTime;
    }

    public String getCopyrightName() {
        return copyrightName;
    }

    public void setCopyrightName(String copyrightName) {
        this.copyrightName = copyrightName;
    }

    public String getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(String refundMoney) {
        this.refundMoney = refundMoney;
    }

    public String getChangeWay() {
        return changeWay;
    }

    public void setChangeWay(String changeWay) {
        this.changeWay = changeWay;
    }

    public String isPaidIn() {
        return isPaidIn;
    }

    public void setPaidIn(String paidIn) {
        isPaidIn = paidIn;
    }

    public String getCopyrightClass() {
        return copyrightClass;
    }

    public void setCopyrightClass(String copyrightClass) {
        this.copyrightClass = copyrightClass;
    }

    public String getAccreditWay() {
        return accreditWay;
    }

    public void setAccreditWay(String accreditWay) {
        this.accreditWay = accreditWay;
    }

    public String getBrandType() {
        return brandType;
    }

    public void setBrandType(String brandType) {
        this.brandType = brandType;
    }

    public String getCombinationType() {
        return combinationType;
    }

    public void setCombinationType(String combinationType) {
        this.combinationType = combinationType;
    }

    public String getPatentType() {
        return patentType;
    }

    public void setPatentType(String patentType) {
        this.patentType = patentType;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public boolean isCollection() {
        return isCollection;
    }

    public void setCollection(boolean collection) {
        isCollection = collection;
    }

    public String getManageDeadline() {
        return manageDeadline;
    }

    public void setManageDeadline(String manageDeadline) {
        this.manageDeadline = manageDeadline;
    }

    public String getRegisteredAmount() {
        return registeredAmount;
    }

    public void setRegisteredAmount(String registeredAmount) {
        this.registeredAmount = registeredAmount;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getShareTransfer() {
        return shareTransfer;
    }

    public void setShareTransfer(String shareTransfer) {
        this.shareTransfer = shareTransfer;
    }


    public String getPaymentDeadline() {
        return paymentDeadline;
    }

    public void setPaymentDeadline(String paymentDeadline) {
        this.paymentDeadline = paymentDeadline;
    }

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    public String getDescriber() {
        return describer;
    }

    public void setDescriber(String describer) {
        this.describer = describer;
    }

    public int getNowPrice() {
        return nowPrice;
    }

    public void setNowPrice(int nowPrice) {
        this.nowPrice = nowPrice;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getExchangeDesc() {
        return exchangeDesc;
    }

    public void setExchangeDesc(String exchangeDesc) {
        this.exchangeDesc = exchangeDesc;
    }

    public long getToBegin() {
        return toBegin;
    }

    public void setToBegin(long toBegin) {
        this.toBegin = toBegin;
    }

    public long getSeconds() {
        return seconds;
    }

    public void setSeconds(long seconds) {
        this.seconds = seconds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getLoginIdB() {
        return loginIdB;
    }

    public void setLoginIdB(String loginIdB) {
        this.loginIdB = loginIdB;
    }

    public String getUserNameB() {
        return userNameB;
    }

    public void setUserNameB(String userNameB) {
        this.userNameB = userNameB;
    }

    public String getUserIconB() {
        return userIconB;
    }

    public void setUserIconB(String userIconB) {
        this.userIconB = userIconB;
    }

    public String getPhoneNumB() {
        return phoneNumB;
    }

    public void setPhoneNumB(String phoneNumB) {
        this.phoneNumB = phoneNumB;
    }

    public String getLevelB() {
        return levelB;
    }

    public void setLevelB(String levelB) {
        this.levelB = levelB;
    }

    public String getRoleIdB() {
        return roleIdB;
    }

    public void setRoleIdB(String roleIdB) {
        this.roleIdB = roleIdB;
    }

    public String getIsBusMan() {
        return isBusMan;
    }

    public void setIsBusMan(String isBusMan) {
        this.isBusMan = isBusMan;
    }

    public String getImageTitle() {
        return imageTitle;
    }

    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
    }

    public String getImageAuthor() {
        return imageAuthor;
    }

    public void setImageAuthor(String imageAuthor) {
        this.imageAuthor = imageAuthor;
    }

    public String getImageLocal() {
        return imageLocal;
    }

    public void setImageLocal(String imageLocal) {
        this.imageLocal = imageLocal;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public String getIsJx() {
        return isJx;
    }

    public void setIsJx(String isJx) {
        this.isJx = isJx;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public String getSanqiPrice() {
        return sanqiPrice;
    }

    public void setSanqiPrice(String sanqiPrice) {
        this.sanqiPrice = sanqiPrice;
    }

    public String getLiuqiPrice() {
        return liuqiPrice;
    }

    public void setLiuqiPrice(String liuqiPrice) {
        this.liuqiPrice = liuqiPrice;
    }

    public String getShierqiPrice() {
        return shierqiPrice;
    }

    public void setShierqiPrice(String shierqiPrice) {
        this.shierqiPrice = shierqiPrice;
    }

    public String getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getOrderPayChannel() {
        return orderPayChannel;
    }

    public void setOrderPayChannel(String orderPayChannel) {
        this.orderPayChannel = orderPayChannel;
    }

    public int getIsPl() {
        return isPl;
    }

    public void setIsPl(int isPl) {
        this.isPl = isPl;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getFkxz() {
        return fkxz;
    }

    public void setFkxz(String fkxz) {
        this.fkxz = fkxz;
    }

    public String getIsCollect() {
        return isCollect;
    }

    public void setIsCollect(String isCollect) {
        this.isCollect = isCollect;
    }

    public String getAllPublishNum() {
        return allPublishNum;
    }

    public void setAllPublishNum(String allPublishNum) {
        this.allPublishNum = allPublishNum;
    }

    public String getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(String collectCount) {
        this.collectCount = collectCount;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public int getdType() {
        return dType;
    }

    public void setdType(int dType) {
        this.dType = dType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPublishNum() {
        return publishNum;
    }

    public void setPublishNum(String publishNum) {
        this.publishNum = publishNum;
    }

    public String getPublishNumType() {
        return publishNumType;
    }

    public void setPublishNumType(String publishNumType) {
        this.publishNumType = publishNumType;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getSalePriceType() {
        return salePriceType;
    }

    public void setSalePriceType(String salePriceType) {
        this.salePriceType = salePriceType;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getIsTop() {
        return isTop;
    }

    public void setIsTop(String isTop) {
        this.isTop = isTop;
    }

    public String getStartTimeTop() {
        return startTimeTop;
    }

    public void setStartTimeTop(String startTimeTop) {
        this.startTimeTop = startTimeTop;
    }

    public String getEndTimeTop() {
        return endTimeTop;
    }

    public void setEndTimeTop(String endTimeTop) {
        this.endTimeTop = endTimeTop;
    }

    public String getIsSpecialPrice() {
        return isSpecialPrice;
    }

    public void setIsSpecialPrice(String isSpecialPrice) {
        this.isSpecialPrice = isSpecialPrice;
    }

    public String getStartTimeSPrice() {
        return startTimeSPrice;
    }

    public void setStartTimeSPrice(String startTimeSPrice) {
        this.startTimeSPrice = startTimeSPrice;
    }

    public String getEndTimeSPrice() {
        return endTimeSPrice;
    }

    public void setEndTimeSPrice(String endTimeSPrice) {
        this.endTimeSPrice = endTimeSPrice;
    }

    public String getIsCanTransfer() {
        return isCanTransfer;
    }

    public void setIsCanTransfer(String isCanTransfer) {
        this.isCanTransfer = isCanTransfer;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getIsCityTop() {
        return isCityTop;
    }

    public void setIsCityTop(String isCityTop) {
        this.isCityTop = isCityTop;
    }

    public String getIsCitySpecialPrice() {
        return isCitySpecialPrice;
    }

    public void setIsCitySpecialPrice(String isCitySpecialPrice) {
        this.isCitySpecialPrice = isCitySpecialPrice;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    public String getIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(String isUpdate) {
        this.isUpdate = isUpdate;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getLj() {
        return lj;
    }

    public void setLj(String lj) {
        this.lj = lj;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getLookNum() {
        return lookNum;
    }

    public void setLookNum(int lookNum) {
        this.lookNum = lookNum;
    }
}
