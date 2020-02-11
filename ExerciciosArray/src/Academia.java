
public class Academia {
	public static void main(String[] args) {
		ImcPessoa pessoa1 = new ImcPessoa();
		
		pessoa1.nome = "Dudu";
		pessoa1.peso = 70;
		pessoa1.altura = 1.60;
		
		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("Imc: " + pessoa1.calculaImc());
		
		if (pessoa1.estPessoa().equals("Pesado")) {
			System.out.println("Se cuide");
		}
			else {
				System.out.println("Esta normal");
		}
	}
}
