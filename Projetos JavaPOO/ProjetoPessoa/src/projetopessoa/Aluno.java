package projetopessoa;

public class Aluno extends Pessoa {
    private int mat;
    private String curso;
    
    public void cancelarMatr() {
        System.out.println("--------------------");
        System.out.println("Matricula Cancelada!");
        System.out.println("--------------------");
    }
    
    public int getMat() {
        return mat;
    }
    public void setMatr(int mat) {
        this.mat = mat;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String cr) {
        this.curso = cr;
    }
    
}
