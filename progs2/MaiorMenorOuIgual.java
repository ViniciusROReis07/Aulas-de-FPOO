import java.util.Scanner;
class MaiorMenorOuIgual{
	public static void main(String[]args){
		int numero1=0;
		int numero2=0;
		Scanner ler=new Scanner(System.in);
			System.out.println("\n\t infome o primeiro numero ");
				numero1=ler.nextInt();
			System.out.println("\n\t informe o segundo numero");
				numero2=ler.nextInt();
					
					if(numero1>numero2){
						System.out.println("\n\t O primeiro e o maior");
					}else{
						if(numero2>numero1){
						System.out.println("\n\t O segundo  e o maior");
						}else{
						System.out.println("\n\t Os dois sao iguais");
						}
					}
	}
}