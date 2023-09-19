package automoveis;
public class Carro extends Veiculo {
    
    public void turnOn() {
        checkExchangeRate();
        checksFuel();
        System.out.println("CARRO LIHADO!");
    }

    private void checksFuel() {
        System.out.println("Conferindo combustível");
    }

    private void checkExchangeRate() {
        System.out.println("Conferindo cambio em P");
    }
}
