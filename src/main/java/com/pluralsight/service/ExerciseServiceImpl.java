package com.pluralsight.service;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Exercise;
import com.pluralsight.model.Goal;
import com.pluralsight.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Activity;
import org.springframework.transaction.annotation.Transactional;


@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

	public List<Activity> findAllActivities() {
		
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);
		
		return activities;
	}

    @Transactional
    @Override
    public Exercise save(Exercise exercise)
    {
        exercise = exerciseRepository.save(exercise);

        return exercise;
    }


}
