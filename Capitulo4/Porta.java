package Capitulo4;

public class Porta {
    boolean aberta;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;

    public void abre()
    {
        this.aberta = true;
    }

    public void fecha()
    {
        this.aberta = false;
    }

    public void pinta(String cor)
    {
        this.cor = cor;
    }

    public boolean estaAberta()
    {
        if(this.aberta)
            return true;
        
        return false;
    }
}
