package com.ms.msimdbsvc;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JobExtractor implements ResultSetExtractor<List<Job>> {

    @Override
    public List<Job> extractData(ResultSet rs) throws SQLException, DataAccessException {
        List<Job> jobList = new ArrayList<Job>();

        while(rs.next()){
            Job job = new Job();
            rs.getInt("IM_JB_ID");
            rs.getInt("IM_JB_HM");
            rs.getInt("IM_JB_HR");
            rs.getString("IM_JB_DESIG");
            rs.getInt("IM_JB_MIN_EXP");
            rs.getInt("IM_JB_MAX_EXP");
            rs.getString("IM_JB_TYP");
            rs.getString("IM_JB_DEPT");
            rs.getString("IM_JB_SUB_DEPT");
            rs.getString("IM_JB_PRI_SKILL");
            rs.getString("IM_JB_SEC_SKILL");
            rs.getString("IM_JB_QUALIFICATION");
            rs.getString("IM_JB_POSTING_DATE");
            rs.getString("IM_JB_STATUS");

            jobList.add(job);
        }

        return jobList;
    }

}