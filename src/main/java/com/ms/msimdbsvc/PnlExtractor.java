package com.ms.msimdbsvc;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PnlExtractor implements ResultSetExtractor<List<Pnl>> {

    @Override
    public List<Pnl> extractData(ResultSet rs) throws SQLException, DataAccessException {
        List<Pnl> pnlList = new ArrayList<Pnl>();

        while(rs.next()){
            Pnl pnl = new Pnl();
            pnl.setPnlId(rs.getInt("IM_PNL_ID"));
            pnl.setPnlName(rs.getString("IM_PNL_NAME"));
            pnl.setPnlDept(rs.getString("IM_PNL_DEPT"));
            pnl.setPnlDESIG(rs.getString("IM_PNL_Desig"));
            pnl.setPnlExp(rs.getInt("IM_PNL_EXP"));
            pnl.setPnlSkill(rs.getString("IM_PNL_SKILL"));
            pnl.setPnlSkillExp(rs.getInt("IM_PNL_SKILL_EXP"));
            pnl.setPnlAvail(rs.getString("IM_PNL_AVAIL"));
            pnl.setPnlTimeSlot(rs.getString("IM_PNL_TIMESLOT"));

            pnlList.add(pnl);
        }

        return pnlList;
    }
}
