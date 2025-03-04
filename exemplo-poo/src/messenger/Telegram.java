package messenger;

public class Telegram extends InstantMessagingService {
	public Telegram() {
		super();
		System.out.println(getName());
	}

	private String getName() {
		return "Telegram\n".toUpperCase();
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
