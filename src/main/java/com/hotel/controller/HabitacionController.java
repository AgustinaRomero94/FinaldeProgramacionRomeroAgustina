package com.hotel.controller;
	
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.hotel.model.HabitacionModel;
import com.hotel.service.HabitacionService;

import java.util.List;

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

	
	    @GetMapping("/listar")
	    public List<HabitacionModel> listarTodasLasHabitaciones() {
	        return habitacionService.listarTodasLasHabitaciones();
	    }

	    @GetMapping("/disponibles")
	    public List<HabitacionModel> habitacionesDisponibles() {
	        return habitacionService.habitacionesDisponibles();
	    }
	    @GetMapping("/dobles")
	    public List<HabitacionModel> habitacionesDobles() {
	        return habitacionService.habitacionesDisponibles();
	   }
	    @GetMapping("/premium")
	    public List<HabitacionModel> habitacionesPremium() {
	        return habitacionService.habitacionesPremium();
	   }
	    @GetMapping("/listado")
	    public List<HabitacionModel> habitacionesListado() {
	        return habitacionService.habitacionesListado();
	   }
	    @GetMapping("/listado/volver")
		  public ModelAndView volver() {
		    // Crear el ModelAndView
		    ModelAndView modelAndView = new ModelAndView("redirect:/index");

		    return modelAndView;
	    }
		    	
	    
}
	
