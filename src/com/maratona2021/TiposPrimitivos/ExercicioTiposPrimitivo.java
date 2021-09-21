package com.maratona2021.TiposPrimitivos;

/*
Pratica
Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

eu <nome>, morando no endereço <endereço>,
confirma que recebi o salario de <salario>, na dta <data> na
 */

public class ExercicioTiposPrimitivo {

	public static void main(String[] args) {

	        String nome = "Marcos";
	        String morandoEndereco = "Rua soldado virgilio Lucio nº 98";
	        String dataDoRecebimentoDOSalario = "14/09/2021";
	        double salarioDouble = 2200.0;
	        float salarioFloat = -80.0f;
	        float totalFloat = 2120.0f;

	        String relatorio = "Eu: "+  nome  +   "morando no EndereÃ§o: " +  morandoEndereco  + " Data do Recebimento do Salario: " +  dataDoRecebimentoDOSalario  + "   valor do salario: " +  salarioDouble;

	        System.out.println("Eu : "+ nome);
	        System.out.println("moro no endereco: " + morandoEndereco);
	        System.out.println("recebi o meu salario na data :" + dataDoRecebimentoDOSalario);
	        System.out.println("o valor de R$ " + salarioDouble);
	        System.out.println("Mas teve um desconto no INSS: " + salarioFloat);

	        System.out.println("Valor total liquido que recebi foi de R$: " + totalFloat );
	        System.out.println(relatorio);
	    }
	}

