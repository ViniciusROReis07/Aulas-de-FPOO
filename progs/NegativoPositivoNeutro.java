//Para saber se o numero e positivo , negativo ou neutro e exibir na tela
class NegativoPositivoNeutro{
  public static void main (String[]args){
    byte numero=23;
//Comando para executar Decisoes
    if (numero>0){
      System.out.println("\nO numero "+numero+" e positivo");
    }else{
      if (numero<0){
        System.out.println("\n O numero "+numero+" e negativo");
      }else{
        System.out.println("\n O numero "+numero+" e zero");
      }
    }
  }
}
