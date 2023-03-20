package Capitulo4;

public class Casa {
    String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;

    void pinta(String s)
    {
        this.cor = s;
    }

    int quantasPortasEstaoAberta()
    {
        int qtdPortasAbertas = 0;

        if(this.porta1.aberta)
        qtdPortasAbertas++;
        if(this.porta2.aberta)
        qtdPortasAbertas++;
        if(this.porta3.aberta)
        qtdPortasAbertas++;

        return qtdPortasAbertas;
    }
}
