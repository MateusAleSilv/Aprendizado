package banco;

public class Banco {

    public static void main(String[] args) {
      Conta p1 = new Conta();
      p1.setNumConta(1245);
      p1.setDono("Marquin da Silva");
      p1.abrirConta("CC");
      p1.depositar(250);
      p1.sacar(10);
      
      
      
      
      
      
      p1.estadoAtual();
    }
    
}
