import java.util.Scanner;
class ParOuImpar{
	public static void main (String[]args){
		int numero=0;
		
		Scanner ler=new Scanner(System.in);
			System.out.println("\n\t Informe o numero");
			numero=ler.nextInt();
				int modulo=numero%2;
					if(modulo==0){
						System.out.println("\n\t Este numero e par");
					}else{
			            System.out.println("\n\t Este numero e impar");
						}
	}
}