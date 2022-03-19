
public class ContaCorrente {
	private double saldo;
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor + (valor*0.05);
			return true;
		}else {
			return false;
		}
	}
	
	public void saberSaldo() {
		System.out.println("Saldo atual: " + this.saldo);
	}
}
