package ex6;

import java.util.Arrays;

public class ex6 {

	public static void main(String[] args) {
		double[] salario = { 1.2, 3.2, 4.3, 656.66, 6646.55, 4545.55, 45345.55, 5353.55, 3432.43, 545.453 };
		
		Arrays.sort(salario);

		Printnumeros(salario);

		System.out.println("\n");

		PrintnumerosDecre(salario);
	}

	public static void PrintnumerosDecre(double[] n) {
		for (int i = 9; i >= 0; i--) {
			System.out.println(n[i]);
		}
	}

	public static void Printnumeros(double[] salario) {
		for (double i : salario) {
			System.out.println(i);
		}
	}
}
