import javax.swing.JOptionPane;
public class DDV
     { 
       public static void main(String[] args)
       {
           //lendo os dados
           String sIdade = JOptionPane.showInputDialog(
             "Digite sua idade");
           
           //convertendo para inteiros
           int numero = Integer.parseInt(sIdade);
           
           //calculando ddv
           int ddv = numero * 365;
           
           //apresentando resultado
           JOptionPane.showMessageDialog(null, "Seus dias de vida (DDV) são " + ddv);
       }
     } 

 