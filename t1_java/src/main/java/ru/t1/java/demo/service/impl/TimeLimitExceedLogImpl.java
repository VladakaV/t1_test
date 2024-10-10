package ru.t1.java.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.t1.java.demo.model.TimeLimitExceedLog;
import ru.t1.java.demo.repository.TimeLimitExceedLogRepository;
import ru.t1.java.demo.service.TimeLimitExceedLogService;

import java.util.List;

@Service
public class TimeLimitExceedLogImpl implements TimeLimitExceedLogService {

    @Autowired
    private TimeLimitExceedLogRepository timeLimitExceedLogRepository;

    public void saveTimeLog(TimeLimitExceedLog timeLimitExceedLog) {
        timeLimitExceedLogRepository.save(timeLimitExceedLog);
    }

    public List<TimeLimitExceedLog> getAllLogs() {
        return timeLimitExceedLogRepository.findAll();
    }
}
