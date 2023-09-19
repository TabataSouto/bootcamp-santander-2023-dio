package messengers;

import messengers.apps.Facebook;
import messengers.apps.MsnMessenger;
import messengers.apps.ServicoMensagem;
import messengers.apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		ServicoMensagem smi = null;
		/*
		 * NÃO SE SABE QUAL APP
		 * MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido = "msn";

		if (appEscolhido.equals("msn")) {
			smi = new MsnMessenger();
		} else if (appEscolhido.equals("fbm")) {
			smi = new Facebook();
		} else if (appEscolhido.equals("tlg")) {
			smi = new Telegram();
		}

		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
