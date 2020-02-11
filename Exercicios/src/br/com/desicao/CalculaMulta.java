package br.com.desicao;
import javax.swing.JOptionPane;

public class CalculaMulta {
	public static void main(String args[]) {
		double velocidade=Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a velocidade ultrapassada: "));
		
		if(velocidade<11) {
			JOptionPane.showMessageDialog(null,"Multa de 50 reais");
		}else if(velocidade>10&&velocidade<30) {
			JOptionPane.showMessageDialog(null,"Multa de 100 reais");
		}else{
			JOptionPane.showMessageDialog(null, "Multa de 300 reais");
		}
		
		
	}
}
