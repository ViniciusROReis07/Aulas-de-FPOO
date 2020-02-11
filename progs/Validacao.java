class Validacao{
  public static void main(String[] args) {

    int idade=23;

    if(idade>0){
      if (idade<=150){
        if(idade>=18){
          System.out.println("\n\tMaior de idade");
        }else{
          System.out.println("\n\tMenor de idade");
        }
      }else{
        System.out.println("\n\tIDADE INVALIDA");
        
      }
    }else{
      System.out.println("\n\tIDADE INVALIDA");
    }
  }
}