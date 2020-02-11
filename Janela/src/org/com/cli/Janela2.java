package org.com.cli;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ColorConvertOp;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Janela2 extends JFrame implements ActionListener{
	
	Calendar calendario=Calendar.getInstance();
	
	//***************************************************************Objeto botao********************************************************************************
		JButton btnMensagem=new JButton("Mensagem");
		JButton btnSair=new JButton("Sair");
		JButton btnNovaMensagem=new JButton("Menagem 2");
		JButton btnLimParDados=new JButton("Limapar dados");
		
	//***************************************************************Objeto Label [Texto]***********************************************************************************
		JLabel lblNome=new JLabel("Nome: ");//Rotulo
		JLabel lblAnoNasc=new JLabel("Ano de Nascimento: ");
		
	//**************************************************************Objeto	Campo de texto***********************************************************************************************
		JTextField txtNome=new JTextField();//Area para insercao de dados
		JTextField txtAnoNasc=new JTextField();
		
		
		
	
	//***************************************************************Construdor*****************************************************************************************
	public Janela2() {
				btnMensagem.addActionListener(this);//Serve para indicar a classe que ira tratar o evento 
				btnSair.addActionListener(this);
				btnNovaMensagem.addActionListener(this);
				btnLimParDados.addActionListener(this);
				
			//*********************************************Botões [JButton]**********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
				setLayout(null);//Para desabilitar layout Padrao do java que é criaçao de botoes um ao lado do outro
				btnMensagem.setBounds(30, 300, 100, 30);//Localozaçao do botao no plano carteciano , e as dimensoes do botao
				btnMensagem.setBackground(Color.black);
				btnMensagem.setForeground(Color.RED);
				add(btnMensagem);
				
				btnSair.setBounds(350, 300, 100, 30);
				btnSair.setBackground(Color.black);
				btnSair.setForeground(Color.RED);
				add(btnSair);
				
				btnNovaMensagem.setBounds(200, 300, 100, 30);
				btnNovaMensagem.setBackground(Color.black);
				btnNovaMensagem.setForeground(Color.RED);
				add(btnNovaMensagem);
				
				btnLimParDados.setBounds(200, 200, 200, 30);
				btnLimParDados.setBackground(Color.black);
				btnLimParDados.setForeground(Color.RED);
				add(btnLimParDados);
				
				//***************************************************************Label [JLabel]****************************************************************************
				lblNome.setBounds(30, 20, 50, 50);
				add(lblNome);
				lblAnoNasc.setBounds(30, 50, 120, 50);
				add(lblAnoNasc);
				//****************************************************************JTextField***********************************************************************************************
				txtNome.setBounds(80, 30, 400, 30);
				add(txtNome);
				txtAnoNasc.setBounds(150, 60, 150, 30);
		        add(txtAnoNasc);	
				
				
			//**********************************************Metodo JFrame***************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
				setTitle("Windows2");
				setSize(500, 400);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				getContentPane().setBackground(Color.black);//Cor fundo a dela de inteface grafica
				setResizable(false);
				setLocationRelativeTo(null);
				setVisible(true);
	}
	
	//****************************************ActionPerformed********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
					public void actionPerformed(ActionEvent e) {
						String nome= txtNome.getText();//Metodo get Text ler o teclado na area do JTextField
						String anoNascString=txtAnoNasc.getText();
						int anoAtual=calendario.get(Calendar.YEAR);
						
						if( nome.equals("")||e.getSource()==btnSair ||e.getSource()==btnNovaMensagem ){
							if(e.getSource()==btnSair) {
								
								System.exit(0);
								
							}else if (e.getSource()==btnNovaMensagem) {
								if(anoNascString.equals("")) {
									JOptionPane.showMessageDialog(null,"Idade: "+anoAtual);
								}else {
									int anoNasc=Integer.parseInt(anoNascString);
									
									
									
									JOptionPane.showMessageDialog(null,"Idade: "+(anoAtual-anoNasc));
								}
								
							}
						}else if(e.getSource()== btnMensagem)/*getSources Determina o botao que foi acionado*/ {
								
							JOptionPane.showMessageDialog(null, "Bom dia "+nome.trim());
							
						}
					}
					
					
	//******************************************************Metodo Main**************************************************************************************************************************************************************				
					public static void main(String[] args) {
						new Janela2();
					}
					//Metodo class.toString()  converte numero para String
}
