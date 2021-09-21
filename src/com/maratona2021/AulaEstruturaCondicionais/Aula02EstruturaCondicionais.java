package com.maratona2021.AulaEstruturaCondicionais;

public class Aula02EstruturaCondicionais {
	public static void main(String[] args) {
	// idade < 15 categoria infantil
	// idade >= 15 && idade <18 categoria juvenil
	//idade >= 18 categoria adulto
		
	/*int idade = 14;
	if(idade < 15){
		System.out.println("categoria infantil");
	}else if(idade >=15 && idade < 18){
		System.out.println("categoria juvenil");
	}else {
		System.out.println("categoria adulto");
	}*/

	// Ou pode ser escrito dessa forma tambem:
	
	
	int idade = 42;
	String categoria;
	
	if(idade < 15){
		categoria = "categoria infantil";
	}else if(idade >= 15 && idade <18) {
		categoria ="categoria juvenil";
	}else if(idade >= 18 && idade < 35) {
		categoria = "categoria adulto";
	}else { categoria = "veterano";
	}
	
	System.out.println(categoria);
		}

}
	
