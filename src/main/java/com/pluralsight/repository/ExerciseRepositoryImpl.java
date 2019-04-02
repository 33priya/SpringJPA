package com.pluralsight.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Exercise;

//@Repository("exerciseRepository")
/*public class ExerciseRepositoryImpl implements ExerciseRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public Exercise save(Exercise exercise) {
		
		em.persist(exercise);
		
		em.flush();
		
		return exercise;
	}

}*/
