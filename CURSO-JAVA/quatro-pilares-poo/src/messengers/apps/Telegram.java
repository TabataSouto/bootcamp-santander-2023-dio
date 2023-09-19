package messengers.apps;

public class Telegram extends ServicoMensagem {
	public void enviarMensagem() {
		validarInternet();
		System.out.println("Enviando mensagem pelo Telegram");
	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
}
