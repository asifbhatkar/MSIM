package com.ms.msimdbsvc.models;

public class JobCanPnl {
    private int jbId;
    private String jbDesig;
    private int jbMinExp;
    private int jbMaxExp;
    private String jbPostDate;
    private String jbStatus;
    private String canName;
    private String canStatus;
    private String pnlName;
    private String pnlTimeSlot;

    @Override
    public String toString() {
        return "JobCanPnl{" +
                "jbId=" + jbId +
                ", jbDesig='" + jbDesig + '\'' +
                ", jbMinExp=" + jbMinExp +
                ", jbMaxExp=" + jbMaxExp +
                ", jbPostDate='" + jbPostDate + '\'' +
                ", jbStatus='" + jbStatus + '\'' +
                ", canName='" + canName + '\'' +
                ", canStatus='" + canStatus + '\'' +
                ", pnlName='" + pnlName + '\'' +
                ", pnlTimeSlot='" + pnlTimeSlot + '\'' +
                '}';
    }

    public int getJbId() {
        return jbId;
    }

    public void setJbId(int jbId) {
        this.jbId = jbId;
    }

    public String getJbDesig() {
        return jbDesig;
    }

    public void setJbDesig(String jbDesig) {
        this.jbDesig = jbDesig;
    }

    public int getJbMinExp() {
        return jbMinExp;
    }

    public void setJbMinExp(int jbMinExp) {
        this.jbMinExp = jbMinExp;
    }

    public int getJbMaxExp() {
        return jbMaxExp;
    }

    public void setJbMaxExp(int jbMaxExp) {
        this.jbMaxExp = jbMaxExp;
    }

    public String getJbPostDate() {
        return jbPostDate;
    }

    public void setJbPostDate(String jbPostDate) {
        this.jbPostDate = jbPostDate;
    }

    public String getJbStatus() {
        return jbStatus;
    }

    public void setJbStatus(String jbStatus) {
        this.jbStatus = jbStatus;
    }

    public String  getCanName() {
        return canName;
    }

    public void  setCanName(String canName) {
        this.canName = canName;
    }

    public String getCanStatus() {
        return canStatus;
    }

    public void setCanStatus(String canStatus) {
        this.canStatus = canStatus;
    }

    public String getPnlName() {
        return pnlName;
    }

    public void setPnlName(String pnlName) {
        this.pnlName = pnlName;
    }

    public String getPnlTimeSlot() {
        return pnlTimeSlot;
    }

    public void setPnlTimeSlot(String pnlTimeSlot) {
        this.pnlTimeSlot = pnlTimeSlot;
    }
}
