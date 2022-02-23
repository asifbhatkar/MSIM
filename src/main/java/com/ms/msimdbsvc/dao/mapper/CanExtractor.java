package com.ms.msimdbsvc.dao.mapper;

import com.ms.msimdbsvc.models.Can;
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
            can.setCanId(rs.getInt("IM_CAN_ID"));
            can.setCanJbId(rs.getInt("IM_CAN_JB_ID"));
            can.setCanName(rs.getString("IM_CAN_NAME"));
            can.setCanResumeDir(rs.getString("IM_CAN_RESUME_DIR"));
            can.setCanResumeDir(rs.getString("IM_CAN_SKILL"));
            can.setCanQual(rs.getString("IM_CAN_QUALIFICATION"));
            can.setCanStatus(rs.getString("IM_CAN_STATUS"));

            canList.add(can);
        }

        return canList;
    }
}
