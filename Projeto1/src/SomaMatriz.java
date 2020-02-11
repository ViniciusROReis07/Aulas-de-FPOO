public class SomaMatriz {
	public static void main(String[] args) {
		int a [][]= {{4,0,-1}, {8,-3,2} , {-1,-4,-3} };
		int b [][]= {{5,1,-4}, {8,3,4} , {1,4,3} };
	   int c [][]= new int [3][3];
		
		somaMatriz(a , b , c);	
		exibeMatriz(a);
		exibeMatriz(b);
		exibeMatriz(c);
	}
	//Metodo somaMatriz
		public static void somaMatriz(int a[][] , int b [][] , int c [][]) {
			for(int linha=0; linha< a.length ;linha++) {
				for(int coluna=0; coluna< a.length;coluna++) {
					int soma=a[linha][coluna]+b[linha][coluna];
					c[linha][coluna]=soma;
				} 
			}
		}
		//Metodo matrizC
		public static void exibeMatriz(int matriz[][] ) {
			System.out.println();
			System.out.println("Matriz");
			for(int linha=0;linha<matriz.length;linha++) {
				for(int coluna=0; coluna<matriz[0].length;coluna++) {
					System.out.print( matriz[linha][coluna]+"\t");
				}
				System.out.println();
			}
		}
}
