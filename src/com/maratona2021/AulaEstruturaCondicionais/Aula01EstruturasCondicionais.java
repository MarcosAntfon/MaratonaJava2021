package com.maratona2021.AulaEstruturaCondicionais;

public class Aula01EstruturasCondicionais {
	public static void main(String[] args) {
		 
	// ESTRUTURA CONDICIONAIS  " IF "
		
	/*if(true);{
		
		System.out.println("Dentro do if");
		
	}
	
	System.out.println("Fora do if");
	  
    int idade = 15;
    int idade01 = 20;
    boolean isAutorizadoCompraBebida = idade01 >= 18;
    if(isAutorizadoCompraBebida) {
    
	if(idade01 >=18);{
		System.out.println("Autorizado a comprar bebida alcólica");
		}
	
	if(isAutorizadoCompraBebida == false)  {
		System.out.println("Não Autorizado a compra Bebida");
	}
    }
	}*/

// ELSE IF

		int idade01 = 20;
	    boolean isAutorizadoCompraBebida = idade01 >= 18;
	
	    if(isAutorizadoCompraBebida != false) {
	    System.out.println("Autorizado a comprar bebida alcólica");
	}else{
		System.out.println("Não Autorizado a compra Bebida");
	}

}
}
