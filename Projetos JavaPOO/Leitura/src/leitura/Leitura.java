package leitura;

public class Leitura {

    public static void main(String[] args) {
       Pessoa[] p = new Pessoa[2];
       Livro[] l = new Livro[3];
       
       p[0] = new Pessoa("Mateus Silva", 20, "M", "Preto");
       p[1] = new Pessoa("Julli Severina", 21, "F", "Vermelho");
       
       l[0] = new Livro("Java Avançado", "Bill Gates", 950, p[0]);
       l[1] = new Livro("Fsioterapia no Idoso", "Marcelo Mattos", 340, p[1]);
       l[2] = new Livro("Paternidade", "Kevin Hart", 450, p[0]);
       
       
        l[0].abrir();
        l[0].folhear(200);
        l[0].avancarPag();
        p[0].fazerAniversario();
        System.out.println(l[0].detalhes());
        l[1].abrir();
        l[1].folhear(570);
        l[1].fechar();
        l[1].detalhes();
        p[1].fazerAniversario();
        System.out.println(l[1].detalhes());
    }
    
}
