// condicional simples
public class CaixaEletronica {
	public static void main(String[] args) {
		double balance = 25.0;
		double requestedAmount = 17.0;

		if (requestedAmount < balance) {
			balance -= requestedAmount;
		}
		System.out.println(balance);
	}
}
