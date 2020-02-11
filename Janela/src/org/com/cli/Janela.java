package org.com.cli;

import javax.swing.*;

public class Janela{
	
	public Janela() {
		JFrame jf=new JFrame();
		jf.setTitle("Windows");//Titulo na janela
		jf.setSize(800, 1000);//Dimensao da janela
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Para fechar a janela completamente
		jf.setResizable(true);//O alterar as dimensoes da janela
		jf.setLocationRelativeTo(null);//Para abrir a janela centralizada na tela	
		jf.setVisible(true);//Deixa a janela visivel
	
	}
	
	public static void main(String[] args) {
		new Janela();
		
		
	}
	
	
	
}
