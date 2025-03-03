package messenger;

public class FacebookMessenger extends InstantMessagingService {
	public FacebookMessenger() {
		super();
		getName();
	}
	
	private void getName() {
		System.out.println("Facebook Messenger\n".toUpperCase());
	}
}
