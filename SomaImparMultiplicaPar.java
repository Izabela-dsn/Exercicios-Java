
public class SomaImparMultiplicaPar {

	public static void main(String[] args) {
		int soma = 0;
		double multiplicacao = 1;
		
		for(int numeros = 1; numeros < 30; numeros++) {
			if(numeros % 2 == 0) {
				multiplicacao *= numeros;
				//System.out.println(numeros + " " + multiplicacao);
			}else {
				soma += numeros;
				//System.out.println(numeros + " " + soma);
			}
		}
		
		System.out.println("Soma dos números pares entre 0 e 30: " + soma);
		System.out.println("Multiplicação dos números pares entre 0 e 30: " + multiplicacao);
		
	}

}
