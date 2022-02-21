package com.ms.msimdbsvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;


@SpringBootApplication
@RestController
@ComponentScan({"com.ms.msimdbsvc"})
public class AppController {

    public static void main(String[] args) {
        SpringApplication.run(AppController.class, args);
    }

    @Autowired
    private GetJobCan getjobcan;

    @GetMapping("/getjob")
    public List<JobDet> getjob(@RequestParam(value = "hmhrId", defaultValue = "0" ) int hmhrid) throws SQLException {
//    public List<JobDet> getjob(@RequestParam(value = "hmhrId") int hmhrid) throws SQLException {
        return getjobcan.getJob(hmhrid);
    }

    @GetMapping("/getcan")
    public List<Can> getcan(@RequestParam(value = "jobId", defaultValue = "1" ) int jobId) throws SQLException {
        return getjobcan.getCan(jobId);
// for each candidate in the list we can call getPnl() passing pri or sec skill from candidate info.
    }

    @GetMapping("/getpnl")
    public List<Pnl> getpnl(@RequestParam(value = "skill", defaultValue = "java" ) String skill) throws SQLException {
        return getjobcan.getPnl(skill);
    }

    @GetMapping("/getcanpnl")
    public List<CanPnl> getcanpnl(@RequestParam(value = "jobId", defaultValue = "1" ) int jobId) throws SQLException {
        return getjobcan.getCanPnl(jobId);
// for each candidate in the list we can call getPnl() passing pri or sec skill from candidate info.
    }

    @GetMapping("/getjobcanpnl")
    public List<JobCanPnl> getjobcanpnl(@RequestParam(value = "hmhrId", defaultValue = "100" ) int hmhrId) throws SQLException {
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
