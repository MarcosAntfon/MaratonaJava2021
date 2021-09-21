package com.maratona2021.AulaEstruturaRepeticção;

import java.util.Iterator;

public class ExercicioFOR {

	public static void main(String[] args) {
		
		// Exercício de For
	
	// imprimar todos os numeros pares de 0 ate 1000000
	 
	/*	Esse e no while
	 * int count = 0;
		while(count <1000000) {
			System.out.println(count);
			count = count +2; 
	
	}
		
	}	*/
		
	//for(int i = 1; i <= 1000000; i++) { 
		for(int i = 2; i <= 1000000; i+=2) {
			if (i % 2 ==0) {
				System.out.println("for "+i);
			
			}
		}
	}
}