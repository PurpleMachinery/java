package metodos;

public class Calculo {
	public double soma(double n, double b) {
		double total;
		return total = n + b;
	}

	public double div(double x, double y) {
		double total;
		return total = x / y;
	}

	public static void main(String args[]) {
		Calculo calc = new Calculo();
		System.out.println(calc.soma(4, 5));
		System.out.println(calc.div(10, 2));
	}
}
