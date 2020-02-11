import javax.swing.JOptionPane;
  class ConversaoMetros{
    public static void main(String[] args) {
      double metros=Double.parseDouble(JOptionPane.showInputDialog(null,"\n\t Informeos metros "));
        double km=metros/1000;
        double hm=metros/100;
        double dam=metros/10;
        double dm=metros/0.1;
        double cm=metros/0.01;
        double mm=metros/0.001;
        JOptionPane.showMessageDialog(null,"\n em km equivale a "+km+"\nem hm equivale a "+hm+"\n em dam equivale a "+dam+"\nem dm equivale a "+dm+"\nem cm equivale a "+cm+"\n em mm equivale a "+mm);

    }
  }
