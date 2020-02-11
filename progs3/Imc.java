import javax.swing.JOptionPane;
  class Imc{
    public static void main(String[] args) {
      double peso=Double.parseDouble(JOptionPane.showInputDialog(null,"\n\tDigite seu peso"));
			double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"\n\tDigite sua altura"));
				double imc=peso/(Math.pow(altura,2));
					if(imc<17){
						System.out.println("\n\t Muito abixo do peso");
					}else{
            if((imc>17) && (imc<18.50)){
              	System.out.println("\n\t Abixo do peso");
            }else{
              if((imc>18.49)&& (imc<25)){
                	System.out.println("\n\t Peso ok ");
              }else{
                if((imc>24.99)&&(imc<30)){
                  	System.out.println("\n\tAcima do peso");
                }else{
                  if((imc>29.99)&&(imc<35)){
                    	System.out.println("\n\t Obesidade I");
                  }else{
                    if((imc>34.99)&&(imc<40)){
                      	System.out.println("\n\t Obesidade II(Severa)");
                    }else{
                          	System.out.println("\n\t Obesidade III (Morbida)");
              }
            }
          }
		}			
	  }
    }
  }
  }