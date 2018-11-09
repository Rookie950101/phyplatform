package com.cooperation.promanager.dto;

public class UnstdCycleDTO {

    private Long unstdid;   //回收站id

    private Long proid;     //非标准化商品id

    private String unstdproname;   //商品名

    private String probandname;    //品牌名称

    private String profacname;     //生产厂商名

    public Long getUnstdid() {
        return unstdid;
    }

    public void setUnstdid(Long unstdid) {
        this.unstdid = unstdid;
    }

    public Long getProid() {
        return proid;
    }

    public void setProid(Long proid) {
        this.proid = proid;
    }

    public String getUnstdproname() {
        return unstdproname;
    }

    public void setUnstdproname(String unstdproname) {
        this.unstdproname = unstdproname;
    }

    public String getProbandname() {
        return probandname;
    }

    public void setProbandname(String probandname) {
        this.probandname = probandname;
    }

    public String getProfacname() {
        return profacname;
    }

    public void setProfacname(String profacname) {
        this.profacname = profacname;
    }
}
