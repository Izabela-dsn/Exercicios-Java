
public class ConversaoDeUnidadesDeVolume {
	
	public static void LitroParaCentimetroCubico(double valor) {
		valor *= 1000;
		System.out.println("Centímetros cúbicos: "+valor);
	}
	
	public static void MetroCubicoParaLitro(double valor) {
		valor *= 1000;
		System.out.println("Litros: "+valor);
	}
	
	public static void MetroCubicoParaPesCubico(double valor) {
		valor *= 35.32;
		System.out.println("Pés Cubicos: "+valor);
	}
	
	public static void MetroCubicoParaCentimetroCubico(double valor) {
		valor *= 1000000;
		System.out.println("Centimetro Cubicos: "+valor);
	}
	
	
	public static void GalaoAmericanoParaPolegadaCubica(double valor) {
		valor *= 231;
		System.out.println("Polegadas Cúbicas: "+valor);
	}
	
	public static void GalaoAmricanoParaLitro(double valor) {
		valor *= 3.785;
		System.out.println("Litros: "+valor);
	}
}
