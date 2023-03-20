package Capitulo4;

import javax.sound.sampled.Port;

public class TestaConta 
{
 
    public static void main(String[] args) 
    {
       Casa casa = new Casa();

       casa.pinta("azul");

       Porta porta1 = new Porta();
       Porta porta2 = new Porta();
       Porta porta3 = new Porta();

       casa.porta1 = porta1;
       casa.porta2 = porta2;
       casa.porta3 = porta3;

       casa.porta2.pinta("vermelho");

       casa.porta1.fecha();
       casa.porta2.abre();
       casa.porta3.fecha();
       casa.porta3.abre();


       System.out.println("quantidade de portas aberta :"+ casa.quantasPortasEstaoAberta());
        System.out.println("cor da porta2 "+ casa.porta2.cor);
    }
}

