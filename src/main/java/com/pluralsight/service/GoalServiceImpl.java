package com.pluralsight.service;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import com.pluralsight.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lenovo on 02/10/2014.
 */
@Service("goalService")
public class GoalServiceImpl implements GoalService {

    @Autowired
    private GoalRepository goalRepository;

    @Transactional
    @Override
    public Goal save(Goal goal) {
        return goalRepository.save(goal);
    }

    @Transactional
    @Override
    public List<Goal> findAllGoal()
    {
        return goalRepository.findAllGoal();
    }

    @Override
    public List<GoalReport> findAllGoalReports() {
        return goalRepository.findAllGoalReports();
    }
}
