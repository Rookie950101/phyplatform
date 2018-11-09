package com.cooperation.weblog.service;


import com.cooperation.weblog.pojo.WebLog;

import java.util.List;

public interface WebLogService {

    public void addLog(WebLog pojo);

    public List<WebLog> findAll();
}
