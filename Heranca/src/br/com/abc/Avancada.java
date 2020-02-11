package br.com.abc;

public class Avancada extends Basica{
	public Avancada() {
		//super(); chama o construdor da class pai
		
	}
	
	public double potenciaNumero1() {
		return Math.pow(getNumero1(), 2);
	}
	
	public double potenciaNumero2() {
		return Math.pow(getNumero2(), 2);
	}
	
	public double raizNumero1() {
		return Math.sqrt(getNumero1());
	}
	public double raizNumero2() {
		return Math.sqrt(getNumero2());
	}
}
