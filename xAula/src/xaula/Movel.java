package xaula;

class Movel {
    private String nome;
    private int x;
    private int y;

    public Movel(String nome) {
        this.nome = nome;
    }
    
    public void arrastar(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return this.nome+"("+this.x+", "+this.y+")"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
