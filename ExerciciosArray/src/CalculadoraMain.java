
public class CalculadoraMain {

	public static void main(String[] args) {
		Calculadora calc=new Calculadora();
		
		calc.numero1=2;
		calc.numero2=8;
		
		calc.soma();
		calc.subtracao();
		calc.divisao();
		calc.multiplicacao();
		
		calc.exibir();
	}

}
