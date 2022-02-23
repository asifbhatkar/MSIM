package com.ms.msimdbsvc.models;

import java.math.BigDecimal;

public class Pnl {
    private String pnlId;
    private String pnlName;
    private BigDecimal pnlExp;
    private String pnlDept;
    private String pnlDESIG;
    private String pnlAvail;
    private String pnlTimeSlot;

    public String getPnlId() {
        return pnlId;
    }

    public void setPnlId(String pnlId) {
        this.pnlId = pnlId;
    }

    public String getPnlName() {
        return pnlName;
    }

    public void setPnlName(String pnlName) {
        this.pnlName = pnlName;
    }

    public BigDecimal getPnlExp() {
        return pnlExp;
    }

    public void setPnlExp(BigDecimal pnlExp) {
        this.pnlExp = pnlExp;
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

    @Override
    public String toString() {
        return "Pnl{" +
                "pnlId='" + pnlId + '\'' +
                ", pnlName='" + pnlName + '\'' +
                ", pnlExp=" + pnlExp +
                ", pnlDept='" + pnlDept + '\'' +
                ", pnlDESIG='" + pnlDESIG + '\'' +
                ", pnlAvail='" + pnlAvail + '\'' +
                ", pnlTimeSlot='" + pnlTimeSlot + '\'' +
                '}';
    }
}
