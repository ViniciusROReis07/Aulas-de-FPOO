import java.util.Scanner;
class Imc{
	public static void main (String[]args){
	Scanner ler=new Scanner (System.in);
	
		System.out.println("\n\t Informe seu peso");
			double peso=ler.nextDouble();
		System.out.println("\n\t Informe sua altura");
			double altura=ler.nextDouble();
			
			double imc=peso/(Math.pow(altura,2));
			
				if(imc<17){
					System.out.println("\n\tMuito abaixo do peso");
				}else{
					if((imc>17)&&(imc<18.5)){
						System.out.println("\n\t Abaixo do peso");
					}else{
						if((imc>18.49)&&(imc<25)){
							System.out.println("\n\t Peso ok");
						}else{
							if((imc>24.99)&&(imc<30)){
								System.out.println("\n\t acima do peso");
							}else{
								if((imc>29.99)&&(imc<35)){
									System.out.println("\n\t Obesidade I");
								}else{
									if((imc>34.99)&&(imc<40)){
										System.out.println("\n\t Obesidade II (Severa)");
									}else{
										System.out.println("\n\t Obesidade III (Mórbida)");
									}
								}
									
							}
						}
					}
				}
	}
}