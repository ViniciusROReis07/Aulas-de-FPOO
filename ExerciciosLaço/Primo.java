/*Informa se o numero e primo*/ 
import javax.swing.JOptionPane;
	class Primo{
		public static void main(String[]args){
			int numero=Integer.parseInt(JOptionPane.showInputDialog(null,"\n\t Informe um numero maior que 1 e positivo"));
		
				if(numero<=1){
					JOptionPane.showMessageDialog(null, "\n\t NUMERO INVALIDO");
				}else{
				for(int i=2;i<=numero/2+1 ;i++){
					if (numero%i==0){
					JOptionPane.showMessageDialog(null, "\n\t Este numero nao e primo");
					System.exit(0);
					}
				}
				JOptionPane.showMessageDialog(null, "\n\t Este e primo");
				}
		}
	}