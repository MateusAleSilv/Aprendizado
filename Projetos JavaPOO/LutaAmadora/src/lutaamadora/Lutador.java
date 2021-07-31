
package lutaamadora;


public class Lutador {
    //  Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    // Metodos publicos
    public void apresentar() {
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Senhoras e Senhores, hoje iremos apresentarrrrr a luta do seculooo...");
        System.out.println("De um lado ele " + this.getNome());
        System.out.println("Direto do(a) " + this.getNacionalidade());
        System.out.println("Sua idade é de " + this.getIdade() + " Anos");
        System.out.println("com seus " + this.getAltura() + "m de altura e pesando " + this.getPeso() + "Kg " );
        System.out.println("Seu card até o momento é deeeee... " + this.getVitorias() + " Vitoriasss e " + this.getDerrotas() + " Derrotas e um total de " + this.getEmpates() + " Empates.");
        System.out.println("Tenham uma Otima Luta senhora e senhoresssss... ");
    }
    public void status() {
        System.out.println("------------ Card ----------------");
        System.out.println(this.getNome() + " é um " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " Vezes!");
        System.out.println("Perdeu " + this.getDerrotas() + " Vezes!");
        System.out.println("E empatou " + this.getEmpates() + " Vezes!");
    }
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
   
    
    // Metodos especiais
    
    
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
         if(this.peso < 52.2) {
             this.categoria = "Inválido";
         } else if (this.peso <= 70.3) {
             this.categoria = "Peso Leve";
         } else if (this.peso <= 83.9) {
             this.categoria = "Peso Médio";
         } else if (this.peso <= 120.5) {
             this.categoria = "Peso Pesado";
         } else {
             this.categoria = "Inválido";
         }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
    
}
