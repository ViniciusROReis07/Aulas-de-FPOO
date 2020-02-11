package br.com.desicao;
import java.util.Scanner;

public class MaiorDoisUltimosSoma {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		
		System.out.print("Informe o Primeiro valor: ");
		double numero1=ler.nextDouble();
		
		System.out.print("Informe o segundo valor: ");
		double numero2=ler.nextDouble();
		
		System.out.print("Informe o terceiro valor: ");
		double numero3=ler.nextDouble();
		
		double somaDosValores=numero2+numero3;
		
		if(numero1>somaDosValores) {
			System.out.println("O valor "+numero1+" e maior que a soma dos valores "+numero2+" e "+numero3);
		}else {
			System.out.println("A soma dos valores "+numero2+" e "+numero2+", e maior que o valor  "+numero1);
		}
		
		
		
		
		ler.close();
	}
}
