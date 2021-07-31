package controleremoto;
    
   public class Controlador implements ControleInterface {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    
    public Controlador() {
        this.volume = 20;
        this.ligado = false;
        this.tocando = false;
    }
    
    //Metodos especiais

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    
    //Métodos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado() == true) {
            System.out.println("--------------- Menu -----------------");
            System.out.println(" Está ligado? " + this.getLigado()  );
            System.out.println(" Está tocando? " + this.getTocando() );
            System.out.println(" Volume: " + this.getVolume() );
            int i;
            for (i=0; i<= this.getVolume(); i+=5) {
             System.out.print("|");
            }
            System.out.println("");
        }
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu... ");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 20);
        } else {
            System.out.println("Impossivel Aumentar... ");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossivel diminuir ");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        } else {
            System.out.println("Mudo não pode ser ativado... ");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(10);
        } else {
            System.out.println("Impossivel desativar... ");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        } else {
            System.out.println("Erro ao dar play... ");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Não é possivel pausar...");
        }
    }
    
}






    


