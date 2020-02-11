package com.pets.petshop;

public class Cachorro extends Animal{

	private String raca;
	//*******************************************************Getters and Setters*************************************************************************
	void setRaca(String raca) {
		this.raca=raca;
	}
	String getRaca() {
	  return this.raca;	
	}
	//****************************************************Metodos********************************************************************************************
	void latido() {
		System.out.println("Au Au Au ");
	}
}
