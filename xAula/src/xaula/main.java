package xaula;

public class main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("José");
        Pessoa p2 = new Pessoa("Ana");
        
        Comodo c1 = new Comodo("Sala", 300, 400);
        Comodo c2 = new Comodo("cozinha", 300, 400);
        
        p1.entrar(c1);
        p2.entrar(c1);
        
        Movel m1 = new Movel("Carteira");
        Movel m2 = new Movel("Mesa");
        
        c1.addMovel(m1, 150, 150);
        c1.addMovel(m2, 160, 150);
        //System.out.println(p1.getComodoAtual());
        System.out.println(c1.getPessoas());
        System.out.println(c1.getMoveis());
    }
  
}
