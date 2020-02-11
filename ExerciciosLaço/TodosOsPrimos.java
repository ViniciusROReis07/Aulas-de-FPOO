import javax.swing.JOptionPane;
	class Primo{
		public static void main(String[]args){
			int vezesQueUsara=Integer.parseInt(JOptionPane.showInputDialog(null,"\n\t Informe um numero maior que 1"));
			int numero=2;
			int voltas=0;
			int par=0;
				if(numero<=0){
					JOptionPane.showMessageDialog(null, "\n\t NUMERO INVALIDO");
				}else{
				while(voltas<=vezesQueUsara){
				for(int i=2;i<=numero/2+1 ;i++){
					if (numero%i==0){
							par++;
					}
				}
							if(voltas<vezesQueUsara){
				JOptionPane.showMessageDialog(null, "\n\t Este e primo : "+numero);
							voltas++;
				}
			}
			numero++;
			 }
			}
			System.out.println(" ");
		}
