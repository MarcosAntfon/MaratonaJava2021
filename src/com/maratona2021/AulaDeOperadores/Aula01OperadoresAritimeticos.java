package com.maratona2021.AulaDeOperadores;

public class Aula01OperadoresAritimeticos {
	
// somar (+) , subtração (-), multiplicação (*) e Divisão (/)

    public static void main(String[] args) {

        int numero01 = 10;

        int numero02 = 20;

        double numero03 = 20;/* int e numero inteiro , colocando double fica numero decimal*/

        int resultado01 = numero01/numero02;

        double resultado02 = numero01/(double)numero02; /* colocando um creck (double) na variavel int*/

        /*int*/ double resultado = numero01/numero03; /* int e numero inteiro , colocando double fica numero decimal*/

        System.out.println(numero02+numero01);
        System.out.println(numero02-numero01);
        System.out.println(numero01*numero02);
        System.out.println(resultado);
        System.out.println(resultado01);
        System.out.println(resultado02);

        System.out.println("valor"+numero02+numero01);


    }
}



