package messengers.apps;

public class Facebook extends ServicoMensagem {
	public void enviarMensagem() {
		validarInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
}
