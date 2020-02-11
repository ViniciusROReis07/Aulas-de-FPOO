package org.lista.lista3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ParOuImapar {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		
		try {
			System.out.print("Informe o valor: ");
			double valor=ler.nextDouble();
			
			if(valor%2==0) {
				System.out.println("Este numero e par");
			}else {
				System.out.println("Este numero e impar");
			}
		}catch(InputMismatchException erro) {
			System.out.println("Informe apenas numeros");
		}catch(Exception erro) {
			System.out.println("Erro nao indendificado");
		}
		
		ler.close();
	}

}
