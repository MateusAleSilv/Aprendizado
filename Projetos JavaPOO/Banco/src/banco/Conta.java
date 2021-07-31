package banco;

public class Conta { //construtor
    private int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;
   
   public void estadoAtual() { 
        System.out.println("------------------------------");
        System.out.println("  Conta: " + this.getNumConta());
        System.out.println("  Tipo: " + this.getTipo());
        System.out.println("  Dono: " + this.getDono());
        System.out.println("  Saldo: " + this.getSaldo());
        System.out.println("  Status: " + this.getStatus());
        System.out.println("------------------------------");
   }
    
   //metodos
    public void abrirConta(String t) {
        this.setTipo(t);
        setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("A conta não pode ser fechada pois ainda tem dinheiro!! ");
        } else if (this.getSaldo() < 0) {
            System.out.println("Não pode ser fechada pois ainda à débitos a pagar!! ");
        } else {
            this.setStatus(false);
            System.out.println(" Conta fechada com sucesso!! ");
        }
    }
    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de: " + this.getDono());
        } else {
            System.out.println("Impossivel depositar!!");
        }
    }
    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de: " + this.getDono());
            } else {
                System.out.println("Saldo Insuficiente!!");
            }
        } else {
            System.out.println("Impossivel sacar!!");
        }
    }
    public void pagarMensal() {
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } else if ("CP".equals(this.getTipo())) {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por: " + this.getDono());
            } else {
                System.out.println("Impossivel pagar!");
            }
        
    }
    
    
    
    
    //Atributos especiais
    
    public Conta() {
       this.saldo = 0;
       this.status = false;
    }  

    public void setNumConta(int n) {
        this.numConta = n;
    }
  
    public int getNumConta() {
        return this.numConta;
    }
    
    public void setTipo(String t) {
        this.tipo = t;
    }
   
    public String getTipo() {
        return this.tipo;
    }
   
    public void setDono(String d) {
        this.dono = d;
    }
  
    public String getDono() {
        return this.dono;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }
   
    public float getSaldo() {
        return this.saldo;
    }
   
    public void setStatus(boolean st) {
        this.status = st;
    }
   
    public boolean getStatus() {
        return this.status;
    }
    
     
   
}

