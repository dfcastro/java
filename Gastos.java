class Gastos{
	public static void main(String args[]){
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
	
		double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		double mediaGastosTrimestre = gastosTrimestre / 3;
		int x = (int) mediaGastosTrimestre;	
		System.out.println("A soma dos gastos é de: "+ gastosTrimestre +"\n"+ "a média de gastos é: "+ x);	
	}

}
