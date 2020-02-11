import java.util.InputMismatchException;
import java.util.Scanner;
public class Desconto {
	static Scanner ler=new Scanner(System.in);
	public static void main(String[] args) {
		 calculo();
	}
	//calculo
	public static void calculo() {
	try {
		System.out.print("Informe o valor do produto: R$");
		double valor=ler.nextDouble();
		
		System.out.print("Informe o desconto :");
		double desconto=ler.nextDouble();
		valorPercentual(valor,desconto);
	}
	catch(InputMismatchException erro) {
		System.out.println("Informe apenas numero !!!!!");
	}
	
	}

	
	
	// Metodo valor final
	public static double valorPercentual (double valor , double desconto) {
		double descontoPorcentagem=(valor*desconto)/100;
		double descontoDinheiro=valor-descontoPorcentagem;
		System.out.print("\n\t Valor final : "+descontoDinheiro);
		return descontoDinheiro;
	}
}
