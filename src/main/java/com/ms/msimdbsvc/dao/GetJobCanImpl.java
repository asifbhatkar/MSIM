package com.ms.msimdbsvc.dao;

import com.ms.msimdbsvc.errorhandler.NoSuchElementFoundException;
import com.ms.msimdbsvc.errorhandler.NojobfoundException;
import com.ms.msimdbsvc.dao.mapper.*;
import com.ms.msimdbsvc.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
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
    final String tblIMSKILL = "IM_SKILL";
    final String tblIMINT = "IM_INT";

    @Override
    public List<JobDet> getJob(String hmhrID) throws SQLException {

      if (!hmhrID.isBlank()) {
          List<JobDet> jbDetList = new ArrayList<JobDet>();

          String sql1 = "SELECT * FROM " + dboSchema + "." + tblIMJB +
                  " WHERE IM_JB_HMHR_ID = '" + hmhrID +
                  "';";

          List<Job> jbList = jdbcTemplate.query(sql1, new JobExtractor());

          for (Job job : jbList) {
              List<CanDet> canDetList = new ArrayList<CanDet>();

              List<Can> cnList = getCan(job.getJbId());

              for (Can can : cnList) {
                  List<Pnl> pnList = getPnl(can.getCanSkill());
                  CanDet canDet = new CanDet();
                  canDet.setCan(can);
                  canDet.setPnlList(pnList);
                  canDetList.add(canDet);

              }

              JobDet jbDet = new JobDet();
              jbDet.setJob(job);
              jbDet.setCanDetList(canDetList);
              jbDetList.add(jbDet);

          }

          boolean checkRes = jbDetList.isEmpty();
          if (checkRes == true)
          {
              System.out.println("No job found for HR/HM ID : " + hmhrID);
              throw new NojobfoundException("No job found for HR/HM ID : " + hmhrID);
          }
          else
          {
              return jbDetList;
          }
      }
      else
      {
          throw new NoSuchElementFoundException("Enter valid HR / HM ID");
      }
    }

    @Override
    public List<IntDet> getInt(String pnlId) throws SQLException {
        if (!pnlId.isBlank())
        {
            String sql1 = "SELECT IM_INT_CAN_ID, IM_CAN_NAME, IM_INT_ROUND, IM_INT_STATUS, IM_INT_FEEDBACK, IM_INT_TIME FROM " +
                    dboSchema + "." + tblIMINT +
                    ", " + dboSchema + "." + tblIMCAN +
                    " WHERE IM_INT_PNL_ID = '" + pnlId +
                    "' AND IM_CAN_ID = IM_INT_CAN_ID" +
                    ";";

            System.out.println(sql1);

            List<IntDet> intDetList = jdbcTemplate.query(sql1, new IntDetExtractor());
            boolean checkres1 = intDetList.isEmpty();
            if (checkres1 == true)
            {
                System.out.println("No Interviews found for given panleist : " + pnlId);
                throw new NojobfoundException("No Interview found for given panelist : " + pnlId);
            }
            else
            {
                return intDetList;
            }

        }
        else
        {
            throw new NoSuchElementFoundException("Enter valid Panelist ID");
        }
    }

    //    @Override
//    public List<Job> getJob(int hmhrID) throws SQLException {
//
//        String sql1 = "SELECT * FROM" + dboSchema + "." + tblIMJB +
//                "WHERE IM_JB_HMHR_ID = " + hmhrID +
//                ";";
//
//        return jdbcTemplate.query(sql1, new JobExtractor());
//
//    }

    @Override
    public List<Can> getCan(int jobId) throws SQLException {
        String sql1 = "SELECT * FROM " + dboSchema + "." + tblIMCAN +
                " WHERE IM_CAN_JB_ID = " + jobId +
                ";";

        return jdbcTemplate.query(sql1, new CanExtractor());

    }

    @Override
    public List<Pnl> getPnl(String skill) throws SQLException {
        String sql1 = "SELECT P.* FROM " + dboSchema + "." + tblIMSKILL +
                " S, " + dboSchema + "." + tblIMPNL +
                " P WHERE S.IM_SKILL_NAME = " + skill +
                " AND P.IM_PNL_ID = S.IM_SKILL_PNL_ID" +
                ";";

        return jdbcTemplate.query(sql1, new PnlExtractor());

    }

//    @Override
//    public List<Pnl> getPnl(String skill) throws SQLException {
//        String sql1 = "SELECT * FROM " + dboSchema + "." + tblIMPNL +
//                " WHERE IM_PNL_SKILL = '" + skill +
//                "' ;";
//
//        return jdbcTemplate.query(sql1, new PnlExtractor());
//
//    }

    @Override
    public List<CanPnl> getCanPnl(int jobId) throws SQLException {
        String sql1 = "SELECT IM_CAN_JB_ID, IM_CAN_NAME, IM_CAN_STATUS," +
                " IM_PNL_NAME, IM_PNL_TIMESLOT FROM " + dboSchema + "." + tblIMCAN +
                ", " + dboSchema + "." + tblIMPNL +
                ", " + dboSchema + "." + tblIMSKILL +
                " WHERE IM_CAN_JB_ID = " + jobId +
                " AND IM_SKILL_NAME = IM_CAN_SKILL" +
                " AND IM_PNL_ID = IM_SKILL_PNL_ID" +
                ";";

        return jdbcTemplate.query(sql1, new CanPnlExtractor());

    }

    @Override
    public List<JobCanPnl> getJobCanPnl(String hmhrId) throws SQLException {
        String sql1 = "SELECT IM_JB_ID, IM_JB_DESIG, IM_JB_MIN_EXP, IM_JB_MAX_EXP, IM_JB_POSTING_DATE, IM_JB_STATUS," +
                " IM_CAN_NAME, IM_CAN_STATUS," +
                " IM_PNL_NAME, IM_PNL_TIMESLOT FROM " + dboSchema + "." + tblIMJB +
                ", " + dboSchema + "." + tblIMCAN +
                ", " + dboSchema + "." + tblIMPNL +
                ", " + dboSchema + "." + tblIMSKILL +
                " WHERE IM_JB_HMHR_ID = '" + hmhrId +
                "' AND IM_CAN_JB_ID = IM_JB_ID" +
                " AND IM_SKILL_NAME = IM_CAN_SKILL" +
                " OR IM_PNL_ID = IM_SKILL_PNL_ID)" +
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
