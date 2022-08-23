package ex10;

public class ex10 {

	public static void main(String[] args) {
		String[] biomasBrs = { "Amazonia", "Mata Atlantica", "Cerrado", "Caatinga", "Pampa", "Pantanal" };

		biomasBrs = Remove(biomasBrs, 3);

		PrintString(biomasBrs);
	}

	static String[] Remove(String[] vet, int re) {
		String aux;
		vet[re] = null;

		for (int i = re; i < vet.length - 1; i++) {
			aux = vet[i];
			vet[i] = vet[i + 1];
			vet[i + 1] = aux;
		}

		return vet;
	}

	public static void PrintString(String[] st) {
		for (String i : st) {
			if (i != null) {
				System.out.println(i);
			}
		}
	}
}
