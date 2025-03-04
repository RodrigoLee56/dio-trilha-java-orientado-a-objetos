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
		System.out.println("Enviando mensagem pelo " + getName());

	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo " + getName());
	}

}
