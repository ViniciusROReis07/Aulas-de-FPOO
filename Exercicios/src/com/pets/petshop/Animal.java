package com.pets.petshop;

public class Animal {

	private String especie ;
	private String sexo;
	private int idade ;
	private int membros;
	private String habitat ;
	
	//*******************************************************Getters and Setters*************************************************************************
	 void setEspecie(String especie) {
		this.especie=especie;
	}
     String getEspecie() {
		return this.especie;
	}
	
	
	 void setSexo(String sexo) {
		this.sexo=sexo;
	}
	 String getSexo() {
		return this.sexo;
	}
	
	 void setIdade(int idade) {
		this.idade=idade;
	}
	 int getIdade() {
		return this.idade;
	}
	
	void setMembros(int membros) {
		this.membros=membros;
	}
	
	int getMembros() {
		return this.membros;
	}
	
	void setHabitat(String habitat) {
		this.habitat=habitat;
	}
	String getHabitat() {
		return this.habitat;
	}
	
	//****************************************************Metodos********************************************************************************************
	
	void aniversario() {
		idade++;
		
	}
	

}
