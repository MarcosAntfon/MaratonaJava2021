package com.maratona2021.AulaEstruturaCondicionais;

public class Aula05TabelaVerdadeeExercicio {
	public static void main(String[] args) {
		
		/*And (&&) 
		 * A DECISAO LOGICA  APENAS TERA UM RETORNO VERDADDEIRO. 
		 * SE FORE AS DUAS OU MAS SEJE VERDADEIRAS. 
		
		V && V = v
		V && F = f
		V && V = F
		F && F = F
		
		
		OR (||)
		A DECISÃO LOGICA TERA UM RETORNO VERDADEIRO PELO MENOS UMA DAS RETORNE VERDADEIRO.
		SO SERA FALSA SE AS DUAS OU MAS SEJE FALSA.
		
		V || V = V
		V || F = V
		F || V = V
		F || F = F
		*/
		
	//EXERCICIO
		
		/*Box 1 tax rates for 2020
		 * 
Annual taxable income (gross)	
Total                       rate
€ 0 - 20.711	             36,65%
€ 20.712 - 68.507	         38,10%
€ 68.508+	                 51,75%*/

	double salarioAnual = 58000;
	double primeiraFaixa = 36.65 /100;
	double segundaFaixa = 38.10 / 100;
	double terceiraFaixa = 51.75 / 100;
	double valorImposto;
	
	if(salarioAnual <= 20711) {
		valorImposto= salarioAnual * primeiraFaixa;
	}else if(salarioAnual >=20711 && salarioAnual <= 68507) {
		valorImposto = salarioAnual * segundaFaixa;
	}else{ 
		valorImposto= salarioAnual * terceiraFaixa;
		}
	
	System.out.println(valorImposto);
		}
}
	




