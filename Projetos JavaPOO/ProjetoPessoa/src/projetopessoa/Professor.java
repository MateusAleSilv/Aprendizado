package projetopessoa;

public class Professor extends Pessoa {
    private String espc;
    private float sal;
    
    public void receberAumt(float aum) {
        this.sal += aum;
    }
    public String getEspc() {
        return espc;
    }
    public void setEspc(String espc) {
        this.espc = espc;
    }
    public float getSal() {
        return sal;
    }
    public void setSal(float sal) {
        this.sal = sal;
    }
}
