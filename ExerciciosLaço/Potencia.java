import java.util.Scanner;
	class Potencia{
		public static void main(String[]args){
			Scanner ler=new Scanner(System.in);
				System.out.println("\n\t Informe a base [Inteiro]");
					int base =ler.nextInt();
					System.out.println("\n\t Informe o expoente [Inteiro]");
					int expoente =ler.nextInt();
					int potencia = 1;

          				  if(expoente<=1){
          				    System.out.println("\n\t"+base+"^"+expoente+" :1");
           				  System.exit(0);
        				    }else{

					for( int i=1;i<expoente ;i++){
					
						potencia=potencia*base;
						System.out.println(potencia);
					}

					 }
					}
        }
		
	
