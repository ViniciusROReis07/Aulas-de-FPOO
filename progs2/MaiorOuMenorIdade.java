import java.util.Scanner;
	class MaiorOuMenorIdade{
		public static void main(String[]args){
			Scanner ler=new Scanner(System.in);
				System.out.println("\n\t Informe sua idade");
				
			int	idade=ler.nextInt();
			if(idade>17){
				System.out.println("\n\t Maior de idade");
			}else{
				System.out.println("\n\t Menor de idade");
			}
			
		}
	}