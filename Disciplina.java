public class Disciplina {
     // atributos
     private String nome;
     private boolean pratica;
     private Professor professor;
     //construtor
     public Disciplina(String nome, Professor professor) {
     this.nome = nome;
     this.pratica = false;
     this.professor = professor;
     }
     //metodos de acesso
     public String getNome() {
     return nome;
     }
     public boolean getPratica() {
     return pratica;
     }
     public Professor getProfessor() {
     return professor;
     }
     //metodos modificadores
     public void setNome(String nome) {
     this.nome = nome;
     }
     public void setPratica(boolean pratica) {
     this.pratica = pratica;
     }
     public void setProfessor(Professor professor) {
     this.professor = professor;
     }
     //metodo getDados
     public String getDados() {
        return "Disciplina [nome=" + nome + ", pratica=" + pratica 
              + ", professor= " + professor.getDados() + "]";
   }
}