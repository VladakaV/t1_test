package ru.t1.java.demo.service;

import ru.t1.java.demo.model.DataSourceErrorLog;
import ru.t1.java.demo.model.TimeLimitExceedLog;

public interface DataSourceErorLogService {

    public void saveLog(DataSourceErrorLog log);

}
