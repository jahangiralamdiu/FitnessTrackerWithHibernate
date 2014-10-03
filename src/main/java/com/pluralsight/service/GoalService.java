package com.pluralsight.service;

import com.pluralsight.model.Goal;

import java.util.List;

/**
 * Created by lenovo on 02/10/2014.
 */
public interface GoalService {

    Goal save(Goal goal);

    List<Goal> findAllGoal();
}
