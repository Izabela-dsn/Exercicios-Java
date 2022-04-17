
public class TesteImobiliaria {
	public static void main(String[] args) {
		
		Novo imovel = new Novo();
		imovel.setEndereco("Rua Bahia, 248");
		System.out.println("Endereço: " + imovel.getEndereco());
		imovel.novoPreco();
		
		Velho imovel2 = new Velho();
		imovel2.setEndereco("Rua Ubirata, 365");
		System.out.println("Endereço: " + imovel2.getEndereco());
		imovel2.novoPreco();
	}
}
