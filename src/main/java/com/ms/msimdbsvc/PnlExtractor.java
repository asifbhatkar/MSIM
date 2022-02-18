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
            Pnl Pnl = new Pnl();
            rs.getInt("IM_PNL_ID");
            rs.getString("IM_PNL_NAME");
            rs.getString("IM_PNL_DEPT");
            rs.getString("IM_PNL_Desig");
            rs.getInt("IM_PNL_EXP");
            rs.getString("IM_PNL_SKILL");
            rs.getInt("IM_PNL_SKILL_EXP");
            rs.getString("IM_PNL_AVAIL");
            rs.getString("IM_PNL_TIMESLOT");

            pnlList.add(Pnl);
        }

        return pnlList;
    }
}
