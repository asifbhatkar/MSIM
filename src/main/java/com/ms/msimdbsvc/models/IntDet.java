package com.ms.msimdbsvc.models;

import java.sql.Timestamp;

public class IntDet {

    private int intCanId;
    private String intCanName;
    private String intRound;
    private String intStatus;
    private String intFeedback;
    private Timestamp intTime;

    public int getIntCanId() {
        return intCanId;
    }

    public void setIntCanId(int intCanId) {
        this.intCanId = intCanId;
    }

    public String getIntCanName() {
        return intCanName;
    }

    public void setIntCanName(String intCanName) {
        this.intCanName = intCanName;
    }

    public String getIntRound() {
        return intRound;
    }

    public void setIntRound(String intRound) {
        this.intRound = intRound;
    }

    public String getIntStatus() {
        return intStatus;
    }

    public void setIntStatus(String intStatus) {
        this.intStatus = intStatus;
    }

    public String getIntFeedback() {
        return intFeedback;
    }

    public void setIntFeedback(String intFeedback) {
        this.intFeedback = intFeedback;
    }

    public Timestamp getIntTime() {
        return intTime;
    }

    public void setIntTime(Timestamp intTime) {
        this.intTime = intTime;
    }

    @Override
    public String toString() {
        return "IntDet{" +
                "intCanId=" + intCanId +
                ", intCanName='" + intCanName + '\'' +
                ", intRound=" + intRound +
                ", intStatus='" + intStatus + '\'' +
                ", intFeedback='" + intFeedback + '\'' +
                ", intTime=" + intTime +
                '}';
    }
}
