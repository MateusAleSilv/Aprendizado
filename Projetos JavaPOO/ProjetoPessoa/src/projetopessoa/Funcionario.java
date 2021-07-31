package projetopessoa;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trab;
    
    public void mudarTrab() {
        this.trab = ! this.trab;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrab() {
        return trab;
    }

    public void setTrab(boolean trab) {
        this.trab = trab;
    }
    
    
}
