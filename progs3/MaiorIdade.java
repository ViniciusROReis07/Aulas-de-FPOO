import javax.swing.JOptionPane;
  class MaiorIdade{
    public static void main(String[] args) {

      int idade =Integer.parseInt(JOptionPane.showInputDialog(null,"Informe sua idade"));
        if(idade<18){
          JOptionPane.showMessageDialog(null,"Menor de idade");
        }else{
          JOptionPane.showMessageDialog(null,"Maior de idade");
        }
    }
  }
