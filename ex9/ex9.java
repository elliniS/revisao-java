package ex9;

import java.util.ArrayList;

public class ex9 {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();

		for (int i = 0; i < 3; i++) {
			lista.add(("") + i);
		}

		System.out.println("Elementos:");
		PrintString(lista);

		System.out.println("Tamanho:");
		System.out.println(lista.size());

		System.out.println("verifica:");
		System.out.println(lista.isEmpty());

		System.out.println("Ultimo elemento:");
		System.out.println(lista.get(lista.size() - 1));
	}

	public static void PrintString(ArrayList<String> st) {
		for (String i : st) {
			System.out.println(i);
		}
	}

}
