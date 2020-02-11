// Para perguntar para o usuario se deseja repetir o programa
import java.util.Scanner;
class ParOuImparLaco{
	public static void main(String[]args){
		Scanner ler=new Scanner(System.in);
		 int base=0;
		 int repedicao=0;
				
			while(base<=10){
				
				if(repedicao==0){
					System.out.println("\n\t Informe um numero inteiro");
					int numero=ler.nextInt();
						int modulo=numero % 2;
							
							if(modulo==0){
								System.out.println("\n\t Este numero e par");
							}else{
								System.out.println("\n\t Este numero e impar");
							}
				}else{
						System.out.println("\n\t Deseja Continuar?");
							String resposta=ler.next();
							
					if(resposta.equals("sim")){
						System.out.println("\n\t Informe um numero inteiro");
					int numero=ler.nextInt();
						int modulo=numero%2;
							
							
							if(modulo==0){
								System.out.println("\n\t Este numero e par");
							}else{
								System.out.println("\n\t Este numero e impar");
							}
					}else{
						if(resposta.equals("nao")){
				
						System.exit(0);
						}
					}
			}
			repedicao=repedicao+1;
	}
  }	
}
	

				