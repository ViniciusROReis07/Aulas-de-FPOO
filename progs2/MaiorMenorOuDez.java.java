import java.util.Scanner;
class MaiorMenorOuDez{
	public static void main(String[]args){
		int numero=0;
		Scanner ler=new Scanner(System.in);
		System.out.println("\n\t Informe o numero");
			numero=ler.nextInt();
			
			if(numero>10){
				System.out.println("\n\t Este numero e maior que dez");
			}else{
				if(numero<10){
					System.out.println("\n\t Este numero e menor que dez");
				}else{
					System.out.println("\n\t Este numero e dez");
				}
			}
	}
}