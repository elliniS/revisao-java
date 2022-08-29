package ex8;

public class ex8 {

	public static void main(String[] args) {
		String[] st = new String[3];

		for (int i = 0; i < 3; i++) {
			st[i] = ("") + i;
		}

		System.out.println("Elementos:");
		PrintString(st);

		System.out.println("verificacao:");
		Verifica(st);

		System.out.println("Tamanho:");
		System.out.println(st.length);

		System.out.println("ultimo valor");
		System.out.println(st[st.length - 1]);

	}

	public static void PrintString(String[] st) {
		for (String i : st) {
			System.out.println(i);
		}
	}

	public static void Verifica(String[] st) {
		if (st != null) {
			System.out.println("vetor nao esa vazio");
		} else {
			System.out.println("vetor esta vazio");
		}
	}

}
