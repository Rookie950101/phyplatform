package com.cooperation.promanager.dto;

public class StdCycleDTO {

    private Long stdcyid;      //回收站id

    private Long stdproid;      //标准化商品id

    private String prostdname;    //规格名称

    private String proname;       //商品名

    private String probandname;    //品牌名称

    public Long getStdcyid() {
        return stdcyid;
    }

    public void setStdcyid(Long stdcyid) {
        this.stdcyid = stdcyid;
    }

    public Long getStdproid() {
        return stdproid;
    }

    public void setStdproid(Long stdproid) {
        this.stdproid = stdproid;
    }

    public String getProstdname() {
        return prostdname;
    }

    public void setProstdname(String prostdname) {
        this.prostdname = prostdname;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getProbandname() {
        return probandname;
    }

    public void setProbandname(String probandname) {
        this.probandname = probandname;
    }
}
