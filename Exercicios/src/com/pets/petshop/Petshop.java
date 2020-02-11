package com.pets.petshop;

public class Petshop {
 public static void main(String args[]) {
	 
	 //***********************************************Objeto Ave*************************************************************************************
	 Ave ave=new Ave();
	 
	 ave.setIdade(2);
	 ave.setEspecie("Ave");
	 ave.setHabitat("Selva");
	 ave.setMembros(4);
	 ave.setSexo("Macho");
	 ave.setEspecieAves("Beija-flor");
	 
	 System.out.println("idade: "+ave.getIdade());
	 System.out.println("Especie: "+ave.getEspecie());
	 System.out.println("Habitat: "+ave.getHabitat());
	 System.out.println("Membros: "+ave.getMembros());
	 System.out.println("Sexo: "+ave.getSexo());
	 System.out.println("Especie de ave: "+ave.getEspecieAves());
	
	 ave.piu();
	 
	 //********************************************Cachorro**********************************************************
	 Cachorro cachorro=new Cachorro();
	 
	 System.out.println();
	 cachorro.setIdade(1);
	 cachorro.setEspecie("Mamifero");
	 cachorro.setHabitat("Domicilio");
	 cachorro.setMembros(4);
	 cachorro.setSexo("Femea");
	 cachorro.setRaca("Vira-Lata");
	 
	 
	 
	 System.out.println("idade: "+cachorro.getIdade());
	 System.out.println("Especie: "+cachorro.getEspecie());
	 System.out.println("Habitat: "+cachorro.getHabitat());
	 System.out.println("Membros: "+cachorro.getMembros());
	 System.out.println("Sexo: "+cachorro.getSexo());
	 System.out.println("Especie de ave: "+cachorro.getRaca());
	 cachorro.latido();
	 
 }	
 
 
}
