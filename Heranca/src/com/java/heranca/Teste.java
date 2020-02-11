package com.java.heranca;

public class Teste {
	public static void main(String[] args) {
		//***************Peixe*********************************
		Peixe peixe=new Peixe();
		
		peixe.setNome("Pericles");
		peixe.setPeso(2.75);
		peixe.setTipoHabitat("agua doce");
		
		System.out.println("Nome: "+peixe.getNome());
		System.out.println("Peso: "+peixe.getPeso());
		System.out.println("Tipo Habitat: "+peixe.getTipoHabitat());
		
		
		
		//*************************Getters and Setters-*******************************
		Cachorro cachorro=new Cachorro();
		
		System.out.println();
		cachorro.setNome("Zeus");
		cachorro.setPeso(5);
		cachorro.setRaca("Labrador");
		
		System.out.println("Nome: "+cachorro.getNome());
		System.out.println("Peso: "+cachorro.getPeso());
		System.out.println("Tipo Habitat: "+cachorro.getRaca());
		
		
		
	}
}
