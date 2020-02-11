package org.lista.lista3;
import java.util.*;


public class Conversao {
	public static void main(String[] args) {
		 Scanner ler=new Scanner(System.in);
		 
		
		
		 try {
			 System.out.println("Informe os metros: ");
			 double metro=ler.nextDouble();
			 
			 double km=metro*1000;
			 double hm=metro*100;
			 double dam=metro*10;
			 double dm=metro*0.01;
			 double cm=metro*0.001;
			 double mm=metro*0.0001;
			 
			 System.out.println("Metro: "+metro);
			 System.out.println("km: "+km);
			 System.out.println("hm: "+hm);
			 System.out.println("dam: "+dam);
			 System.out.println("dm: "+dm);
			 System.out.println("cm: "+cm);
			 System.out.println("mm: "+mm);
		 }catch(InputMismatchException erro) {
			 System.out.println("Informe apenas numeros");
		 }catch(Exception erro) {
			 System.out.println("Erro nao indendificado");
		 }
		 
		 ler.close();
	}

}
