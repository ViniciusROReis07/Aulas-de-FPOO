import java.util.Scanner;
class ConversaoMetros{
	public static void main (String[]args){
		Scanner ler=new Scanner(System.in);
		System.out.println("informe os Metros");
		
		double metro=ler.nextDouble();
		double km=metro/1000;
		double hm=metro/100;
		double dam=metro/10;
		double dm=metro/0.1;
		double cm=metro/0.01;
		double mm=metro/0.001;
		
		System.out.println("\n\t"+metro+" para km e igaul : "+km);
		System.out.println("\n\t"+metro+" para hm e igaul : "+hm);
		System.out.println("\n\t"+metro+" para dam e igaul : "+dam);
		System.out.println("\n\t"+metro+" para dm e igaul : "+dm);
		System.out.println("\n\t"+metro+" para cm e igaul : "+cm);
		System.out.println("\n\t"+metro+" para mm e igaul : "+mm);
	}
   }