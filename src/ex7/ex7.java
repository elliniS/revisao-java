package ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("digite o numero " + (i+1));
			Scanner s = new Scanner(System.in);
			lista.add(s.nextInt());
		}
		
		Collections.sort(lista);
		System.out.println(lista);
		
		Collections.reverse(lista);
		System.out.println(lista);
	}
}
