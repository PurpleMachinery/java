package Excercicios;
public class Excercicios {
	public static void main(String args[]){
		String sexto, cursodejava = "Curso de Java";
		System.out.println("3�: "+cursodejava);
		cursodejava+=" - Exemplo String";
		System.out.println("4�: "+cursodejava);
		System.out.println("5�: "+cursodejava.length());
		String[] novastring=cursodejava.split(" - ");
		System.out.println("6�: "+novastring[1]);
		sexto=cursodejava.substring(16, 30);
		System.out.println("7�: "+sexto);
	}
}
