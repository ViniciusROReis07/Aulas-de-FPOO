import java.util.Scanner;
class Validacao{
	public static void main(String[]args){
		Scanner ler=new Scanner(System.in);
		
		System.out.println("\n\t Informe sua idade");
			int idade=ler.nextInt();
			
			if(idade>0){
				if(idade<151){
					if(idade>17){
						System.out.println("\n\t maior de idade ");
					}else{
						System.out.println("\n\t menor de idade");
					}
				}else{
					System.out.println("\n\t ****Idade invalida****");
				}
			}else{
					System.out.println("\n\t ****Idade invalida****");
				}
	}
}