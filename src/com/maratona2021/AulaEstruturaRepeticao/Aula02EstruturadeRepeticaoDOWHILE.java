package com.maratona2021.AulaEstruturaRepeticção;

public class Aula02EstruturadeRepetiçãoDOWHILE {

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
