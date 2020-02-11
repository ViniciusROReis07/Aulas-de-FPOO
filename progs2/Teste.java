import java.util.Scanner;
  class Teste{
    public static void main(String[] args) {
      Scanner ler=new Scanner(System.in);
        System.out.println("\n\t Informe um numero inteiro : ");
        int numero=ler.nextInt();
          while (numero <=5){
            System.out.println(numero);
              numero++;
          }
    }
  }
