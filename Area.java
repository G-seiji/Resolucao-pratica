import javax.swing.JOptionPane;
public class Area
     {
       public static void main(String[] args)
       {
           //lendo os dados
           String sBase = JOptionPane.showInputDialog(
             "Para calcular a area do retangulo digite o tamanho de sua base em cm.");
           String sAltura = JOptionPane.showInputDialog(
             "Digite a altura do retangulo em cm.");

           //convertendo para inteiros
           int base = Integer.parseInt(sBase);
           int altura = Integer.parseInt(sAltura);
           
           //calculando a area
           int area = base * altura;
           
           //apresentando resultado
           JOptionPane.showMessageDialog(null, "A area do seu retangulo é: " + area);
       }
    } 
