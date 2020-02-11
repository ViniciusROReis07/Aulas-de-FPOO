import javax.swing.JOptionPane;
  class MaiorMenorOuIgaul{
    public static void main(String[] args) {

      String numeroString1=JOptionPane.showInputDialog(null,"\n\tDigite o primeiro numero");
        double numero1=Double.parseDouble(numeroString1);
        String numeroString2=JOptionPane.showInputDialog(null,"\n\tDigite o segundo numero");
          double numero2=Double.parseDouble(numeroString2);

          if(numero1>numero2){
            JOptionPane.showMessageDialog(null,"O primeiro e maior ");
          }else{
            if(numero2>numero1){
              JOptionPane.showMessageDialog(null,"O segundoe maior " );
            }else{
              JOptionPane.showMessageDialog(null,"ambos os numeros sao iguais");
            }
          }
    }
  }
