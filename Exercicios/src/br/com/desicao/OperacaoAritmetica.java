package br.com.desicao;
import javax.swing.JOptionPane;

public class OperacaoAritmetica {
	public static void main(String[] args) {
		double valor1=Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o primeiro valor: "));
		
		double valor2=Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o segundo numero"));
		
		String operacao=JOptionPane.showInputDialog(null,"Informe a operacao que deseja utilizar");
		
		if(operacao.equals("Soma")) {
			JOptionPane.showInputDialog(null,"Soma: "+(valor1+valor2));
		}else if(operacao.equals("Subtracao")) {
			
		}
		
		
	}
	
}
