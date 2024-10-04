import javax.swing.JOptionPane;
public class TesteTurma {
     // cadastrar uma nova turma no metodo main
     public static void main(String[] args) {
         // coletando os dados da turma a ser cadastrado
         String nome = JOptionPane.showInputDialog("Nome");
         String curso = JOptionPane.showInputDialog("Curso");
         int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos"));
         int serie = Integer.parseInt(JOptionPane.showInputDialog("Serie"));        
         // cria um objeto turma
         Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);
         // monta a String de saida chamando os metodos de acesso do aluno
         String msg = "Nome: " + turma.getNome() + "\nCurso: "+ turma.getCurso() + "\nQuantidade de alunos: "
               + turma.getQuantidadedealunos() + " Alunos " + "\nSerie: " + turma.getSerie();
         // mostra a turma
         JOptionPane.showMessageDialog(null, msg);
         // altera informacoes; nao precisa criar todas as variaveis novamente
         quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Alunos: "));
         // muda usando os metodo modificadores
         turma.setQuantidadedealunos (quantidadeDeAlunos);
         // mostra novamente o cadastro da turma
         // monta a String de saida chamando os metodos de acesso do aluno
         msg = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuantidade de alunos: " 
                + turma.getQuantidadedealunos() + "\nSerie: " + turma.getSerie();
         // mostra o turma
         JOptionPane.showMessageDialog(null, msg);
     }
}