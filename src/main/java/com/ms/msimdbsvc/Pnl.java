package com.ms.msimdbsvc;

public class Pnl {
    private int pnlId;
    private String pnlName;
    private String pnlDept;
    private String pnlDESIG;
    private int pnlExp;
    private String pnlSkill;
    private int pnlSkillExp;
    private String pnlAvail;
    private String pnlTimeSlot;

    @Override
    public String toString() {
        return "Pnl{" +
                "pnlId=" + pnlId +
                ", pnlName='" + pnlName + '\'' +
                ", pnlDept='" + pnlDept + '\'' +
                ", pnlDESIG='" + pnlDESIG + '\'' +
                ", pnlExp=" + pnlExp +
                ", pnlSkill='" + pnlSkill + '\'' +
                ", pnlSkillExp='" + pnlSkillExp + '\'' +
                ", pnlAvail='" + pnlAvail + '\'' +
                ", pnlTimeSlot='" + pnlTimeSlot + '\'' +
                '}';
    }

    public int getPnlId() {
        return pnlId;
    }

    public void setPnlId(int pnlId) {
        this.pnlId = pnlId;
    }

    public String getPnlName() {
        return pnlName;
    }

    public void setPnlName(String pnlName) {
        this.pnlName = pnlName;
    }

    public String getPnlDept() {
        return pnlDept;
    }

    public void setPnlDept(String pnlDept) {
        this.pnlDept = pnlDept;
    }

    public String getPnlDESIG() {
        return pnlDESIG;
    }

    public void setPnlDESIG(String pnlDESIG) {
        this.pnlDESIG = pnlDESIG;
    }

    public int getPnlExp() {
        return pnlExp;
    }

    public void setPnlExp(int pnlExp) {
        this.pnlExp = pnlExp;
    }

    public String getPnlSkill() {
        return pnlSkill;
    }

    public void setPnlSkill(String pnlSkill) {
        this.pnlSkill = pnlSkill;
    }

    public int getPnlSkillExp() {
        return pnlSkillExp;
    }

    public void setPnlSkillExp(int pnlSkillExp) {
        this.pnlSkillExp = pnlSkillExp;
    }

    public String getPnlAvail() {
        return pnlAvail;
    }

    public void setPnlAvail(String pnlAvail) {
        this.pnlAvail = pnlAvail;
    }

    public String getPnlTimeSlot() {
        return pnlTimeSlot;
    }

    public void setPnlTimeSlot(String pnlTimeSlot) {
        this.pnlTimeSlot = pnlTimeSlot;
    }
}
