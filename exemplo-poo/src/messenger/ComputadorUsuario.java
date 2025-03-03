package messenger;

public class ComputadorUsuario {
	public static void main(String[] args) {
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		Telegram telegram = new Telegram();
		telegram.enviarMensagem();
		telegram.receberMensagem();
		
		FacebookMessenger facebookMessenger = new FacebookMessenger();
		facebookMessenger.enviarMensagem();
		facebookMessenger.receberMensagem();
		
	}
}
