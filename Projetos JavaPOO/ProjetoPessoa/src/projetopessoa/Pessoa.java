package projetopessoa;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    // Métodos 
    public void fazerAniv() {
        this.idade ++;
    }
    
    // Métodos Especiais
    public String getNome() {
        return nome;
    }
    public void setNome(String nm) {
        this.nome = nm;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int id) {
        this.idade = id;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String s) {
        this.sexo = s;
    }

    @Override
    public String toString() {
        return "Pessoa " + "nome = " + nome + ", idade = " + idade + ", sexo = " + sexo ;
    }
    
    
}
