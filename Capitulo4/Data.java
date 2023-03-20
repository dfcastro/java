package Capitulo4;

public class Data {
   int dia;
   int mes;
   int ano;

   public String formataData(int dia, int mes, int ano)
   {
        String dataFormatada = dia+"/"+mes+"/"+ano;
        return dataFormatada;

   }
}
