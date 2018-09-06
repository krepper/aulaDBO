package xaula;

class Lampada {
    private boolean aceso = false;
    
    public void acender(){
        this.aceso = true;
    }
    
    public void apagar(){
        this.aceso = false;
    }
    
    public boolean isAceso(){
        return this.aceso;
    }
}
