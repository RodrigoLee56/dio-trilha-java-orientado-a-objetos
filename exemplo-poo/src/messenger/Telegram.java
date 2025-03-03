package messenger;

public class Telegram extends InstantMessagingService {
	public Telegram() {
		super();
		getName();
	}
	
	private void getName() {
		System.out.println("Telegram\n".toUpperCase());
	}
}
