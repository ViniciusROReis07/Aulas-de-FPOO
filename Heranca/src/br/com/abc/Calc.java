package br.com.abc;
		
	public class Calc {
	
		public static void main(String[] args) {
			Basica calcBasica = new Basica();
				
				calcBasica.setNumero1(45.78);
				calcBasica.setNumero2(10.0);
				
				System.out.println(calcBasica.getNumero1()+" + "+calcBasica.getNumero2()+" = "+calcBasica.soma());
				System.out.println(calcBasica.getNumero1()+" - "+calcBasica.getNumero2()+" = "+calcBasica.subtracao());
				System.out.println(calcBasica.getNumero1()+" * "+calcBasica.getNumero2()+" = "+calcBasica.multiplicacao() );
				System.out.println(calcBasica.getNumero1()+" / "+calcBasica.getNumero2()+" = "+calcBasica.divisao());
				
				System.out.println();
				System.out.println();
				Avancada calcAvancada = new Avancada();
				
				calcAvancada.setNumero1(45.78);
				calcAvancada.setNumero2(1);
				
				System.out.println(calcAvancada.getNumero1()+" + "+calcAvancada.getNumero2()+" = "+calcAvancada.soma());
				System.out.println(calcAvancada.getNumero1()+" - "+calcAvancada.getNumero2()+" = "+calcAvancada.subtracao());
				System.out.println(calcAvancada.getNumero1()+" * "+calcAvancada.getNumero2()+" = "+calcAvancada.multiplicacao() );
				System.out.println(calcAvancada.getNumero1()+" / "+calcAvancada.getNumero2()+" = "+calcAvancada.divisao());
				System.out.println();
				System.out.println(calcAvancada.getNumero1()+" ^ 2 = "+calcAvancada.potenciaNumero1());
				System.out.println(calcAvancada.getNumero2()+" ^ 2 = "+calcAvancada.potenciaNumero2());
				System.out.println(calcAvancada.getNumero1()+" raiz = "+calcAvancada.raizNumero1());
				System.out.println(calcAvancada.getNumero2()+" raiz = "+calcAvancada.raizNumero2());
		
			}
	}
