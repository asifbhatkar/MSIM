package com.ms.msimdbsvc;

import java.util.List;

public class JobDet {

    private Job job;
    private List<CanDet> canDetList;

    @Override
    public String toString() {
        return "JobDet{" +
                "job=" + job +
                ", canDetList=" + canDetList +
                '}';
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public List<CanDet> getCanDetList() {
        return canDetList;
    }

    public void setCanDetList(List<CanDet> canDetList) {
        this.canDetList = canDetList;
    }
}
