import java.util.InputMismatchException;
import java.util.Scanner;
public class InsercaoDados {
	public static void main(String[] args) {
		double arrayA[]=new double [10];
		int arrayB[]=new int[11];
		int arrayC[]=new int[10];
		double arrayD[]=new double[11];
		
		Scanner ler=new Scanner(System.in);
		
		try {
			System.out.println("Vetor A");
			for(int i=0;i<arrayA.length;i++) {
				System.out.println("\nInforme o numero : ");
				arrayA[i]=ler.nextDouble();
			}
			for(int j=0;j<arrayA.length;j++) {
				System.out.print(arrayA[j]+", ");
			}
			System.out.println("\nVetor B");
			for(int i=0;i<arrayB.length;i++) {
				System.out.println("Informe o numero : ");
				arrayB[i]=ler.nextInt();
			}
			System.out.println("Vetor C");
			for(int i=0;i<arrayC.length;i++) {
				System.out.println("Informe o numero inteiro : ");
				arrayD[i]=ler.nextInt();
			}
			System.out.println("Vetor D");
			for(int i=0;i<arrayD.length;i++) {
				System.out.println("Informe o numero : ");
				arrayD[i]=ler.nextInt();
			}
		}catch(InputMismatchException erro ){
			System.out.println("Informe apenas numeros");
		}catch(Exception erro) {
			System.out.println("erro nao identificado -");
		}
		


		ler.close();
	}
}
