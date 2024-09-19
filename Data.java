import javax.swing.JOptionPane;
public class Data
 {
     public static void main(String[] args)
      {
         //lendo os dados
         String sDia = JOptionPane.showInputDialog(
                "Digite o dia doi seu nascimento");
         String sMes = JOptionPane.showInputDialog(
                "Digite o mês do seu nascimento");
         String sAno = JOptionPane.showInputDialog(
                "Digite o ano do seu nascimento");
         
         //convertendo para reais
         int dia = Integer.parseInt(sDia);
         int mes = Integer.parseInt(sMes);
         int ano = Integer.parseInt(sAno);
         
         String x;
         String y;  
         
         //apresentando o resultado
         if (mes < 10) 
         {
           y = "0" + mes;  
         }
         else
         {
           y = "" + mes;
         }
         if (dia < 10)
         {
           x = "0" + dia;
         }
         else
         {
           x = "" + dia;
         }
         JOptionPane.showMessageDialog(null, "A data do seu aniversário é:" + " " + x + "/" + y + "/" + ano);
         
      }
 }
 
 
          