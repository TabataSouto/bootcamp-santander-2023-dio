package automoveis;
public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("89854");
		jeep.turnOn();

		Moto z400 = new Moto();
		z400.setChassi("553636");
		z400.turnOn();
	}
}
