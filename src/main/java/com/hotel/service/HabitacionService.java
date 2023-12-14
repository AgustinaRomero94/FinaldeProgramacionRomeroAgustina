package com.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.model.HabitacionModel;
import com.hotel.repository.HabitacionRepository;

import java.util.List;

@Service
public class HabitacionService {
	   
		@Autowired
	    
		private HabitacionRepository habitacionRepository;

	    public List<HabitacionModel> listarTodasLasHabitaciones() {
	        return (List<HabitacionModel>) habitacionRepository.findAll();
	    }

	    public List<HabitacionModel> habitacionesDisponibles() {
	        return habitacionRepository.findByEstado("libre");
	    
	    }
	    public List<HabitacionModel> habitacionesDobles() {
	        return habitacionRepository.findByEstado("libre");
	        
	        	
	        }
	    public List<HabitacionModel> habitacionesPremium() {
		        return habitacionRepository.findByEstado("libre");
	}
	    public List<HabitacionModel> habitacionesListado() {
	        return habitacionRepository.findByEstado("libre");
}
}