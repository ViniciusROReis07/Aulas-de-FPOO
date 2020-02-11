import javax.swing.JOptionPane;
	class Fibonacci2{
		public static void main(String[]args){
		int numero1=Integer.parseInt(JOptionPane.showInputDialog(null,"\n\t Informe o primeiro numero da sequencia"));
		
		int numero2=Integer.parseInt(JOptionPane.showInputDialog(null,"\n\t Informe o segundo numero da sequencia"));
		
		int vezesQueUsara=Integer.parseInt(JOptionPane.showInputDialog(null,"\n\t Quantos numero dessa sequencia deseja saber?"));
		int numero3=0;
		
		for(int i=0; i<=vezesQueUsara ;i++){
			if(i<2){
			numero3=numero1+numero2;
			JOptionPane.showMessageDialog(null,"\n\t"+numero3);
			numero1=numero2;
			numero2=numero3;
			}else{
				if(i==2){
				JOptionPane.showMessageDialog(null,"\n\t phi:1,618");
				}
				if((i>2)&&(i<=vezesQueUsara)){
					numero3=numero1+numero2;
			JOptionPane.showMessageDialog(null,"\n\t"+numero3);
			numero1=numero2;
			numero2=numero3;
				}
			}
		}
			
		}
	}