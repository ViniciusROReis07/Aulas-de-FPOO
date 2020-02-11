/***************************************************************************************
Usuário digita um número inteiro maior que ‘1’ e programa informa se este é ou não primo,
se o número não for primo, indicar todos os números pelo qual este é divisível.
****************************************************************************************/

import javax.swing.JOptionPane;

class Primo3ver2 {
  public static void main(String[] args) {

    int numero = 0;
    while (true) {
      numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um inteiro maior que [ 1 ]: "));
      if (numero > 1) {
        break;
      }
    }

    boolean referencia = true;
    String texto = " nao eh primo, pois eh divisivel por:\n";

    for (int i=2 ; i < numero / 2+1 ; i++) {
      if (numero % i == 0) {
        referencia = false;
        texto += i;
        if (i < numero / 2) {
          texto += ", ";
        }
      }
    }
    if (referencia) {
      JOptionPane.showMessageDialog(null, numero + " eh primo.");
    }
    else {
      JOptionPane.showMessageDialog(null, numero + texto);
    }
  }
}
