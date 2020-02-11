package org.lista.lista3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Imc2 {

	public static void main(String[] args) {
			Scanner ler=new Scanner(System.in);
			
			try {
				System.out.println("Informe seu peso: ");
				double peso=ler.nextDouble();
				System.out.println("Informe sua altura: ");
				double altura=ler.nextDouble();
				
				double imc=peso/Math.pow(altura, 2);
				
				if(imc<18) {
					System.out.println("Muito abaixo do peso");
				}else if(imc>17&&imc<18.5){
						System.out.println("Abaixo do peso");
					}else if(imc>18.49&&imc<25) {
						System.out.println("Peso normal");
					}else if(imc>24.99&&imc<35) {
						System.out.println("Acima do peso");
					}else if(imc>29.99&&imc<30) {
						System.out.println("Obesidade I");
					}else if(imc>34.99&&imc<40) {
						System.out.println("ObesidadeII");
					}else {
						System.out.println("ObesidadeIII");
					}
			}catch(InputMismatchException erro) {
				 System.out.println("Informe apenas numeros");
			 }catch(Exception erro) {
				 System.out.println("Erro nao indendificado");
			 }
			
			ler.close();
			}
	}

