package com.hotel.util;

import java.util.ArrayList;
import java.util.List;

import com.hotel.model.HabitacionModel;

public class HabitacionUtil {

	private static List <HabitacionModel> listado= new ArrayList <>();
		public HabitacionUtil() {
			// TODO Auto-generated constructor stub
		}
		public static List<HabitacionModel> getListado() {
			return listado;
		}
		public static void setListado(List<HabitacionModel> listado) {
			HabitacionUtil.listado = listado;
		}
	}
	