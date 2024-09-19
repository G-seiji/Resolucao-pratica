import javax.swing.JOptionPane;
public class Palavradez
     {
       public static void main(String[] args)
       {
           //lendo os dados
           String sLetra1 = JOptionPane.showInputDialog(
             "Escreva uma sequencia de letras que no fim forme uma palavra");
           String sLetra2 = JOptionPane.showInputDialog(
             "Segunda letra.");
           String sLetra3 = JOptionPane.showInputDialog(
             "Terceira letra.");
           String sLetra4 = JOptionPane.showInputDialog(
             "Quarta letra.");
           String sLetra5 = JOptionPane.showInputDialog(
             "Quinta letra.");
           String sLetra6 = JOptionPane.showInputDialog(
             "Sexta letra.");
           String sLetra7 = JOptionPane.showInputDialog(
             "Setima letra.");
           String sLetra8 = JOptionPane.showInputDialog(
             "Oitava letra.");
           String sLetra9 = JOptionPane.showInputDialog(
             "Nona letra.");
           String sLetra10 = JOptionPane.showInputDialog(
             "Decima letra.");
             
           //apresentando resultado
           JOptionPane.showMessageDialog(null, "A Palavra foramda foi = " + sLetra1 + sLetra2 +
               sLetra3 + sLetra4 + sLetra5 + sLetra6 + sLetra7 + sLetra8 + sLetra9 + sLetra10);
       }
    }
