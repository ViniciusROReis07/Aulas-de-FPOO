package com.java.heranca;

public class Peixe extends Animal {
	//**************************************Atributos***************************************************
	private String tipoHabitat;
	
	//*******************************************Getters and Setters********************************************************
	
	void setTipoHabitat(String tipoHabitat) {
		this.tipoHabitat=tipoHabitat;
	}
	String getTipoHabitat() {
		return this.tipoHabitat;
	}
	
}
