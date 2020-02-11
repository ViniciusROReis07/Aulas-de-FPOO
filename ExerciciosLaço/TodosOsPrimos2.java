
// Programa que imprime numeros primos

import java.util.Scanner;

class TodosOsPrimos2 {
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
    int vezesQueUsara=0;
    while(true){
		System.out.println("\nQuantos numeros primos deseja saber ? ");
		 vezesQueUsara = ler.nextInt();
      if(vezesQueUsara>0){
        break;
      }
    }
		int voltas = 0;

		int numero = 2;

		while (voltas < vezesQueUsara){
			int metade = (numero/2);
			int divisoes = 1;

			for (int i = 1; i <= metade; i++){
				if ((numero % i) == 0){
					divisoes++;
				}
			}

			if (divisoes <= 2){
				System.out.println(" " + numero);
				voltas ++;
			}

			numero++;
		}
		System.out.print("\n");
 	}
}
