// Calculadora para teste ou exemplo de uso de métodos
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
     static Scanner ler=new Scanner(System.in);

	//Metodo Main
	public static void main(String[]args) {
		while(true) { 
		byte opcao= menu( );
		valores(opcao);
		System.out.println("\n\t Deseja continuar?");
		
		String resposta=ler.next();
		resposta=resposta.toUpperCase();
		if(resposta.equals("SIM") || resposta.equals("S") || resposta.equals("YES")|| resposta.equals("SS")) {
			
		}else {
			System.out.println("\n\t FIM");
			break;
		}
		
		}
	}
	
	//Metodo Menu
	public static byte menu() {
		byte operacao=0;
		try {
			while(true) {
			System.out.println("\n\t*** Calculadora basica*****\n");
			System.out.println("\nEscolha :\n");
			System.out.println("\t1.Soma");
			System.out.println("\t2.Subtração");
			System.out.println("\t3.Multiplicação");
			System.out.println("\t4.Divião");
			System.out.println("\n\t Informe a opcão");
		    operacao=ler.nextByte();
			if(operacao!=0 && operacao<5) {
				break;
			}
		}
		}
		catch(InputMismatchException erro) {
			System.out.println("\n\t Informe apenas numeros");
			System.exit(0);
		}
		catch(Exception e) {
			System.out.println("\n\t Erro");
		}
		return operacao;
	}
	//Metodo valores
	public static void valores(byte opcao) {
		double valor1=0;
		double valor2=0;
		
		try {
			while(true) {
				
				System.out.println("\n Informe o primeiro valor ");
					 valor1=ler.nextDouble();
			  
				System.out.println("\n Informe o segundo valor diferente de 0 ");
					     valor2=ler.nextDouble();
				    
				    if(valor2!=0) {
				    	break;
				    }
				    System.out.println("\n *****INFORME UM NUMERO VALIDO****");
				}
		}catch(InputMismatchException erro) {
			System.out.println("\n\t Informe apenas numeros");
			System.exit(0);
		}
		catch(Exception e) {
			System.out.println("\n\t Erro");
		}
		
		    if(opcao==1) {
		    	soma(valor1,valor2);
		    		
		    }else {
		    	if(opcao==2) {
		    		subtracao(valor1,valor2);
		    		
		    	}else {
		    		if(opcao==3) {
		    			multiplicacao(valor1,valor2);
		    				
		    		}else {
		    			if(opcao==4) {
		    				
		    				divisao(valor1,valor2);
		    				
		    			}else {
		    				System.out.println("*** OPÇÃO DE OPERAÇÃO MATEMATICA INVALIDA***");
		    			}
		    		}
		    		
		    	}
		    }
		    
	}
	
	//Metodo Soma
	public static void soma(double valor1, double valor2) {
		System.out.println(valor1+" + "+valor2+" = "+(valor1+valor2));
	}
	
	// Metodo Subtração
	public static void subtracao(double valor1 , double valor2) {
		System.out.println(valor1+" - "+valor2+" = "+(valor1-valor2));
	}
	
	//Metodo Multiplicacao
	public static void multiplicacao(double valor1 ,double valor2) {
		System.out.println(valor1+" x "+valor2+" ="+(valor1*valor2));
	}
	
	//Metodo Divisão
	public static void divisao(double valor1 , double valor2) {
		
		System.out.println(valor1+" / "+valor2+"="+(valor1/valor2));
	}
}
