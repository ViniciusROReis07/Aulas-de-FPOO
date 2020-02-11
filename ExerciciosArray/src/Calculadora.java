
public class Calculadora {
	double numero1;
	double numero2;
	
	
	
	
	//Soma
	public double soma () {
		double soma=numero1+numero2;
		
		return soma;
	}
	//Subtracao
	public double subtracao( ) {
		double subtracao=numero1-numero2;
		
		return subtracao;
	}
	//Divisao
	public double divisao () {
		if(numero2==0) {
			System.out.println("\nErro por divisao por zero");
			return 0;
		}
		double divisao=numero1/numero2;
		
		return divisao;
	}
	//Multiplicaçao
	public double multiplicacao( ) {
		double multiplicacao=numero1*numero2;
		
		return multiplicacao;
	}
	//Exibir
	public void exibir() {
		double soma=soma( );
		double subtracao=subtracao();
		double divisao=divisao();
		double multiplicacao= multiplicacao();
		
		System.out.println("\n Soma: "+soma+"\n Subtraçao: "+subtracao+"\n Divisao: "+divisao+"\n Multiplicaçao: "+multiplicacao);
		
		
	}
	
}
