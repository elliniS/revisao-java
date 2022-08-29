package ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ex11 {

	public static void main(String[] args) {
		ArrayList<Double> salario = new ArrayList<Double>();

		salario = Preenche();

		System.out.println("valor maximo:");
		System.out.println(Collections.max(salario));

		System.out.println("valor minimo");
		System.out.println(Collections.min(salario));

		System.out.println("media:");
		Media(salario);
	}

	static ArrayList<Double> Preenche() {
		ArrayList<Double> lista = new ArrayList<Double>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			lista.add(random.nextDouble((5000 - 1000) + 1) + 1000);
		}
		return lista;
	}

	static void Media(ArrayList<Double> marks) {
		System.out.println(marks.stream().mapToDouble(d -> d).average().orElse(0.0));
	}
}
