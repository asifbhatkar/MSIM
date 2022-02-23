package com.ms.msimdbsvc.models;

public class Can {
    private int canId;
    private int canJbId;
    private String canName;
    private String canResumeDir;
    private String canSkill;
    private String canQual;
    private String canStatus;

    @Override
    public String toString() {
        return "Can{" +
                "canId=" + canId +
                ", canJbId=" + canJbId +
                ", canName='" + canName + '\'' +
                ", canResumeDir='" + canResumeDir + '\'' +
                ", canSkill='" + canSkill + '\'' +
                ", canQual='" + canQual + '\'' +
                ", canStatus='" + canStatus + '\'' +
                '}';
    }

    public int getCanId() {
        return canId;
    }

    public void setCanId(int canId) {
        this.canId = canId;
    }

    public int getCanJbId() {
        return canJbId;
    }

    public void setCanJbId(int canJbId) {
        this.canJbId = canJbId;
    }

    public String getCanName() {
        return canName;
    }

    public void setCanName(String canName) {
        this.canName = canName;
    }

    public String getCanResumeDir() {
        return canResumeDir;
    }

    public void setCanResumeDir(String canResumeDir) {
        this.canResumeDir = canResumeDir;
    }

    public String getCanSkill() {
        return canSkill;
    }

    public void setCanSkill(String canSkill) {
        this.canSkill = canSkill;
    }

    public String getCanQual() {
        return canQual;
    }

    public void setCanQual(String canQual) {
        this.canQual = canQual;
    }

    public String getCanStatus() {
        return canStatus;
    }

    public void setCanStatus(String canStatus) {
        this.canStatus = canStatus;
    }
}


