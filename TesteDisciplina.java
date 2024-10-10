import javax.swing.JOptionPane;
public class TesteDisciplina {
     // cadastrar um nova disciplina no metodo main
     public static void main(String[] args) {
         // coletando os dados da disciplina a ser cadastrado
         String nome = JOptionPane.showInputDialog("Nome");
         String professor = JOptionPane.showInputDialog("Professor");
         int semestre = Integer.parseInt(JOptionPane.showInputDialog("Semestre"));
         // cria um objeto disciplina
         Disciplina disciplina = new Disciplina(nome, professor, semestre);
         // monta a String de saida chamando os metodos de acesso da disciplina
         String msg = "Nome: " + disciplina.getNome() + "\nProfessor: "
               + disciplina.getProfessor() + "\nSemestre: " + disciplina.getSemestre();
         if (disciplina.getOfertada()) {
              msg += "\nOfertada: sim";
         } else {
              msg += "\nOfertada: nao";
         }
         // tem que digitar true ou false
         boolean ofertada = Boolean.parseBoolean(JOptionPane
                 .showInputDialog("Foi ofertada?true/false"));
         // mostra a disciplina
         JOptionPane.showMessageDialog(null, msg);
     }
}