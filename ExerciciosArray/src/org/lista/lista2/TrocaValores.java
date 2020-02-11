package org.lista.lista2;

import java.util.Scanner;

public class TrocaValores {
 public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	
	 System.out.println("Informe o primeiro valor");
	 double valor1=ler.nextDouble();
	 
	 System.out.println("Informe o segundo valor");
	 double valor2=ler.nextDouble();
	 
	 double intermediaria=0;
	 
	 intermediaria=valor1;
	 valor1=valor2;
	 valor2=intermediaria;
	 
	 System.out.println("valor1: "+valor1+ " valor2: "+valor2);
	 
	 ler.close();
  }
}
