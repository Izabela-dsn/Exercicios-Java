
public class ContadorMultiplo10 {
	
	public static void main(String[] args) {
		for(int numero = 1; numero <= 100; numero++) {
			if(numero % 10 == 0) {
				System.out.println(numero + " � multiplo de 10");
			}
			else {
				System.out.println(numero);
			}
		}
	}
}
