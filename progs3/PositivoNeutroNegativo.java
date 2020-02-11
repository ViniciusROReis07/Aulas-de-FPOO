/*Teste com JOptionPane*/
import javax.swing.JOptionPane;
  class PositivoNeutroNegativo{
    public static void main(String[] args) {

        String numeroString = JOptionPane.showInputDialog (null, "Digite o numero");
            double numero= Double.parseDouble(numeroString);
              if(numero>0){
                  JOptionPane.showMessageDialog (null,"este numero e positivo ");
              }else{
                if(numero==0){
                 JOptionPane.showMessageDialog (null,"este numero e zero ");
                }else{
                 JOptionPane.showMessageDialog (null,"este numero e negativo ");
                }
              }

    }
  }
