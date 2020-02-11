import java.util.Scanner;
	class Euler{
		public static void main(String[]args){
		Scanner ler=new Scanner(System.in);
		
		 System.out.println("\n\t informe um valor positivo");
			double numero=ler.nextInt();
			
				double e=Math.pow((1+1/numero),numero);
				System.out.println(e);
		}
	}