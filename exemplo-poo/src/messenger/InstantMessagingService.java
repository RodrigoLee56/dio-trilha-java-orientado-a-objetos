package messenger;

public abstract class InstantMessagingService {
	public abstract void enviarMensagem();

	public abstract void receberMensagem();

	protected void validarConctadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}

	protected void salvarHistoricoMensagem() {
		System.out.println("Salvando o hitórico de mensagem\n");
	}
}
