package com.maratona2021.AulaEstruturaRepetic��o;

public class Aula02EstruturadeRepeti��oDOWHILE {

	public static void main(String[] args) {
		
		// DO WHILE

		int count = 0;
		while(count <10) { 
			System.out.println(++count);
		}
		count = 0;
		do {
			System.out.println("dentro do do-while " + ++count);
		}while (count < 10);
	}

}
