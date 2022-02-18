package com.ms.msimdbsvc;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CanPnlExtractor implements ResultSetExtractor<List<CanPnl>> {

    @Override
    public List<CanPnl> extractData(ResultSet rs) throws SQLException, DataAccessException {
        List<CanPnl> canpnlList = new ArrayList<CanPnl>();
        while(rs.next()){
            CanPnl canpnl = new CanPnl();
            rs.getInt("IM_CAN_JB_ID");
            rs.getString("IM_CAN_NAME");
            rs.getString("IM_CAN_STATUS");
            rs.getString("IM_PNL_NAME");
            rs.getString("IM_PNL_TIMESLOT");

            canpnlList.add(canpnl);
        }

        return canpnlList;
    }
}
