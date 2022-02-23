package com.ms.msimdbsvc.dao.mapper;

import com.ms.msimdbsvc.models.Pnl;
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
            pnl.setPnlId(rs.getString("IM_PNL_ID"));
            pnl.setPnlName(rs.getString("IM_PNL_NAME"));
            pnl.setPnlExp(rs.getBigDecimal("IM_PNL_EXP"));
            pnl.setPnlDept(rs.getString("IM_PNL_DEPT"));
            pnl.setPnlDESIG(rs.getString("IM_PNL_Desig"));
            pnl.setPnlAvail(rs.getString("IM_PNL_AVAIL"));
            pnl.setPnlTimeSlot(rs.getString("IM_PNL_TIMESLOT"));

            pnlList.add(pnl);
        }

        return pnlList;
    }
}
