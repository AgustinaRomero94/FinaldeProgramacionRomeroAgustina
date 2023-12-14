package com.hotel.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel.model.HabitacionModel;

@Repository

public interface HabitacionRepository extends CrudRepository<HabitacionModel, Integer> {
	
		public List<HabitacionModel> findByEstado (String estado);
		
		 
}
