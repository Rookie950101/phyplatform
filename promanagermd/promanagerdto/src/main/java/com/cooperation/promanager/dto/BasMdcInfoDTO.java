package com.cooperation.promanager.dto;

public class BasMdcInfoDTO {

    private String mdcname;

    private Long procateid;

    private String aproid;

    private Long probandid;

    public String getMdcname() {
        return mdcname;
    }

    public void setMdcname(String mdcname) {
        this.mdcname = mdcname;
    }

    public Long getProcateid() {
        return procateid;
    }

    public void setProcateid(Long procateid) {
        this.procateid = procateid;
    }

    public String getAproid() {
        return aproid;
    }

    public void setAproid(String aproid) {
        this.aproid = aproid;
    }

    public Long getProbandid() {
        return probandid;
    }

    public void setProbandid(Long probandid) {
        this.probandid = probandid;
    }
}
