
package leitura;


public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;
    private String corCabelo;
    
    // Método
    
    public void fazerAniversario() {
        this.idade++;
    }

    public Pessoa(String nome, int idade, String sexo, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.corCabelo = cor;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
