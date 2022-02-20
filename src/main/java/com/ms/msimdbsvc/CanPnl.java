package com.ms.msimdbsvc;



public class CanPnl {
    //    private int canId;
    private int canJbId;
    private String canName;
    //    private String canPriSkill;
//    private String canSecSkill;
//    private String canQual;
    private String canStatus;
    //    private int pnlId;
    private String pnlName;
    //    private String pnlDept;
//    private String pnlDESIG;
//    private int pnlExp;
//    private String pnlSkill;
//    private int pnlSkillExp;
//    private String pnlAvail;
    private String pnlTimeSlot;

    @Override
    public String toString() {
        return "CanPnl{" +
                "canJbId=" + canJbId +
                ", canName='" + canName + '\'' +
                ", canStatus='" + canStatus + '\'' +
                ", pnlName='" + pnlName + '\'' +
                ", pnlTimeSlot='" + pnlTimeSlot + '\'' +
                '}';
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