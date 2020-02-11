// Cria uma moldura para uma frase qualquer

import java.util.Scanner;

class Moldura2 {

  static char caracter = '\u2588';

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("\nEscreva uma frase:\n");
    String texto = ler.nextLine();
      moldura(texto);

  }

  // Criar uma barra para moldura de uma frase

  public static void barra(String frase) {
    for (int i=0 ; i < frase.length()+4 ; i++) {
      System.out.print(caracter);
    }
  }
  // coloca uma moldura em uma frase.
  public static void moldura(String texto){
    System.out.println();
    barra(texto);

    System.out.println();
    System.out.println(caracter + " " + texto + " " + caracter);
    barra(texto);

    System.out.println();
  }
}
