import javax.swing.JOptionPane;
  class MaiorMenorOuDez{
    public static void main(String[] args) {

      String numeroString =JOptionPane.showInputDialog(null,"\n\t Digite o numero");
        double numero =Double.parseDouble(numeroString);

          if(numero>10){
              JOptionPane.showMessageDialog(null,"\n\t Este numero e maior que dez");
          }else{
            if(numero<10){
                JOptionPane.showMessageDialog(null,"\n\t Este numero e menor que dez ");
            }else{
                JOptionPane.showMessageDialog(null,"\n\t Este numero e dez ");
            }
          }
    }
  }
