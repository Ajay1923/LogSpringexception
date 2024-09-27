package com.crud.demo.service;

import com.crud.demo.model.StatisticsFinal;
import com.crud.demo.repository.StatisticsFinalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class StatisticsFinalService {

    @Autowired
    private StatisticsFinalRepository statisticsFinalRepository;

    public void saveStatistics(
            Long userId,
            String uploadedFileName,
            String resultingFileName,
            int accessExceptionCount,
            int cloudClientExceptionCount,
            int invalidFormatExceptionCount,
            int nullPointerExceptionCount,
            int schedulerExceptionCount,
            int superCsvExceptionCount,
            String logCodes) {
        
        StatisticsFinal stats = new StatisticsFinal();
        stats.setUserId(userId); 
        stats.setTimestamp(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        stats.setUploadedFileName(uploadedFileName);
        stats.setResultingFileName(resultingFileName);
        stats.setLogCodes(logCodes);

        stats.setAccessExceptionCount(accessExceptionCount);
        stats.setCloudClientExceptionCount(cloudClientExceptionCount);
        stats.setInvalidFormatExceptionCount(invalidFormatExceptionCount);
        stats.setNullPointerExceptionCount(nullPointerExceptionCount);
        stats.setSchedulerExceptionCount(schedulerExceptionCount);
        stats.setSuperCsvExceptionCount(superCsvExceptionCount);

        statisticsFinalRepository.save(stats);
    }

    public List<StatisticsFinal> getAllStatistics() {
        return statisticsFinalRepository.findAll();
    }
}
