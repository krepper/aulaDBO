package xaula;

public class Pessoa {
    
    private String nome;
    private Comodo comodoAtual;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void entrar(Comodo x){
        this.comodoAtual = x;
        x.addPessoa(this);
    }

    public String getComodoAtual() {
        return "Estou em: "+comodoAtual;
    }

    @Override
    public String toString() {
        return this.nome; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
