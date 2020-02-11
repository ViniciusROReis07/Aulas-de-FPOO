package org.lista.lista2;
import java.util.Scanner;
public class cotacaoDolar {
	
	public static void main(String[] args) {
		Scanner ler=new Scanner (System.in);
		
		System.out.println("Informe a cotacao atual do dolar: ");
		double cotacaoHoje=ler.nextDouble();
		System.out.println("Informe o dinheiro que deseja converter: ");
		double valor=ler.nextDouble();
		
		double valorFinal=valor*cotacaoHoje;
		
		System.out.print("Conversao: "+valorFinal);
		
		ler.close();
	}
}
