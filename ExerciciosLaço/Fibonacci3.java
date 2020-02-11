import javax.swing.JOptionPane;
	class Fibonacci3{
		public static void main(String[]args){
		int vezesQueUsara;
		int numero1=1;
		int numero2=1;
		int numero3=0;
		final double phi=1.618;
			while(true){
			vezesQueUsara=Integer.parseInt(JOptionPane.showInputDialog(null,"\n\t Informe a quantidade da sequencia de Fibonacci"));
				if(vezesQueUsara>0){
					break;

				}
			}
			JOptionPane.showMessageDialog(null,"\n\t 1");
			JOptionPane.showMessageDialog(null,"\n\t 1");
			for(int i=2;i<vezesQueUsara;i++){
				if(i%3==0){
					numero3=numero1+numero2;
					JOptionPane.showMessageDialog(null,"\n\t "+phi);
					numero1=numero2;
					numero2=numero3;
				}else{
					numero3=numero1+numero2;
					JOptionPane.showMessageDialog(null,"\n\t "+numero3);
					numero1=numero2;
					numero2=numero3;
				}
			}
		}
	}
