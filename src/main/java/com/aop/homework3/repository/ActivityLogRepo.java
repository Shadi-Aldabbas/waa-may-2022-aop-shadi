package com.aop.homework3.repository;

import com.aop.homework3.models.ActivityLog;
import org.springframework.data.repository.CrudRepository;

public interface ActivityLogRepo extends CrudRepository<ActivityLog,Integer> {
}
