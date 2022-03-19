
public class MaiorMenorNumero {

	public static void main(String[] args) {
		int numeroUm = 50;
		int numeroDois = 50;
		
		
		System.out.println("Os números são: " + numeroUm + ", " + numeroDois);
		
		if(numeroUm > numeroDois) {
			System.out.println("O primeiro número é maior");
		}
		else if(numeroDois > numeroUm) {
			System.out.println("O segundo número é maior");
		}else{
			System.out.println("Os números são iguais.");
		}

	}

}
