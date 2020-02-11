package br.com.abc;
import java.util.Scanner;

public class Academia2 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		System.out.println("Informe seu nome: ");
		String nome=ler.nextLine();
		
		
		ImcPessoa2 pessoa1= new ImcPessoa2(nome, 5 , 8 , 2003);
		pessoa1.setPeso(70);
		pessoa1.setAltura(1.75);
		
		System.out.println("Nome: "+pessoa1.getNome());
		System.out.println("Peso: "+pessoa1.getPeso());
		System.out.println("Altura: "+pessoa1.getAltura());
		System.out.println("Data de Nascimento: "+pessoa1.getDiaNascimento()+"/"+pessoa1.getMesNascimento()+"/"+pessoa1.getAnoNascismento());

		if(pessoa1.estadoPessoa()) {
			System.out.println("Peso ok");
		}else {
			System.out.println("Ta gordo");
		} 
		ler.close();
	}
}
