package com.itlong.whatsmars.worker.demo;

import com.itlong.whatsmars.worker.base.SimpleTaskService;
import com.itlong.whatsmars.worker.base.Task;
import com.itlong.whatsmars.worker.base.TaskDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shenhongxi on 2016/7/12.
 */
@Service("taskUnlockService")
public class TaskUnlockServiceImpl implements SimpleTaskService {

    @Autowired
    private TaskDao taskDao;

    @Override
    public boolean process(Task task) {
        try {
            return taskDao.unlock(task) > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
