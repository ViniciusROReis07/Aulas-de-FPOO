import javax.swing.JOptionPane;
	class Fibonacci{
		public static void main(String[]args){
		
		int vezesQueUsara=Integer.parseInt(JOptionPane.showInputDialog(null,"\n\t Quantos numero dessa sequencia deseja saber?"));
			int numero1=1;
			int numero2=1;
		
		int numero3=0;
		
		if(vezesQueUsara<=0){
				JOptionPane.showMessageDialog(null,"\n\t Informe um numero Positivo");
					System.exit(0);
		}else{
			if(vezesQueUsara==1){
				JOptionPane.showMessageDialog(null,"\n\t 1");
					System.exit(0);
			}else{
				if(vezesQueUsara==2){
					JOptionPane.showMessageDialog(null,"\n\t 1");
					JOptionPane.showMessageDialog(null,"\n\t 1");
						System.exit(0);
				}else{
					JOptionPane.showMessageDialog(null,"\n\t primeiro numero da sequencia :"+numero1);
					JOptionPane.showMessageDialog(null,"\n\t segundo numero da sequencia :"+numero2);
					for(int i=2; i<vezesQueUsara ;i++){
						numero3=numero1+numero2;
						JOptionPane.showMessageDialog(null,"\n\t"+numero3);
						numero1=numero2;
						numero2=numero3;
						
					}
						
				}
			}
		}

		
	
		}
	}