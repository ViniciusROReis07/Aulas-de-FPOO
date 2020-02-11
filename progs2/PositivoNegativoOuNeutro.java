import java.util.Scanner;
class PositivoNegativoOuNeutro{
	public static void main (String[]args){
		int numero=0;
		
		Scanner ler= new Scanner (System.in);
		System.out.println("\n\t Informe o numero");
		numero=ler.nextInt();
		
		if(numero>0){
			System.out.println("\n\t Este numero e positivo");
		}else{
			if(numero<0){
				System.out.println("\n\t Este numero e negativo ");
			}else{
				System.out.println("\n\t Este numero e zero ");
			}
		}
	}
	
}