package com.pluralsight.repository;

import com.pluralsight.model.Exercise;
import com.pluralsight.model.Goal;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by lenovo on 03/10/2014.
 */
@Repository("exerciseRepository")
public class ExerciseRepositoryImpl implements ExerciseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Exercise save(Exercise exercise)
    {
        entityManager.persist(exercise);
        entityManager.flush();

        return exercise;
    }
}
