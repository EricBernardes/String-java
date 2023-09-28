public class TestaString {
	public static void main(String[] args) {
		String[] palavras = { "Vamos", "fugir", "desse", "Lugar" };

		for (String palavra : palavras) {
			System.out.print(palavra + " ");
		}

		System.out.printf("\n");

		for (int i = 0; i < palavras.length; i++) {
			System.out.print(palavras[i] + " ");
		}
	}
}