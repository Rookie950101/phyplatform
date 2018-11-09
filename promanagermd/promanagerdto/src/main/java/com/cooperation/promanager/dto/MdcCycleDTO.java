package com.cooperation.promanager.dto;

public class MdcCycleDTO {

    private Long mdccyid;   //回收站id

    private Long mdcid;     //药品id

    private String prostdname;   //规格名称

    private String mdcname;      //药品名

    private String probandname;   //品牌名称

    public Long getMdccyid() {
        return mdccyid;
    }

    public void setMdccyid(Long mdccyid) {
        this.mdccyid = mdccyid;
    }

    public Long getMdcid() {
        return mdcid;
    }

    public void setMdcid(Long mdcid) {
        this.mdcid = mdcid;
    }

    public String getProstdname() {
        return prostdname;
    }

    public void setProstdname(String prostdname) {
        this.prostdname = prostdname;
    }

    public String getMdcname() {
        return mdcname;
    }

    public void setMdcname(String mdcname) {
        this.mdcname = mdcname;
    }

    public String getProbandname() {
        return probandname;
    }

    public void setProbandname(String probandname) {
        this.probandname = probandname;
    }
}
