package xaula;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Comodo {
    private String nome;
    private List<Pessoa> pessoas;
    private int comprimento;
    private int largura;
    private Color corParede;
    private Lampada lampada;
    private List<Movel> moveis;
    
    public Comodo(String nome, int comprimento, int largura){
        this.nome = nome;
        this.pessoas = new ArrayList();
        this.moveis = new ArrayList();
        this.largura = largura;
        this.comprimento = comprimento;
        this.corParede = Color.GRAY;
        this.lampada = new Lampada();
    }
    
    public void addPessoa(Pessoa x){
        this.pessoas.add(x);
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
    
    public void acenderLuz(){
        this.lampada.acender();
    }
    
    public void apagarLuz(){
        this.lampada.apagar();
    }
    
    public boolean isIluminado(){
        return lampada.isAceso();
    }
    
    public void addMovel(Movel m, int x, int y){
        this.moveis.add(m);
        m.setX(x);
        m.setY(y);
    }

    public List<Movel> getMoveis() {
        return moveis;
    }
    
   
    @Override
    public String toString() {
        return this.nome; //To change body of generated methods, choose Tools | Templates.
    }
        
}
