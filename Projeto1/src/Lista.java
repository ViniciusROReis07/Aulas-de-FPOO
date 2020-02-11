import java.util.ArrayList;
public class Lista {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Integer> idade = new ArrayList<Integer>();
		ArrayList<Double> notas = new ArrayList<Double>();
		
		nomes.add("Maria do Bairo");
		idade.add(27);
		notas.add(8.9);
		for(int i=0; i<nomes.size();i++) {
			System.out.println("nome: "+nomes.get(i));
			System.out.println("Idade:"+idade.get(i));
			System.out.println("Nota:"+notas.get(i));
		}
	}
}
