
public class TestaContaCorrente {

	public static void main(String[] args) {
		ContaCorrente conta1  = new ContaCorrente();
		conta1.depositar(100.0);
		conta1.saberSaldo();
		conta1.sacar(50.0);
		conta1.saberSaldo();
	}

}
