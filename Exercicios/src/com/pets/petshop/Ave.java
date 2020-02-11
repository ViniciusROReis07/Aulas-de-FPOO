package com.pets.petshop;

public class Ave extends Animal {

	private String especieAve;
	
	//*******************************************************Getters and Setters*************************************************************************
	void setEspecieAves(String especie){
		this.especieAve=especie;
	}
	String getEspecieAves() {
		return this.especieAve;
	}
	//****************************************************Metodos********************************************************************************************
	
	void piu() {
		System.out.println("Piu Piu Piu");
	}
	
}
