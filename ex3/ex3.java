package ex3;

import java.util.Scanner;

public class ex3 {
	
	public static boolean verifica(Float veri) {
		if (veri <= 0) {
			return false;
		}
		
		return true;
	}
	
	public static void calPreco(float precoLitro, float quantGasolina) {
		float resultado = precoLitro * quantGasolina;
		System.out.println("O valor do abastecimento deu Rs" + resultado);
	}
	
	public static void main(String[] args) {
		
		System.out.println("qual o preco do litro:");
		
		Scanner s = new Scanner(System.in);
		Float precoLitro = s.nextFloat();
		
		System.out.println("Qual a quantidade de gasolina:");
		Float quantGasolina = s.nextFloat();
		
		if (verifica(precoLitro) && (verifica(quantGasolina))) {
			calPreco(precoLitro, quantGasolina);
		}
		else {
			System.out.println("algum dos valores igual a zero");
		}
	}
}
