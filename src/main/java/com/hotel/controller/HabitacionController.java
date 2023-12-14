package com.hotel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hotel.model.HabitacionModel;
import com.hotel.service.HabitacionService;

@Controller
public class HabitacionController {
	
	@Autowired
	HabitacionModel habitacion;
	
	@Autowired
	HabitacionService habitacionService;
	
	
	@GetMapping ({"/index","/","/home"})	
	public ModelAndView Principal () {
		
		ModelAndView modelView= new ModelAndView ("index");
		return modelView;	
			
		}
	@PostMapping ("/cargarHabitacion")
	public ModelAndView cargarHabitacion (@ModelAttribute("habitacion") HabitacionModel habitacion) {
    // TODO guardar habitacion en una list
		//ListadoHabitacion.getListado().add(habitacion);
		//guardarBD
		
		habitacionService.guardarHabitacion(habitacion);
		
		ModelAndView modelView= new ModelAndView ("listadoHabitaciones");
	// TODO enviarListado
		//buscarBD
		modelView.addObject ("listado", habitacionService.buscarTodasHabitaciones());
		return modelView;	
}

}
