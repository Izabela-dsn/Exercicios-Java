
public class Tabuada {

	public static void main(String[] args) {
		
		for(int multiplicando = 0; multiplicando <= 10; multiplicando++) {
			for(int multiplicador = 0; multiplicador <= 10; multiplicador++) {
				System.out.println(multiplicando + " x " + multiplicador + " = " + multiplicando*multiplicador);
			}
			System.out.println("\n");
		}

	}

}
