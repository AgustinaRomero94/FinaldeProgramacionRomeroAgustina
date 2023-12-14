package com.hotel.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component

@Entity
public class HabitacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @Column
    private String caracteristicas;
    @Column
    private String tipo;
    @Column
    private String regularDoble;
    @Column
    private String regularTriple;
    @Column
    private String regularSimple;
    @Column
    private String premiumSimple;
    @Column
    private String premiuDoble;
    @Column
    private String premiumTriple;
    @Column
    private String camas;
    @Column
    private String estado;
    
   public HabitacionModel() {
	// TODO Auto-generated constructor stub
}

public Integer getCodigo() {
	return codigo;
}

public void setCodigo(Integer codigo) {
	this.codigo = codigo;
}

public String getCaracteristicas() {
	return caracteristicas;
}

public void setCaracteristicas(String caracteristicas) {
	this.caracteristicas = caracteristicas;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getCamas() {
	return camas;
}

public void setCamas(String camas) {
	this.camas = camas;
}

public String getEstado() {
	return estado;
}

public void setEstado(String estado) {
	this.estado = estado;
}

public String getRegularDoble() {
	return regularDoble;
}

public void setRegularDoble(String regularDoble) {
	this.regularDoble = regularDoble;
}

public String getRegularTriple() {
	return regularTriple;
}

public void setRegularTriple(String regularTriple) {
	this.regularTriple = regularTriple;
}

public String getRegularSimple() {
	return regularSimple;
}

public void setRegularSimple(String regularSimple) {
	this.regularSimple = regularSimple;
}

public String getPremiumSimple() {
	return premiumSimple;
}

public void setPremiumSimple(String premiumSimple) {
	this.premiumSimple = premiumSimple;
}

public String getPremiuDoble() {
	return premiuDoble;
}

public void setPremiuDoble(String premiuDoble) {
	this.premiuDoble = premiuDoble;
}

public String getPremiumTriple() {
	return premiumTriple;
}

public void setPremiumTriple(String premiumTriple) {
	this.premiumTriple = premiumTriple;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}
   
   
	   
   }
    
    