package exercicios2;

public class Geometricas {
	String tipo;
	double base, altura;

	void setTipo(String tipo) {
		this.tipo = tipo;
	}

	String getTipo() {
		return tipo;
	}

	void calArea(double base, double altura) {
		if (tipo.equals("circulo")) {
			this.base = base /2;
			this.base = base * base;
			this.base *= 3.14;
		} else if (tipo.equals("quadrado")) {
			this.base = base * base;
		} else if (tipo.equals("retangulo")) {
			this.base = base * altura;
		}
		else{
			System.out.println("tipo errado.");
		}
	}

	double getArea() {
		return base;
	}
}
