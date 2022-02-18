package com.ms.msimdbsvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@Component
public class GetJobCanImpl implements GetJobCan {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    final String dboSchema = "dbo";
    final String tblIMJB = "IM_JB";
    final String tblIMKB = "IM_KB";
    final String tblIMCAN = "IM_CAN";
    final String tblIMPNL = "IM_PNL";

    @Override
    public List<Job> getJob(int hmhrID) throws SQLException {
        String sql1 = "SELECT * FROM" + dboSchema + "." + tblIMJB +
                "WHERE IM_JB_HM = " + hmhrID +
                "OR IM_JB_HR = " + hmhrID +
                ";";

        return jdbcTemplate.query(sql1, new JobExtractor());

    }

    @Override
    public List<Can> getCan(int jobId) throws SQLException {
        String sql1 = "SELECT * FROM" + dboSchema + "." + tblIMCAN +
                "WHERE IM_CAN_JB_ID = " + jobId +
                ";";

        return jdbcTemplate.query(sql1, new CanExtractor());

    }

    @Override
    public List<Pnl> getPnl(String skill) throws SQLException {
        String sql1 = "SELECT * FROM" + dboSchema + "." + tblIMPNL +
                "WHERE IM_PNL_SKILL = " + skill +
                ";";

        return jdbcTemplate.query(sql1, new PnlExtractor());

    }

    @Override
    public List<CanPnl> getCanPnl(int jobId) throws SQLException {
        String sql1 = "SELECT IM_CAN_JB_ID, IM_CAN_NAME, IM_CAN_STATUS," +
                "IM_PNL_NAME, IM_PNL_TIMESLOT FROM" + dboSchema + "." + tblIMCAN +
                "," + dboSchema + "." + tblIMPNL +
                "WHERE IM_CAN_JB_ID = " + jobId +
                "AND (IM_CAN_PRI_SKILL = IM_CAN_SKILL" +
                " OR IM_CAN_SEC_SKILL = IM_CAN_SKILL)" +
                ";";

        return jdbcTemplate.query(sql1, new CanPnlExtractor());

    }

    @Override
    public List<JobCanPnl> getJobCanPnl(int hmhrId) throws SQLException {
        String sql1 = "SELECT IM_JB_ID, IM_JB_DESIG, IM_JB_MIN_EXP, IM_JB_MAX_EXP, IM_JB_POSTING_DATE, IM_JB_STATUS, " +
                "IM_CAN_NAME, IM_CAN_STATUS, " +
                "IM_PNL_NAME, IM_PNL_TIMESLOT FROM " + dboSchema + "." + tblIMJB +
                ", " + dboSchema + "." + tblIMCAN +
                ", " + dboSchema + "." + tblIMPNL +
                " WHERE IM_JB_HMHR_ID = " + hmhrId +
                " AND IM_CAN_JB_ID = IM_JB_ID" +
                " AND (IM_PNL_SKILL = IM_CAN_PRI_SKILL" +
                " OR IM_PNL_SKILL = IM_CAN_SEC_SKILL)" +
                ";";

        return jdbcTemplate.query(sql1, new JobCanPnlExtractor());

    }

//    @Override
//    public List<Can> getCan(int canId) throws SQLException {
//        return null;
//    }

    //    @Override
//    public List<Can> getCan(int pnlId, int jobId) throws SQLException {
//        String sql1 = "SELECT * FROM" + dboSchema + "." + tblIMCAN +
//                      "WHERE IM_CAN_JB_ID = " + jobId
//                      ";";
//
//        return jdbcTemplate.query(sql1, new CanExtractor());
//
//    }
}
