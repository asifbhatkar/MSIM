package com.ms.msimdbsvc;

public class Can {
    private int canId;
    private int canJbId;
    private String canName;
    private String canPriSkill;
    private String canSecSkill;
    private String canQual;
    private String canStatus;

    @Override
    public String toString() {
        return "Can{" +
                "canId=" + canId +
                ", canJbId=" + canJbId +
                ", canName='" + canName + '\'' +
                ", canPriSkill='" + canPriSkill + '\'' +
                ", canSecSkill='" + canSecSkill + '\'' +
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

    public String  getCanName() {
        return canName;
    }

    public void  setCanName(String canName) {
        canName = canName;
    }

    public String getCanPriSkill() {
        return canPriSkill;
    }

    public void setCanPriSkill(String canPriSkill) {
        this.canPriSkill = canPriSkill;
    }

    public String getCanSecSkill() {
        return canSecSkill;
    }

    public void setCanSecSkill(String canSecSkill) {
        this.canSecSkill = canSecSkill;
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


