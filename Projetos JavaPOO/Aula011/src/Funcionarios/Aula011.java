package aula011;

public class Aula011 {

    public static void main(String[] args) {
       /* Aluno a1 = new Aluno();
        a1.setNome("Marquin");
        a1.setIdade(15);
        a1.setMatricula(263674);
        a1.setSexo("M");
        a1.setCurso("Informatica");
        a1.pagarMensalidade();
        */
       
      /* Bolsista b1 = new Bolsista();
       b1.setMatricula(5546);
       b1.setNome("Ayrton Myscokv");
       b1.setBolsa(12.5f);
       b1.setSexo("M");
       b1.setIdade(18);
       b1.pagarMensalidade();
       */
      
      /*Tecnico t1 = new Tecnico();
      t1.setNome("Rosário");
      t1.setIdade(60);
      t1.setRegistroProf(557812);
      t1.setSexo("F");
      t1.praticar();
      t1.pagarMensalidade();
      t1.fazerAniv();  
      System.out.println(t1.toString());
      */
      
      Professor p1 = new Professor();
      p1.setEspecialidade("Java");
      p1.setSalario(5000);
      p1.setNome("Claudio");
      p1.receberAumento();
      System.out.println(p1.toString());
    }
    
}
