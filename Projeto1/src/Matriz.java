
public class Matriz {
	public static void main(String[] args) {
		double valores[][]= new double [2][2];
		
		valores [0][0]= 7.8;
		valores [0][1]= 5.5;
		valores [1][0]= 9.9;
		valores [1][1]= 10.0;
		
		for(int linha=0;linha < valores.length;linha++) {
			for(int coluna=0 ; coluna < valores[0].length;coluna++) {
				System.out.print("potencia "+valores[linha][coluna]+": "+Math.pow(valores[linha][coluna], 2)+"\t");
			}
			System.out.println();
		}
		
	}
}
