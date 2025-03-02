package messenger;

public class ComputadorUsuario {
	public static void main(String[] args) {
		MSNMessenger msn = new MSNMessenger();

		msn.enviarMensagem();
		
		msn.receberMensagem();
	}
}
