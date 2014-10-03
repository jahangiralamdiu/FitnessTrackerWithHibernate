package com.pluralsight.repository;

import com.pluralsight.model.Exercise;
import com.pluralsight.model.Goal;

import java.util.List;

/**
 * Created by lenovo on 03/10/2014.
 */
public interface ExerciseRepository {
    Exercise save(Exercise exercise);
}
