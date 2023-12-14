package com.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.model.HabitacionModel;
import com.hotel.repository.HabitacionRepository;

@Service
public class HabitacionService {


	@Autowired
	HabitacionRepository habitacionRepository;
	
	public void guardarHabitacion (HabitacionModel habitacion) {
		habitacion.setEstado(true);
		habitacionRepository.save(habitacion);
	
 }
 
 public List<HabitacionModel> buscarTodasHabitaciones(){
	 //List<Habitacion> listado = new ArrayList<>();
	 //return listado;
	 
	 return (List<HabitacionModel>) habitacionRepository.findByEstado(true);
	 
 }
 public void modificarUnaHabitacion (HabitacionModel habitacion) {
	 
 }
}

