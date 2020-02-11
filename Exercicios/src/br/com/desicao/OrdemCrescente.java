package br.com.desicao;
import javax.swing.JOptionPane;

public class OrdemCrescente {
	public static void main(String[] args) {
		double valor1=Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o primeiro valor: "));
		
		double valor2=Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o segundo valor: "));
		
		double valor3=Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o terceiro numero: "));
		
		if(valor1<valor2&&valor1<valor3) {
			if(valor2<valor3) {
				JOptionPane.showMessageDialog(null,valor1+", "+valor2+", "+valor3);
			}else {
				JOptionPane.showMessageDialog(null,valor1+", "+valor3+", "+valor2);
			}
		}else if(valor2<valor1&&valor2<valor3) {
			if(valor1<valor3) {
				JOptionPane.showMessageDialog(null,valor2+", "+valor1+", "+valor3);
			}else {
				JOptionPane.showMessageDialog(null,valor2+", "+valor3+", "+valor1);
			}
		}else {
				if(valor1<valor2) {
					JOptionPane.showMessageDialog(null, valor3+","+valor1+","+valor2);
				}else {
					JOptionPane.showMessageDialog(null,valor3+", "+valor2+","+valor1);
				}
		}
		
	}
}
