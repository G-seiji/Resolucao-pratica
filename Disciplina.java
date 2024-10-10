public class Disciplina {
    //artibutos
    private String nome;
    private String professor; 
    private int semestre;
    private boolean ofertada;
   
    //método construtor
    public Disciplina (String n, String p, int s) {
      nome= n;
      professor= p;
      semestre= s;
      ofertada= false;
   }
   //métodos de acesso
   public String getNome() {
      return nome;
   }
   public String getProfessor() {
      return professor;
   }   
   public int getSemestre() {
      return semestre;
   }
   public boolean getOfertada() {
      return ofertada;
   }  
}