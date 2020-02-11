package br.com.abc;

public class Basica {
	private double numero1;
	private double numero2;
	
	public double getNumero1() {
		return numero1;
	}
	
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	
	public double getNumero2() {
		return numero2;
	}
	
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	
	//**********************************************************************************************************************************************************
	
	public double soma() {
		return numero1+numero2;
	}
	
	public double subtracao() {
		return numero1-numero2;
	}
	
	public double multiplicacao() {
		return numero1*numero2;
	}
	
	public double divisao() {
		if(numero2==0) {
			return 0;
		}
		return numero1/numero2;
	}
}
