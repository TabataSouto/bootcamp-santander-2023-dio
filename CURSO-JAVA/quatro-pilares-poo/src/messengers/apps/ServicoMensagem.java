package messengers.apps;

public abstract class ServicoMensagem {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarInternet() {
        System.out.println("Validando se está conectado a internet");
    }
}
