package Capitulo4;

public class Conta 
{
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataDeAbertura;

    public boolean saca(double saque)
    {
        if(saque < this.saldo)
        {
            return false;
        }else
        {
            this.saldo -= saque - this.saldo;
            return true;
        }
    }

    public void deposita(double deposito)
    {
        this.saldo += deposito;
    }

    public double calculaRendimento()
    {
        return this.saldo*0.1;
    }

    public void recuperaDadosParaImpressao()
    {
        System.out.println(agencia);
    }

}
