package com.ms.msimdbsvc;

import java.util.List;

public class CanDet {

    private Can can;
    private List<Pnl> pnlList;

    @Override
    public String toString() {
        return "CanDet{" +
                "can=" + can +
                ", pnlList=" + pnlList +
                '}';
    }

    public Can getCan() {
        return can;
    }

    public void setCan(Can can) {
        this.can = can;
    }

    public List<Pnl> getPnlList() {
        return pnlList;
    }

    public void setPnlList(List<Pnl> pnlList) {
        this.pnlList = pnlList;
    }
}
