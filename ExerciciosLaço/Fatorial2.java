import javax.swing.JOptionPane;
class Fatorial2{
	public static void main(String[]args){
		int numero=Integer.parseInt(JOptionPane.showInputDialog(null,"\n\t Informe um numero maior que 0"));
		long fatorial=1L;
		 if(numero==0){
			 JOptionPane.showMessageDialog(null,"\n\t Fatorial : 1");
		 }else{
			 if(numero==1){
			 JOptionPane.showMessageDialog(null,"\n\t Fatorial : 1");
			 }else{
				 for(long i=2L;i<=numero;i++){
			fatorial=fatorial*i;
				JOptionPane.showMessageDialog(null,"\n\t Fatorial : "+fatorial);
		}
	
		 }
		
	}
}
}