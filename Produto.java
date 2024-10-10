public class Produto {
     // atributos
     private String nome;
     private double preco;
     private int quantidade;
     
     // método construtor
     public Produto(String n, double p, int q) {
     nome = n;
     preco = p;
     quantidade = q;
     }
     // métodos de acesso
     public String getNome() {
     return nome;
     }
     public double getPreco() {
     return preco;
     }
     public int getQuantidade() {
     return quantidade;
     }
}