import javax.swing.JOptionPane;
	class TodosPrimos{
		public static void main(String[] args) {
			int vezesQueUsara=Integer.parseInt(JOptionPane.showInputDialog(null,"\n\t Informe a quantidade de numeros impar que deseja saber"));
			int numero=;
  		int  voltas=0;
					if(numero==0){
					JOptionPane.showMessageDialog(null, "\n\t NUMERO INVALIDO");
				}else{
					numero++;
					for(int i=2;i<numero/2+1;i++){

						if(numero%i!=0){
						voltas++;

					}else{
						if(voltas==0 ){
							for(int e=1 ;e<=vezesQueUsara ;e++ ){
									JOptionPane.showMessageDialog(null, "\n\t "+numero);
							}
						}
					}
					}
				}
		}
	}
