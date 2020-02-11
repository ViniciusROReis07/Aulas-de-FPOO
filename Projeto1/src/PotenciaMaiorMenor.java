import java.util.Scanner;
import java.util.InputMismatchException;
//Class
class PotenciaMaiorMenor{
     
	//Metodo main
	public static void main(String [] args){
		 
		 int [] numeros=new int[5];
			try{
					Scanner ler=new Scanner(System.in);
					for(int i=0; i<numeros.length;i++){
							System.out.println("Informe o "+(i+1)+ "ª numero inteiro:");
							  numeros[i]=ler.nextInt();
					 
					}
					potencia(numeros);
					
					int menor=menor(numeros);
					System.out.println("\nMenor numero da sequencia : "+menor);
					int maior=maior(numeros);
					System.out.println("Maior numero da sequencia : "+maior);
					ler.close();
			}
			catch(InputMismatchException e){
					System.out.println("Informe apenas numeros inteiros");
					System.exit(0);
			}
			catch(Exception e){
					System.out.println("Erro nao indentificado");
					System.exit(0);
			}
	}
	
	//Metodo Potencia
	public static void potencia(int [] numeros){
			for(int i=0;i<numeros.length;i++) {
			  double potencia=Math.pow(numeros[i], 2);
			  System.out.println("\nPotencia "+numeros[i]+": "+potencia);
			}
		}
	
	//Metodo Menor
    public static int menor(int [] numeros){
		int menor=numeros[0];
		for(int i=1;i<numeros.length;i++) {
			if(menor>=numeros[i]) {
				menor=numeros[i];
			}
		}
		return menor;
	}
    
    
	//Metodo Maior
    public static int maior(int [] numeros) {
		int maior=numeros[0];
		for(int i=1;i<numeros.length;i++) {
			if(maior<=numeros[i]) {
				maior=numeros[i];
			}
		}
		return maior;
    }
}