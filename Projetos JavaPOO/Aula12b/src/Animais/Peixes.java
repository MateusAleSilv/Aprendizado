package aula12b;

public class Peixes extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando ");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias ");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz SOM! ");
    }
    public void soltarBolha() {
        System.out.println("Soltou uma Bolha ");
    }
    
}
