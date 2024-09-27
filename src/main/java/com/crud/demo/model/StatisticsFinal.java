package com.crud.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "statistics")
public class StatisticsFinal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;  // User ID from the users table

    private String timestamp;
    private String uploadedFileName;
    private String resultingFileName;
    private String logCodes;
    
    // New fields for exception counts
    private int accessExceptionCount;
    private int cloudClientExceptionCount;
    private int invalidFormatExceptionCount;
    private int nullPointerExceptionCount;
    private int schedulerExceptionCount;
    private int superCsvExceptionCount;

    // Getters and Setters

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getUploadedFileName() {
        return uploadedFileName;
    }

    public void setUploadedFileName(String uploadedFileName) {
        this.uploadedFileName = uploadedFileName;
    }

    public String getResultingFileName() {
        return resultingFileName;
    }

    public void setResultingFileName(String resultingFileName) {
        this.resultingFileName = resultingFileName;
    }

    public String getLogCodes() {
        return logCodes;
    }

    public void setLogCodes(String logCodes) {
        this.logCodes = logCodes;
    }

    // New getters and setters for exception counts
    public int getAccessExceptionCount() {
        return accessExceptionCount;
    }

    public void setAccessExceptionCount(int accessExceptionCount) {
        this.accessExceptionCount = accessExceptionCount;
    }

    public int getCloudClientExceptionCount() {
        return cloudClientExceptionCount;
    }

    public void setCloudClientExceptionCount(int cloudClientExceptionCount) {
        this.cloudClientExceptionCount = cloudClientExceptionCount;
    }

    public int getInvalidFormatExceptionCount() {
        return invalidFormatExceptionCount;
    }

    public void setInvalidFormatExceptionCount(int invalidFormatExceptionCount) {
        this.invalidFormatExceptionCount = invalidFormatExceptionCount;
    }

    public int getNullPointerExceptionCount() {
        return nullPointerExceptionCount;
    }

    public void setNullPointerExceptionCount(int nullPointerExceptionCount) {
        this.nullPointerExceptionCount = nullPointerExceptionCount;
    }

    public int getSchedulerExceptionCount() {
        return schedulerExceptionCount;
    }

    public void setSchedulerExceptionCount(int schedulerExceptionCount) {
        this.schedulerExceptionCount = schedulerExceptionCount;
    }

    public int getSuperCsvExceptionCount() {
        return superCsvExceptionCount;
    }

    public void setSuperCsvExceptionCount(int superCsvExceptionCount) {
        this.superCsvExceptionCount = superCsvExceptionCount;
    }
}
