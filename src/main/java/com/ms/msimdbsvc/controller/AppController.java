package com.ms.msimdbsvc.controller;

import com.ms.msimdbsvc.dao.GetJobCan;
import com.ms.msimdbsvc.errorhandler.NoSuchElementFoundException;
import com.ms.msimdbsvc.errorhandler.NojobfoundException;
import com.ms.msimdbsvc.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;


@RestController
//@ComponentScan({"com.ms.msimdbsvc"})
public class AppController {

    @Autowired
    private GetJobCan getjobcan;

    @GetMapping("/getjob")
    public List<JobDet> getjob(@RequestParam(value = "hmhrId", defaultValue = " " ) String hmhrid) throws SQLException {
//    public List<JobDet> getjob(@RequestParam(value = "hmhrId") int hmhrid) throws SQLException {
        return getjobcan.getJob(hmhrid);
    }

    @GetMapping("/getint")
    public List<IntDet> getint(@RequestParam(value = "pnlId", defaultValue = " " ) String pnlid) throws SQLException {
//    public List<JobDet> getjob(@RequestParam(value = "hmhrId") int hmhrid) throws SQLException {
        return getjobcan.getInt(pnlid);
    }


    @GetMapping("/getcan")
    public List<Can> getcan(@RequestParam(value = "jobId", defaultValue = "1" ) int jobId) throws SQLException {
        return getjobcan.getCan(jobId);
// for each candidate in the list we can call getPnl() passing pri or sec skill from candidate info.
    }

    @GetMapping("/getpnl")
    public List<Pnl> getpnl(@RequestParam(value = "skill", defaultValue = " " ) String skill) throws SQLException {
        return getjobcan.getPnl(skill);
    }

    @GetMapping("/getcanpnl")
    public List<CanPnl> getcanpnl(@RequestParam(value = "jobId", defaultValue = "1" ) int jobId) throws SQLException {
        return getjobcan.getCanPnl(jobId);
// for each candidate in the list we can call getPnl() passing pri or sec skill from candidate info.
    }

    @GetMapping("/getjobcanpnl")
    public List<JobCanPnl> getjobcanpnl(@RequestParam(value = "hmhrId", defaultValue = " " ) String hmhrId) throws SQLException {
        return getjobcan.getJobCanPnl(hmhrId);
    }

    @ExceptionHandler()
//    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorObj> handleNojobfoundException(NojobfoundException exception)
    {
        ErrorObj errObj = new ErrorObj(HttpStatus.NOT_FOUND.value(),exception.getMessage(),System.currentTimeMillis());
        return new ResponseEntity<ErrorObj>(errObj, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoSuchElementFoundException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorObj> handleNoSuchElementFoundException()
    {
        ErrorObj errObj = new ErrorObj(HttpStatus.NOT_FOUND.value(),"Enter valid HRHM ID",System.currentTimeMillis());
        return new ResponseEntity<ErrorObj>(errObj, HttpStatus.NOT_FOUND);
//        return ResponseEntity
//                .status(HttpStatus.NOT_FOUND)
//                .body(exception.getMessage());
    }

}
