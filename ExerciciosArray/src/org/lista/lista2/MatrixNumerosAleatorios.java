package org.lista.lista2;
import java.util.Random;

public class MatrixNumerosAleatorios {

	public static void main(String[] args) {
		Random numeros=new Random();
		int ordem=4;
		
		double [] [] matriz=new double[ordem][ordem]; 

		for(int i=0 ;i<matriz.length;i++ ) {
			for(int j=0;j<matriz[0].length;j++) {
				matriz[i][j] =numeros.nextDouble();
			}
		}
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				System.out.println("Numeros:  "+matriz[i][j]);
			}
		}
		
	}

}
