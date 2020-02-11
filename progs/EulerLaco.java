import java.util.Scanner;
	class EulerLaco{
		public static void main(String[]args){
			Scanner ler=new Scanner(System.in);
			System.out.println("\n\t Quantas constatentes de Euler voce deseja saber?");
				int vezesQueUsara=ler.nextInt();
					System.out.println("\n\t informe um valor positivo");
						double numero=ler.nextInt();
			
			for( int numerosE=1; numerosE<=vezesQueUsara;numerosE++){
				
				
			
				double e=Math.pow((1+1/numero),numero);
				System.out.println(e);
				numero++;
				
		}
		
	}
}