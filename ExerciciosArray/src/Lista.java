import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Byte> idade = new ArrayList<Byte>();
		ArrayList<Double> notas = new ArrayList<Double>();
		
		Scanner ler=new Scanner(System.in);
	 
		while(true) {
			
			System.out.print("Nome: ");
			nomes.add(ler.next());
			System.out.print("Idade: ");
			idade.add(ler.nextByte());
			System.out.print("Notas: ");
			notas.add(ler.nextDouble());
			
			System.out.print("Informe zero [0] para sair, um  [1] se deseja continuar: ");
			 
			if(ler.nextByte()==0) {
				System.out.println("Saindo...");
				break;
				
			}
			
		}
		for(int i=0; i<nomes.size();i++) {
			System.out.println("Nome: "+nomes.get(i));
			System.out.println("Idade: "+idade.get(i));
			System.out.println("Nota: "+notas.get(i));
		}	
		ler.close();
	}
 }
