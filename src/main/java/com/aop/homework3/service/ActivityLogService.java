package com.aop.homework3.service;


import com.aop.homework3.models.ActivityLog;

import java.util.List;

public interface ActivityLogService {
    ActivityLog getById(int id);

    List<ActivityLog> getAll();

    void delete(int id);

    void save(ActivityLog p);
}
