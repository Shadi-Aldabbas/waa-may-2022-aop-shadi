package com.aop.homework3.service.impl;

import com.aop.homework3.models.ActivityLog;
import com.aop.homework3.repository.*;
import com.aop.homework3.service.*;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ActivityServiceImpl implements ActivityLogService {
    private final ActivityLogRepo activityLogRepo;

    @Override
    public ActivityLog getById(int id) {
        ActivityLog log = activityLogRepo.findById(id).get();
        return log;
    }

    @Override
    public void delete(int id) {
        activityLogRepo.deleteById(id);
    }

    @Override
    public List<ActivityLog> getAll() {
        var res = new ArrayList<ActivityLog>();
        activityLogRepo.findAll().forEach(res::add);
        return  res;
    }

    @Override
    public void save(ActivityLog p) {
        activityLogRepo.save(p);
    }
}
