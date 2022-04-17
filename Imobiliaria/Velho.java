
public class Velho extends Imovel{
	private double desconto;
	private double novoPrecoComAdicional;
	
	public double getPreco() {
		return super.getPreco();
	}
	
	public void novoPreco(){
		desconto = getPreco() * 0.3;
		novoPrecoComAdicional = getPreco() - desconto;
		System.out.println("Valor: " + novoPrecoComAdicional);
	}
}
