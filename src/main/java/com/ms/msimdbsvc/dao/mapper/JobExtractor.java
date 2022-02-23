package com.ms.msimdbsvc.dao.mapper;

import com.ms.msimdbsvc.models.Job;
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
            job.setJbId(rs.getInt("IM_JB_ID"));
            job.setJbHmHrId(rs.getString("IM_JB_HMHR_ID"));
            job.setJbHrName(rs.getString("IM_JB_HR_NAME"));
            job.setJbHmName(rs.getString("IM_JB_HM_NAME"));
            job.setJbDesig(rs.getString("IM_JB_DESIG"));
            job.setJbMinExp(rs.getInt("IM_JB_MIN_EXP"));
            job.setJbMaxExp(rs.getInt("IM_JB_MAX_EXP"));
            job.setJbTyp(rs.getString("IM_JB_TYPE"));
            job.setJbDept(rs.getString("IM_JB_DEPT"));
            job.setJbSubDept(rs.getString("IM_JB_SUB_DEPT"));
            job.setJbSkill(rs.getString("IM_JB_SKILL"));
            job.setJbQual(rs.getString("IM_JB_QUALIFICATION"));
            job.setJbPostDate(rs.getString("IM_JB_POSTING_DATE"));
            job.setJbStatus(rs.getString("IM_JB_STATUS"));
            job.setJbDir(rs.getString("IM_JB_DIR"));

            jobList.add(job);
        }

        return jobList;
    }

}