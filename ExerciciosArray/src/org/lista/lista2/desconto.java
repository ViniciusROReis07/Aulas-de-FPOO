package org.lista.lista2;
import java.util.Scanner;

public class desconto {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		
		System.out.print("Informe o valor da compra R$:");
		double compra=ler.nextDouble();
		
		System.out.print("Informe o percentual de desconto");
		double descontoPercentual=ler.nextDouble();
		
		double descontoMonetario=(compra*descontoPercentual)/100;
		
		double valorFinal=compra-descontoMonetario;
		System.out.print("Valor com desconto: R$"+valorFinal);

		ler.close();
	}

}
