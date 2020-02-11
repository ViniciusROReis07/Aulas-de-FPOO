class Main {
  public static void main(String[] args) {
    double saldo=4;
    double tarifa=4.5;

     if(saldo >= tarifa){
      saldo = saldo - tarifa;

      System.out.println("\nCatraca Liberada");
      System.out.println("\nSaldo Atual :R$"+saldo);
      } else { 
        System.out.println("\n ****SALDO INSULFICIENTE****");

     }
  }
}