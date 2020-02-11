package org.lista.lista3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MaiorMenorIdade {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int idade=0;
		
		while(true) {
			try {
				System.out.print("Informe sua idade: ");
				 idade=ler.nextInt();
				if(idade>0&&idade<150) {
					break;
				}
			}catch(InputMismatchException error) {
				System.out.println("Informe apenas numeros");
				System.exit(0);
			}catch(Exception error) {
				System.out.println("Erro nao indendificado");
				System.exit(0);
			}
		}
		
		if(idade<18) {
			System.out.println("Menor");
		}else {
			System.out.println("Maior");
		}
		
		
		ler.close();
	}

}
