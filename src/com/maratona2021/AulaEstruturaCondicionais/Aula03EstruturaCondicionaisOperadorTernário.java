package com.maratona2021.AulaEstruturaCondicionais;

public class Aula03EstruturaCondicionaisOperadorTern�rio {
	public static void main(String[] args) {
	//Doar se salario > 5000
		
	/*double salario= 6000;
	
	String mensagemDoar = "Eu vou doar 500 pra Luciene";
	String mensagemNaoDoar = "Ainda nao tenho condi��es, mas vou ter! ";
	
	//(condi��o) ? verdadeiro : falso
	 
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

	String resultado = salario > 5000 ? "Eu vou doar 500 pra Luciene" : "Ainda nao tenho condi�oes, mas vou ter!";
	
	System.out.println(resultado);
	}
}
