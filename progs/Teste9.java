class Teste9{
  public static void main(String[] args) {

    System.out.println(args[0]+" "+args[1]);

    try{
      int numero1=Integer.parseInt(args[0]);

      int numero2=Integer.parseInt(args[1]);

      int soma=numero1+numero2;
          System.out.println(soma);
    }
    catch (NumberFormatException e){
      System.out.println("\n\t Erro informeapenas numeros");

    }
  }
}
