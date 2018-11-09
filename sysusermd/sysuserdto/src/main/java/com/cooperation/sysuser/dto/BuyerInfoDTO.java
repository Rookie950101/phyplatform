package com.cooperation.sysuser.dto;

public class BuyerInfoDTO {

    private Long buyerid;     //普通用户id
    private Long sysuserid;    //系统id
    private String buyername;   //普通用户名称
    private String buyerphone;   //普通用户电话
    private String buyeraddr;     //普通用户地址

    public Long getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(Long buyerid) {
        this.buyerid = buyerid;
    }

    public Long getSysuserid() {
        return sysuserid;
    }

    public void setSysuserid(Long sysuserid) {
        this.sysuserid = sysuserid;
    }

    public String getBuyername() {
        return buyername;
    }

    public void setBuyername(String buyername) {
        this.buyername = buyername;
    }

    public String getBuyerphone() {
        return buyerphone;
    }

    public void setBuyerphone(String buyerphone) {
        this.buyerphone = buyerphone;
    }

    public String getBuyeraddr() {
        return buyeraddr;
    }

    public void setBuyeraddr(String buyeraddr) {
        this.buyeraddr = buyeraddr;
    }
}
