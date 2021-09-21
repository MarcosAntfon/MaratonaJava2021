package com.maratona2021.AulaEstruturaRepeticção;

public class ExercicioBREAK {
	public static void main(String[] args) {
	
		// Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelados
		// Condição  valorParcela >= 1000
		
		double valorTotal=60000;
		for (int parcela = 1; parcela <=valorTotal; parcela++) {
			double valorParcela = valorTotal / parcela;
			if(valorParcela >=1000) {
				System.out.println("Parcela " + parcela+ "R$" + valorParcela);
			}else {
				break;
			}
		
// Tambem pode ser assim:
		
/* double valorTotal=60000;
for (int parcela = 1; parcela <= valorTotal; parcela++) {
	double valorParcela = valorTotal / parcela;
	if (valorParcela <1000) {
		break;
			}
	System.out.println("Parcela " + parcela+ "R$" + valorParcela);*/
		}
	}
}