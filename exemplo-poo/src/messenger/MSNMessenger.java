package messenger;

public class MSNMessenger extends InstantMessagingService {

	public MSNMessenger() {
		super();
		System.out.println(getName());
	}

	private String getName() {
		return "MSN Messenger\n".toUpperCase();
	}

	public void enviarMensagem() {
		validarConctadoInternet();
		System.out.println("Enviando mensagem pelo " + getName());
		salvarHistoricoMensagem();
	}

	public void receberMensagem() {
		validarConctadoInternet();
		System.out.println("Recebendo mensagem pelo " + getName());
		salvarHistoricoMensagem();
	}

}
