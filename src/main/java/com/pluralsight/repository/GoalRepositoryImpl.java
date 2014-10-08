package com.pluralsight.repository;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by lenovo on 02/10/2014.
 */
@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public Goal save(Goal goal)
    {
        entityManager.persist(goal);
        entityManager.flush();
        return goal;
    }

    @Override
    public List<Goal> findAllGoal()
    {
        Query query = entityManager.createQuery("SELECT g from Goal g");

        List<Goal> goals = query.getResultList();

        return goals;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<GoalReport> findAllGoalReports()
    {

        Query query = entityManager.createQuery("SELECT new com.pluralsight.model.GoalReport(g.minutes, e.minutes, e.activity) from Goal g, Exercise e where g.id=e.goal.id)");

        List<GoalReport> goalReports = query.getResultList();

        return goalReports;

    }
}
