package org.lista.lista3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NegativoPositivoZero {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		try {
			System.out.print("Informe um numero: ");
			double numero=ler.nextDouble();
			
			if(numero>=0) {
					if(numero==0) {
						System.out.println("Este numero e zero");
					}else {
					System.out.println("Este numero e positivo");
				}
			}else {
				System.out.println("Este numero e negativo");
			}
		}catch(InputMismatchException e) {
			System.out.print("Informe apenas numeros");
		}catch(Exception e) {
			System.out.println("Erro nao indendificado");
		}
		
		
		
		ler.close();
	}

}
