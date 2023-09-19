package messengers.apps;

public class MsnMessenger extends ServicoMensagem {
  public void enviarMensagem() {
    validarInternet();
    System.out.println("Enviando mensagem pelo MSN Messenger");
  }

  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo MSN Messenger");
  }
}