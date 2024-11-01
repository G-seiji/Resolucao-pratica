import javax.swing.JOptionPane;
public class MainForma 

{  public static void main(String[] args)
   {
      //lendo os dados
           String sLargura = JOptionPane.showInputDialog(
             "Para calcular a area do retangulo digite o tamanho de sua largura em cm.");
           String sAltura = JOptionPane.showInputDialog(
             "Digite a altura do retangulo em cm.");
           String sRaio = JOptionPane.showInputDialog(
             "Digite o raio do circulo em cm.");
      //convertendo para double
           double largura = Double.parseDouble(sLargura);
           double altura = Double.parseDouble(sAltura);
           double raio = Double.parseDouble(sRaio);
           
           Retangulo retangulo = new Retangulo(largura, altura);
           Circulo circulo = new Circulo(raio);
           
      //calculando area e perimetro das formas
      double areaRetangulo = retangulo.calcularArea();
      double perimetroRetangulo = retangulo.calcularPerimetro();
      double areaCirculo = circulo.calcularArea();
      double perimetroCirculo = circulo.calcularPerimetro();
      
      //apresentando resultado retangulo
      JOptionPane.showMessageDialog(null, "A area do seu retangulo é: " + areaRetangulo + " " 
      + "\n O perimetro do seu retangulo é: " + perimetroRetangulo + "\n A area do seu circulo é: " + areaCirculo 
      + "\n O perimetro do seu circulo é: " + perimetroCirculo);
    }
} 