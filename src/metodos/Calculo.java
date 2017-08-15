package metodos;

public class Calculo {
	public double soma(double x, double y) {
		double total;
		return total = x + y;
	}

	public double div(double x, double y) {
		double total;
		return total = x / y;
	}

	public double mult(double x, double y) {
		double total;
		return total = x * y;
	}

	public double sub(double x, double y) {
		double total;
		return total = x - y;
	}

	public static void main(String args[]) {
		Calculo calc = new Calculo();
		System.out.println(calc.soma(4, 5));
		System.out.println(calc.div(10, 2));
		System.out.println(calc.mult(2, 7));
		System.out.println(calc.sub(4, 3));
	}
}
