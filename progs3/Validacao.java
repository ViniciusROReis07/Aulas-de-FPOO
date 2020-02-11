import javax.swing.JOptionPane;
  class Validacao{
    public static void main(String[] args) {

    int idade=Integer.parseInt(JOptionPane.showInputDialog(null,"\n\t Informe sua idade"));
      if((idade>0) && (idade<151)){
        if(idade>17){
          JOptionPane.showMessageDialog(null,"\n\t Maior de idade");
        }else{
          JOptionPane.showMessageDialog(null,"\n\tMenor  de idade");
        }
      }else{
          JOptionPane.showMessageDialog(null,"IDADE INVALIDA");
      }
    }
  }
