package com.ms.msimdbsvc.models;

public class ErrorObj {

    private int errCode;
    private String errMsg;
    private long errTs;

    public ErrorObj(int errCode, String errMsg, long errTs) {
        this.errCode = errCode;
        this.errMsg = errMsg;
        this.errTs = errTs;
    }

    @Override
    public String toString() {
        return "ErrorObj{" +
                "errCode=" + errCode +
                ", errMsg='" + errMsg + '\'' +
                ", errTs=" + errTs +
                '}';
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public long getErrTs() {
        return errTs;
    }

    public void setErrTs(long errTs) {
        this.errTs = errTs;
    }
}
