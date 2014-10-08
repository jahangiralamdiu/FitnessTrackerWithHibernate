package com.pluralsight.repository;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

import java.util.List;

/**
 * Created by lenovo on 02/10/2014.
 */
public interface GoalRepository {

    Goal save(Goal goal);

    List<Goal> findAllGoal();

    List<GoalReport> findAllGoalReports();
}
