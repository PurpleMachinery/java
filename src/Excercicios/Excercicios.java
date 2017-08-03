package Excercicios;
public class Excercicios {
	public static void main(String args[]){
		String sexto, cursodejava = "Curso de Java";
		System.out.println("3º: "+cursodejava);
		cursodejava+=" - Exemplo String";
		System.out.println("4º: "+cursodejava);
		System.out.println("5º: "+cursodejava.length());
		String[] novastring=cursodejava.split(" - ");
		System.out.println("6º: "+novastring[1]);
		sexto=cursodejava.substring(16, 30);
		System.out.println("7º: "+sexto);
	}
}
