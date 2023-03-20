package Capitulo4;

public class Fibonacci
{
    int soma=0;
    int n1=0;
    int n2=1;
    public int calculaFibonacci(int i)
    {
        soma = +n1+n2 ;
        n2 = n1;
        n1 = soma;
        
        return soma;
    }


}