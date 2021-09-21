package com.maratona2021.AulaDeOperadores;

public class Aula02OperadoresLogicos {

	public static void main(String[] args) {

		   //And (&&) e pra fazer avaliação.

		     int idade = 29;
		     float salario = 3500f;

		     boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
		     boolean isDentroDaLeiMenoorQueTrinta = idade < 30 && salario >= 3381;

		        System.out.println(isDentroDaLeiMaiorQueTrinta);
		        System.out.println(isDentroDaLeiMenoorQueTrinta);


		   // or (||) e pra fazer comparação.

		        double valorDaContaCorrente = 200;
		        double valorDaContaPoupanca = 10000;
		        float valorPlaystation = 5000;

		        // boolean isvalorPlaystationCincoCompravel = valorDaContaCorrente > valorPlaystation (essa aqui e false)
		        // || valorDaContaPoupanca > valorPlaystation;( essa aqui e verdadeira)

		        boolean isvalorPlaystationCincoCompravel = valorDaContaCorrente > valorPlaystation || valorDaContaPoupanca > valorPlaystation;
		        System.out.println("isvalorPlaystationCincoCompravel " +isvalorPlaystationCincoCompravel);


		   // Atribuição (=   *=    /=   %=    +=   -=   <<=    >>=   &=    ^=     |=  )

		        double bonus = 1800;
		        bonus +=1000;
		        bonus -= 1000;
		        bonus *= 2;
		        bonus /= 2;
		        bonus %= 2;
		        System.out.println(bonus);

		        int contador = 0;
		        contador += 1;
		        contador++;  // colocar depois da variaveis,  ela  vai resollve a variavel e imprimir
		        contador--;
		        
		        ++contador; // colocar antes esta falando que e primeiro pra exercutar  o vc vai fazer e imprimir
		        --contador;
		        System.out.println(contador);

		        int contador2 = 0;

		        System.out.println(contador2++);
		        System.out.println(contador2);
		        System.out.println(++contador2);
		    }
}
