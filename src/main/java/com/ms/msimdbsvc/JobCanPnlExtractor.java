package com.ms.msimdbsvc;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JobCanPnlExtractor implements ResultSetExtractor<List<JobCanPnl>> {

    @Override
    public List<JobCanPnl> extractData(ResultSet rs) throws SQLException, DataAccessException {
        List<JobCanPnl> jobCanPnlList = new ArrayList<JobCanPnl>();

        while(rs.next()){
            JobCanPnl jobcanpnl = new JobCanPnl();
            jobcanpnl.setJbId(rs.getInt("IM_JB_ID"));
            jobcanpnl.setJbDesig(rs.getString("IM_JB_DESIG"));
            jobcanpnl.setJbMinExp(rs.getInt("IM_JB_MIN_EXP"));
            jobcanpnl.setJbMaxExp(rs.getInt("IM_JB_MAX_EXP"));
            jobcanpnl.setJbPostDate(rs.getString("IM_JB_POSTING_DATE"));
            jobcanpnl.setJbStatus(rs.getString("IM_JB_STATUS"));
            jobcanpnl. setCanName(rs.getString("IM_CAN_NAME"));
            jobcanpnl.setCanStatus(rs.getString("IM_CAN_STATUS"));
            jobcanpnl.setPnlName(rs.getString("IM_PNL_NAME"));
            jobcanpnl.setPnlTimeSlot(rs.getString("IM_PNL_TIMESLOT"));

            jobCanPnlList.add(jobcanpnl);
        }

        return jobCanPnlList;
    }
}
