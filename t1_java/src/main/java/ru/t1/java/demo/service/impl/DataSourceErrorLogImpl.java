package ru.t1.java.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.t1.java.demo.model.DataSourceErrorLog;
import ru.t1.java.demo.model.TimeLimitExceedLog;
import ru.t1.java.demo.repository.DataSourceErrorLogRepository;
import ru.t1.java.demo.service.DataSourceErorLogService;

import java.util.List;

@Service
public class DataSourceErrorLogImpl implements DataSourceErorLogService {

    @Autowired
    private DataSourceErrorLogRepository dataSourceErrorLogRepository;

    public void saveLog(DataSourceErrorLog dataSourceErrorLog) {
        dataSourceErrorLogRepository.save(dataSourceErrorLog);
    }


     public List<DataSourceErrorLog> getAllLogs() {
        return dataSourceErrorLogRepository.findAll();
    }



}
