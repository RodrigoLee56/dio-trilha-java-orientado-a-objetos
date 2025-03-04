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
		System.out.println("Enviando mensagem pelo " + getName());

	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo " + getName());
	}
}
