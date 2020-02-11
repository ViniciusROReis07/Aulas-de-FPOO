// Teste moldura
import java.util.Scanner;
class Moldura{
  public static void main(String[] args) {
    Scanner ler=new Scanner(System.in);
    System.out.print("\nInforme a frase: ");
    String texto=ler.nextLine();

    char chr='\u2588';
    System.out.println();
    for(int i=0;i<texto.length()+4; i++){
      System.out.print(chr);
      
    }
    System.out.println();
    System.out.println(chr+" "+texto+" "+chr);
    for(int i=0;i<texto.length()+4; i++){
      System.out.print(chr);

  }
}
}
