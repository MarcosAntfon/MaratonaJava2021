package com.maratona2021.AulaEstruturaRepeticção;

public class Aula04EstruturaRepeticçãoBREAK {

	public static void main(String[] args) {
		// Imprima os primeiros 25 numeros de um dado valor; for exemplo, 50.
		
		int valormaximo = 50;
		for (int i = 0; i <+ valormaximo; i++) {
		if (i>25) {
			break;
		    }
		System.out.println(i);
        }
	}	
}