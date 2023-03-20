package Capitulo4;

public class Conta 
{
    String titular;
    int numero;
    String agencia;
    double saldo;
    Data dataDeAbertura;

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
