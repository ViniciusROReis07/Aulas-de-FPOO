package org.lista.lista3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MaiorMenorDez {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		
		try {
			System.out.print("Informe um valor: ");
			double numero=ler.nextDouble();
			
			if(numero<10) {
				System.out.println("Este numero e menor que dez");
			}else {
				if(numero==10) {
					System.out.println("Este numero e dez");
				}else {
					System.out.println("Este numero e maior que dez");
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
