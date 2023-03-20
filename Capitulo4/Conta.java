package Capitulo4;

public class Conta 
{
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataDeAbertura;


    Conta(String titular)
    {
        this.titular = titular;
    }
    public String getTitular()
    {
        return this.titular;
    }

    public void setTitular(String novoTitular)
    {
        this.titular = novoTitular;
    }

    public int getNumero()
    {
        return this.numero;
    }

    public String getAgencia()
    {
        return this.agencia;
    }

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


    String recuperaDadosParaImpressao()
    {
        String dados = "\nTItular: " + this.titular;
        //imprimir aqui os outros atributos..

        dados += "\n Data de abertura: " + this.dataDeAbertura.formataData(01, 12, 1992);

        return dados;
    }
}
