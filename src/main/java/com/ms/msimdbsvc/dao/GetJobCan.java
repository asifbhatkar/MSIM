package com.ms.msimdbsvc.dao;

import com.ms.msimdbsvc.models.*;

import java.sql.SQLException;
import java.util.List;

public interface GetJobCan {

    public List<JobDet> getJob(String hmhrId) throws SQLException;

    public List<IntDet> getInt(String pnlId) throws SQLException;

    public List<Can> getCan(int jobId) throws SQLException;

    public List<Pnl> getPnl(String skill) throws SQLException;

    public List<CanPnl> getCanPnl(int jobId) throws SQLException;

    public List<JobCanPnl> getJobCanPnl(String hmhrId) throws SQLException;

//    public List<Can> getCan(int pnlId, int jobId) throws SQLException;

//    public List<Can> getCan(int canId) throws SQLException;

}
