package com.maratona2021.AulaDeOperadores;

public class Aula03OperadoresRelacionais {

	public static void main(String[] args) {

        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero02+numero01);

        double resultado = numero01/(double)numero02;
        System.out.println(resultado);
// % (Porcentagem)
        int resto = 21 % 2;
        System.out.println(resto);

// < > ( MenorQue / MaiorQue)  <= >= ( MenorQue ou Igual / MaiorQue ou Igual)
// == (Igual)  != ( Diferente)  sao operadores relacionais "boolean"
// ex:
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMenorIgualVinte = 10 <= 20;
        boolean isDezMaiorIgualVinte = 10 <= 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 20;
        boolean isDezDiferenteDez1 = 10 != 10;



        System.out.println("isDezMaiorQueVinte: " +isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " +isDezMenorQueVinte);
        System.out.println("isDezMenorIgualVinte" +isDezMenorIgualVinte);
        System.out.println("isDezMaiorIgualVinte" +isDezMaiorIgualVinte);
        System.out.println("isDezIgualVinte: " +isDezIgualVinte);
        System.out.println("isDezIgualDez: " +isDezIgualDez);
        System.out.println("isDezDiferenteDez: " +isDezDiferenteDez);
        System.out.println("isDezDiferenteDez: " +isDezDiferenteDez1);



    }
}
