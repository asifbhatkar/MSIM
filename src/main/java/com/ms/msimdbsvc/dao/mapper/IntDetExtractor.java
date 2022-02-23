package com.ms.msimdbsvc.dao.mapper;

import com.ms.msimdbsvc.models.IntDet;
import com.ms.msimdbsvc.models.JobCanPnl;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IntDetExtractor implements ResultSetExtractor<List<IntDet>> {

    @Override
    public List<IntDet> extractData(ResultSet rs) throws SQLException, DataAccessException {
        List<IntDet> intDetList = new ArrayList<IntDet>();

        while(rs.next()){
            IntDet intdet = new IntDet();
            intdet.setIntCanId(rs.getInt("IM_INT_CAN_ID"));
            intdet.setIntCanName(rs.getString("IM_CAN_NAME"));
            intdet.setIntRound(rs.getString("IM_INT_ROUND"));
            intdet.setIntStatus(rs.getString("IM_INT_STATUS"));
            intdet.setIntFeedback(rs.getString("IM_INT_FEEDBACK"));
            intdet.setIntTime(rs.getTimestamp("IM_INT_TIME"));

            intDetList.add(intdet);
        }

        return intDetList;
    }
}
