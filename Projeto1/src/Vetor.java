import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetor {
	static Scanner ler=new Scanner (System.in);
	static double [] notas = new double[5];
	static int contador=1;
	//Metodo main
	public static void main(String[] args) {
		entradaDeDados();
		
	}
	//Metodo Entrada de dados
	
	public static void entradaDeDados() {
		for(  int i=0; i<notas.length; i++){
			try {
				System.out.print("Digite a "+(i+1)+"ª nota: ");
				notas[i] = ler.nextDouble();
				 media(notas);	
				contador++;
			}
			catch(InputMismatchException erro){
				System.out.println("Informe apenas numeros");
				System.exit(0);
			}
			catch(Exception erro) {
				System.out.println("Erro nao indentificado");
				System.exit(0);
			}
					
	    }
		
	}
	//Metodo media
	public static void media( double [] notas) {
		double soma=0;
		for(int i=0; i<notas.length;i++) {
			soma=soma+notas[i];
		}
		double media=soma/notas.length;
		
		if(contador==notas.length) {
			System.out.println("Media: "+media);
		}
	}
}
