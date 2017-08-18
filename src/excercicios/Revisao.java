package excercicios;
public class Revisao {
	public static void main(String args[]){
		/*int i = 10;
		double d = 10;
		while(i <100){
			System.out.println("1: " + i);
			i++;
		}
		for(int x=0;x<100; x++){
			System.out.println("2: "+x);
		}
		i = 10;
		do{
			System.out.println("3: "+i);
			i++;
		}while(i<100);*/
		
		for(int i = 0;i <= 10;i++){
			System.out.print(i+" ");
		}
		System.out.print("\n");
		for(int x = 1;x<=10;x++){
			for(int i=1;i<=10&&x<=10;i++){
				System.out.println(x+" X "+i+" = "+i*x);
			}
		}
	}
}
