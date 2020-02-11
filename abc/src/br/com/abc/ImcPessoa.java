package br.com.abc;

public class ImcPessoa {
	 private String nome;
	 private double peso;
	 private double altura;
	 
	 //*****************************************************************************Construtor******************************************************************************************************************************************************* 
	 public ImcPessoa(String nome) {
		 this.nome=nome;
	 }
	  
	 public ImcPessoa() {
		 
	 }
	 public ImcPessoa(String nome , double peso) {
		 this.nome=nome;
		 this.peso=peso;
	 }
	 public ImcPessoa(String nome , double peso , double altura) {
		 this.nome=nome;
		 this.peso=peso;
		 this.altura=altura;
	 }
	 public ImcPessoa(double peso , double altura) {
		 this.peso=peso;
		 this.altura=altura;
	 }
	 public ImcPessoa(double altura , String nome) {
		 this.altura=altura;
		 this.nome=nome;
	 }
	 //**************************************************************************************************Nome*****************************************************************************************************************************
	 public String getNome() {
		 return this.nome;
	 }
	 //****************************************************************************************************Peso********************************************************************************************************************************
	 public void setPeso(double peso) {
		 this.peso=peso;
	 }
	 public double getPeso() {
		 return this.peso;
	 }
	 //***********************************************************************************************************************Altura************************************************************************************************************************
	 public void setAltura(double altura) {
		 this.altura=altura;
	 }
	 public double getAltura() {
		 return this.altura;
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
