import javax.swing.JOptionPane;
public class TesteProduto {
       // cadastrar um novo produto no metodo main
       public static void main(String[] args) {
         // coletando os dados do produto a ser cadastrado
         String nome = JOptionPane.showInputDialog("Nome");
         double preco = Double.parseDouble(JOptionPane.showInputDialog("Preco"));
         int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
         // cria um objeto produto
         Produto produto = new Produto(nome, preco, quantidade);
         // monta a String de saida chamando os metodos de acesso do produto
         String msg = "Nome: " + produto.getNome() + "\nPreco: "+ produto.getPreco() + "\nQuantidade "
               + produto.getQuantidade();
         // mostra a produto
         JOptionPane.showMessageDialog(null, msg);
     }
}