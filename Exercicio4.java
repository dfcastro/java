public class Exercicio4
{
	public static void main (String[] args)
	{

		for(int n = 1 ; n<=10 ; n++)	
		{
			int fatorial = 1;
			int soma = 0 ;
			for(int i =1; i<=n; i++)
			{
				fatorial =fatorial * i ;	
			}
			System.out.println("o fatorial de "+n +" é: "+fatorial);
		}	
	}
}
