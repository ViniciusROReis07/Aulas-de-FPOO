package br.com.abc;

public class ImcPessoa2 {
	private String nome;
	private double peso;
	private double altura;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;
//*********************************************************************Construtor******************************************************************************
	
	public ImcPessoa2(String nome) {
		this.nome=nome;
	}
	public ImcPessoa2(String nome , int diaNascimento , int mesNascimento , int anoNascimento) {
		this.nome=nome;
		this.diaNascimento=diaNascimento;
		this.mesNascimento=mesNascimento;
		this.anoNascimento=anoNascimento;
	}
	//*************************************************************************************Getteres e Setters********************************************************************
	public String getNome() {
		
		return this.nome;
	}
	

	
	public int getDiaNascimento() {
		return this.diaNascimento;
	}
	
	
	
	public int getMesNascimento() {
		return this.mesNascimento;
	}
	
	
	
	public int getAnoNascismento() {
		return this.anoNascimento;
	}
	
	
	
	public void setAltura(double altura) {
		this.altura=altura;
	}
	
	
	
	public double getAltura() {
	   return	this.altura;
	}
	
	
	
	public void setPeso(double peso) {
		this.peso=peso;
	}
	
	
	
	public double getPeso() {
		return this.peso;
	}
	 //*************************************************************************************************************************************************Calc Imc*******************************************************************************************************************
	 public double calculaImc() {
		 return (peso/Math.pow(altura, 2));
	 } 
	 //*******************************************************************************************************************************************************Estado******************************************************************
	 public boolean estadoPessoa() {
		 boolean estado=true;
		 
		 if(calculaImc()< 25) {
			 
		 }else {
			  estado=false;
		 }
		 return estado;
	 }
}
