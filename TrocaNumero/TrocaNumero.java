
public class TrocaNumero {
	private int aux;
	
	public void RecebeETrocaNumeros(int NumA, int NumB) {
		System.out.println("NumA: " + NumA + " , NumB: " + NumB);
		this.aux = NumA;
		NumA = NumB;
		NumB = this.aux;
		System.out.println("Após a troca NumA: " + NumA + " , NumB: " + NumB);
	}
}
