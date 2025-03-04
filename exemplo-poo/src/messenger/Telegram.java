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
		System.out.println("Enviando mensagem pelo " + getName());

	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo " + getName());
	}
}
