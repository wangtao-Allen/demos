package com.example.domain;

/**
 * 用户信息
 */
public class UserInfo {
    // 用户的标识
    private String openId;

    // 关注状态（1是关注，0是未关注），未关注时获取不到其余信息
    private int subscribe;

    // 用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间
    private int subscribetime;

    // 昵称
    private String nickname;

    // 用户的性别（1是男性，2是女性，0是未知）
    private int sex;

    // 用户所在国家
    private String country;

    // 用户所在省份
    private String province;

    // 用户所在城市
    private String city;

    // 用户的语言，简体中文为zh_CN
    private String language;

    // 用户头像
    private String headimgurl;

    private String remark;

    private int groupid;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public int getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(int subscribe) {
        this.subscribe = subscribe;
    }

    public int getSubscribetime() {
        return subscribetime;
    }

    public void setSubscribetime(int subscribetime) {
        this.subscribetime = subscribetime;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getGroupid() {
        return groupid;
    }

    public void setGroupid(int groupid) {
        this.groupid = groupid;
    }
}
