package com.ms.msimdbsvc;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CanExtractor implements ResultSetExtractor<List<Can>> {

    @Override
    public List<Can> extractData(ResultSet rs) throws SQLException, DataAccessException {
        List<Can> canList = new ArrayList<Can>();

        while(rs.next()){
            Can can = new Can();
            rs.getInt("IM_CAN_ID");
            rs.getInt("IM_CAN_JB_ID");
            rs.getString("IM_CAN_NAME");
            rs.getString("IM_CAN_PRI_SKILL");
            rs.getString("IM_CAN_SEC_SKILL");
            rs.getString("IM_CAN_QUALIFICATION");
            rs.getString("IM_CAN_STATUS");

            canList.add(can);
        }

        return canList;
    }
}
