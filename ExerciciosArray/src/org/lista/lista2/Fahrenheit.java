package org.lista.lista2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		
		Scanner ler=new Scanner(System.in);
		try {
			System.out.println("Informe os Celsius");
			double celsius=ler.nextDouble();
			
			double fahrenheit=(9*celsius+160)/5;

			System.out.println("Fahrenheit: "+fahrenheit+"º");
		}catch(InputMismatchException erro){
			System.out.println("Informe apenas numeros");
		}catch(Exception error) {
			System.out.println("Erro nao indendificado");
		}
		ler.close();
	}

}
