package com.maratona2021.AulaEstruturaCondicionais;

public class Aula03EstruturaCondicionaisOperadorTernário {
	public static void main(String[] args) {
	//Doar se salario > 5000
		
	/*double salario= 6000;
	
	String mensagemDoar = "Eu vou doar 500 pra Luciene";
	String mensagemNaoDoar = "Ainda nao tenho condições, mas vou ter! ";
	
	//(condição) ? verdadeiro : falso
	 
	String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
	
	// aqui e outra forma de resolve:
	
	if(salario > 5000) {
		resultado = mensagemDoar;
	}else {
		resultado = mensagemNaoDoar;
	}
	System.out.println(resultado);

	}*/	
	
	double salario= 6000;

	String resultado = salario > 5000 ? "Eu vou doar 500 pra Luciene" : "Ainda nao tenho condiçoes, mas vou ter!";
	
	System.out.println(resultado);
	}
}
