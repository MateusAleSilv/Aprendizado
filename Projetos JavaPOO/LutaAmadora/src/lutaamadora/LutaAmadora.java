package lutaamadora;
public class LutaAmadora {
   
    public static void main(String[] args) {
       Lutador l[] = new Lutador[6];
               
       l[0] = new Lutador("Mateus Alexandre da Silva", "Brasil", 20, 1.72f, 75.8f, 35, 0, 0);
       l[1] = new Lutador("Conor Greguin", "Irlandezinho", 45, 1.74f, 68.8f, 18, 8, 10);
       l[2] = new Lutador("Anderson Spider Silva", "Brasil", 55, 1.80f, 88.9f, 100, 5, 2);
       l[3] = new Lutador("Rolandinho Garros", "Americano", 31, 1.68f, 55.7f, 1, 7, 0);
       l[4] = new Lutador("Magrin Sem Musculo", "China", 25, 1.90f, 55.9f, 0, 10, 3);
       l[5] = new Lutador("Shaquille ONeil", "Americano", 57, 2.20f, 114.9f, 20, 2, 1);
       
       Combate LTA01 = new Combate();
       LTA01.marcarLuta(l[3], l[4]);
       LTA01.lutar();
       l[3].status();
       
    }
    
}
