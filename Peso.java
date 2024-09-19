import javax.swing.JOptionPane;
public class Peso
 {
     public static void main(String[] args)
      {
         //lendo os dados
         String sPeso = JOptionPane.showInputDialog(
                "Digite seu peso");
         
         //convertendo para reais
         double peso = Double.parseDouble(sPeso);
         
         //apresentando o resultado
         JOptionPane.showMessageDialog(null, "O peso informado foi:" + " " + peso + "kg."); 
       }
  }  
       
     