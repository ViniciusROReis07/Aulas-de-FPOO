// Para descobrir a categoria no IMC//
class Imc{
	public static void main (String[]args){
		double  peso = 70;
		double altura=1.76;
		double iMC=peso/(Math.pow(altura,2));
		 System.out.println("\n\tIMC: "+iMC);
		
		if(iMC<17){
			System.out.println("\n\t Muito abaixo do peso");
		}else{
			if((iMC>17)&&(iMC<18.49)){
				System.out.println("\n\t Abaixo do Peso");
			}else{
				if((iMC>=18.5)&&(iMC<24.99)){
					System.out.println("\n\t Peso Normal");
				}else{
					if((iMC>=25)&&(iMC<29.99)){
						System.out.println("\n\t Acima do peso");
					}else{
						if((iMC>=30)&&(iMC<34.99)){
							System.out.println("\n\t Obesidade I ");
						}else{
							if((iMC>=35)&&(iMC<39.99)){
								System.out.println("\n\t Obesidade II (severa) ");
							}else{
									
								System.out.println("\n\t Obesidade III (mórbida) ");}
							}
						}
					}
				}
			}
		}
	}