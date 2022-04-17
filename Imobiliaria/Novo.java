
public class Novo extends Imovel{
	private double adicional;
	private double novoPrecoComAdicional;
	
	public double getPreco() {
		return super.getPreco();
	}
	
	public void novoPreco(){
		adicional = getPreco() * 0.5;
		novoPrecoComAdicional = adicional + getPreco();
		System.out.println("Valor: " + novoPrecoComAdicional);
	}
}
