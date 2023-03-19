package Capitulo4;

public class TestaConta 
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        Conta c1 = new Conta();    
        c1.titular = "Danilo";
        c1.saldo = 100;
        Data data = new Data();

        c1.dataDeAbertura = data;



    }
}

