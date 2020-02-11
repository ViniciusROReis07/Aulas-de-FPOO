import javax.swing.JOptionPane;
    class ParOuImpar{
      public static void main(String[] args) {
          double  numero=Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o numero"));
              double modulo=numero%2;

              if(modulo==0){
                JOptionPane.showMessageDialog(null,"\n\t Este numero e par");
              }else{
                JOptionPane.showMessageDialog(null,"\n\t Este numero e impar");
              }
        ;
      }
    }
