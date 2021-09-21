package com.maratona2021.AulaEstruturaCondicionais;

public class Aula04EstruturaCondicionaisSwitch {

	public static void main(String[] args) {

		//imprimar o dia da semana, considerando 1 como domingo
		
		byte dia = 5;
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Opção Invalida");
		}
		
		char sexo = 'F';
		switch (sexo) {
		case 'M':
			System.out.println("Homem");
			break;
		case 'F':{
			System.out.println("Mulher");
			break;
		}
		default:
			System.out.println("Invalida");
			break;
		}
		
	}

}
