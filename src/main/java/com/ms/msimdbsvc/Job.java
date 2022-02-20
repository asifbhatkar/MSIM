package com.ms.msimdbsvc;

public class Job {

    private int jbId;
    private int jbHmHrId;
    private String jbHrName;
    private String jbHmName;
    private String jbDesig;
    private int jbMinExp;
    private int jbMaxExp;
    private String jbTyp;
    private String jbDept;
    private String jbSubDept;
    private String jbPriSkill;
    private String jbSecSkill;
    private String jbQual;
    private String jbPostDate;
    private String jbStatus;

    @Override
    public String toString() {
        return "Job{" +
                "jbId=" + jbId +
                ", jbHmHrId=" + jbHmHrId +
                ", jbHrName='" + jbHrName + '\'' +
                ", jbHmName='" + jbHmName + '\'' +
                ", jbDesig='" + jbDesig + '\'' +
                ", jbMinExp=" + jbMinExp +
                ", jbMaxExp=" + jbMaxExp +
                ", jbTyp='" + jbTyp + '\'' +
                ", jbDept='" + jbDept + '\'' +
                ", jbSubDept='" + jbSubDept + '\'' +
                ", jbPriSkill='" + jbPriSkill + '\'' +
                ", jbSecSkill='" + jbSecSkill + '\'' +
                ", jbQual='" + jbQual + '\'' +
                ", jbPostDate='" + jbPostDate + '\'' +
                ", jbStatus='" + jbStatus + '\'' +
                '}';
    }

    public int getJbId() {
        return jbId;
    }

    public void setJbId(int jbId) {
        this.jbId = jbId;
    }

    public int getJbHmHrId() {
        return jbHmHrId;
    }

    public void setJbHmHrId(int jbHmHrId) {
        this.jbHmHrId = jbHmHrId;
    }

    public String getJbHrName() {
        return jbHrName;
    }

    public void setJbHrName(String jbHrName) {
        this.jbHrName = jbHrName;
    }

    public String getJbHmName() {
        return jbHmName;
    }

    public void setJbHmName(String jbHmName) {
        this.jbHmName = jbHmName;
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

    public String getJbTyp() {
        return jbTyp;
    }

    public void setJbTyp(String jbTyp) {
        this.jbTyp = jbTyp;
    }

    public String getJbDept() {
        return jbDept;
    }

    public void setJbDept(String jbDept) {
        this.jbDept = jbDept;
    }

    public String getJbSubDept() {
        return jbSubDept;
    }

    public void setJbSubDept(String jbSubDept) {
        this.jbSubDept = jbSubDept;
    }

    public String getJbPriSkill() {
        return jbPriSkill;
    }

    public void setJbPriSkill(String jbPriSkill) {
        this.jbPriSkill = jbPriSkill;
    }

    public String getJbSecSkill() {
        return jbSecSkill;
    }

    public void setJbSecSkill(String jbSecSkill) {
        this.jbSecSkill = jbSecSkill;
    }

    public String getJbQual() {
        return jbQual;
    }

    public void setJbQual(String jbQual) {
        this.jbQual = jbQual;
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
}
