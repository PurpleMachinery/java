package strings;

public class ex4 {
	public static void main(String args[]) {
		int soma = 74 + 3, subtracao = 74 - 3;
		double multi = 74 * 3;
		float divi = 74 / 3f;

		String teste = "SOMA";//  <-- adicione os 4 primeiros caracteres da operação --> //

		if (teste.equals("SOMA")||teste.equals("soma"))
			System.out.println("Soma: " + soma);
		else if (teste.equals("SUBT")||teste.equals("subt"))
			System.out.println("Subtração: " + subtracao);
		else if (teste.equals("MULT")||teste.equals("mult"))
			System.out.println("Multiplicação: " + multi);
		else if (teste.equals("DIVI")||teste.equals("divi"))
			System.out.println(String.format("Divisão: %f", divi));
	}
}
