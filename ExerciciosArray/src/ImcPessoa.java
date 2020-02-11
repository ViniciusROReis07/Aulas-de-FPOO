
public class ImcPessoa { 
 String nome;
	double peso;
	double altura;
	
	public double calculaImc () {
		return (peso / Math.pow(altura, 2));
	}
	
	public String estPessoa () {
		String estado = "";
		if (calculaImc() < 25) {
			estado = "Normal";
		}
			else {
			estado = "Pesado";
		}
		return estado;
	}
}
