package projetopessoa;

public class ProjetoPessoa {

    public static void main(String[] args) {
    
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome(" Luka");
        p2.setNome(" Trae Young");
        p3.setNome(" Lebron James");
        p4.setNome(" J.R Simith");
        
        p1.setSexo("M");
        p2.setSexo("A");
        p3.setSexo("MM");
        p4.setSexo("F");
        
        p1.setIdade(20);
        p2.setIdade(22);
        p3.setIdade(55);
        p4.setIdade(159);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        p2.setCurso("Engenheiro de Software");
        p3.setSal(1500.85f);
        p4.setSetor("DA LOUCURA");
        
        p3.receberAumt(250.40f);
        p4.mudarTrab();
        p2.cancelarMatr();
        
    
    }
    
}
