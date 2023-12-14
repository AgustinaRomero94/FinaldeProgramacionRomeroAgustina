package com.hotel.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity

public class HabitacionModel {

	@Id
	private int codigoHabitacion; 
	@Column
	private int numero;
	@Column
	private boolean TipoHabitacion; // TipoHabitacion 
	@Column
	private boolean TipoCamaSimple;
	@Column
	private boolean TipoCamaDoble;
	@Column
	private boolean TipoCamaTriple;
	@Column
	private boolean estado; 		

public HabitacionModel() {
	// TODO Auto-generated constructor stub
}

public int getCodigoHabitacion() {
	return codigoHabitacion;
}

public boolean isTipoCamaDoble() {
	return TipoCamaDoble;
}

public void setTipoCamaDoble(boolean tipoCamaDoble) {
	TipoCamaDoble = tipoCamaDoble;
}

public boolean isTipoCamaTriple() {
	return TipoCamaTriple;
}

public void setTipoCamaTriple(boolean tipoCamaTriple) {
	TipoCamaTriple = tipoCamaTriple;
}

public boolean isTipoCamaSimple() {
	return TipoCamaSimple;
}

public void setCodigoHabitacion(int codigoHabitacion) {
	this.codigoHabitacion = codigoHabitacion;
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public boolean isTipoHabitacion() {
	return TipoHabitacion;
}

public void setTipoHabitacion(boolean tipoHabitacion) {
	TipoHabitacion = tipoHabitacion;
}

public boolean TipoCamaSimple() {
	return TipoCamaSimple;
}

public void setTipoCamaSimple(boolean tipoCamaSimple) {
	TipoCamaSimple = tipoCamaSimple;
}

public boolean isEstado() {
	return estado;
}

public void setEstado(boolean estado) {
	this.estado = estado;
	
}

}