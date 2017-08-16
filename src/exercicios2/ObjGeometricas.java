package exercicios2;

public class ObjGeometricas {
	public static void main(String args[]) {
		Geometricas geo = new Geometricas();
		geo.tipo = "circulo";
		geo.calArea(15,15);
		System.out.println(geo.getTipo());
		System.out.println(geo.getArea());
	}
}
