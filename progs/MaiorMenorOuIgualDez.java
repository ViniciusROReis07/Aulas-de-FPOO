// Para saber se o numero e maior, menor ou igual a 10
class MaiorMenorOuIgualDez{
  public static void main (String[]args){
    byte numero=4;

    if(numero>10){
      System.out.println("\n O numero "+numero+" e maior que 10");
    }else{
      if(numero<10){
        System.out.println("\n O numero "+numero+" e menor que 10");
      }else{
        System.out.println("\n O numero "+numero+" e igual a 10");
      }
    }
  }
}
