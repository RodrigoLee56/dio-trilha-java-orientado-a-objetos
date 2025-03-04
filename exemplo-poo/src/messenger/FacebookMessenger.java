package messenger;

public class FacebookMessenger extends InstantMessagingService {
	public FacebookMessenger() {
		super();
		System.out.println(getName());
	}
	
	private String getName() {
		return "Facebook Messenger\n".toUpperCase();
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
