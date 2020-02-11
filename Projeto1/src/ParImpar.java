//Programa com tratamento de exeçao
import java.util.InputMismatchException;
import java.util.Scanner;

public class ParImpar {
	

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		try {
			System.out.print("Informe um numero inteiro: ");
			int numero=ler.nextInt();
			if(numero %2 ==0) {
			System.out.println(numero+"este numero e par");
		}
		else{
			System.out.println(numero+"este numro e impar");
		  }
		}
		catch(InputMismatchException erro) {
			System.out.println("\n\tops, Informe somente numeros inteiros!!!");
		}
		catch(Exception erro) {
			System.out.println("\nErro não identificado ");
		}
		ler.close();
	}
}
