package org.lista.lista3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MaiorMenor {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		
		try {
			System.out.print("Informe o primeiro valor: ");
			double valor1=ler.nextDouble();
			System.out.print("Informe o segundo valor: ");
			double valor2=ler.nextDouble();
			
			if(valor1>valor2) {
				System.out.println("O primeiro é maior");
			}else {
				if(valor1==valor2) {
					System.out.println("Primeiro valor e o segundo sao iguais");
				}else {
					System.out.println("O segundo é maior");
				}
			}
		}catch(InputMismatchException erro) {
			System.out.println("Informe apenas numeros");
		}catch(Exception erro) {
			System.out.println("Erro nao indendificado");
		}
		
		ler.close();
	}
}
