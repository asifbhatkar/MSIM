package com.ms.msimdbsvc;

import java.sql.SQLException;
import java.util.List;

public interface GetJobCan {

    public List<JobDet> getJob(int hmhrId) throws SQLException;

    public List<Can> getCan(int jobId) throws SQLException;

    public List<Pnl> getPnl(String skill) throws SQLException;

    public List<CanPnl> getCanPnl(int jobId) throws SQLException;

    public List<JobCanPnl> getJobCanPnl(int hmhrId) throws SQLException;

//    public List<Can> getCan(int pnlId, int jobId) throws SQLException;

//    public List<Can> getCan(int canId) throws SQLException;

}
