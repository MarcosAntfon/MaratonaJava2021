package com.maratona2021.AulaEstruturaCondicionais;

public class ExercicioSwitch {
	public static void main(String[] args) {
		 
		//Utilizando switch e dados os valores de 1 a 7, imprima se é dia util ou final de semana
		// considerando 1 como domingo
		
				byte dia= 7;
		switch (dia) {
		case 1:
			System.out.println("final de semana");
		break;
		case 2:
			System.out.println("Dia util");
			break;
		case 3:
			System.out.println("Dia util");
			break;
		case 4:
			System.out.println("Dia util");
			break;
		case 5:
			System.out.println("Dia util");
			break;
		case 6:
			System.out.println("Dia util");
			break;
		case 7:
			System.out.println("Final de semana");
			break;
		default:
			System.out.println("Opção Invalida");
			
		}
	}
}

// Tem esse outro jeito de resolver o exercicico:

/*	byte dia= 7;
switch (dia) {
case 1:
case 7:
	System.out.println("final de semana");
	break;

case 2:
case 3:
case 4:
case 5:
case 6:
	System.out.println("Dia util");
	break;
	
default:
	System.out.println("Opção Invalida");
		}
	}
}
	*/