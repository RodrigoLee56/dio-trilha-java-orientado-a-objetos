package messenger;

public class InstantMessagingService {
	public void enviarMensagem() {
		validarConctadoInternet();
		System.out.println("Enviando mensagem");
//		pelo MSN Messenger
		salvarHistoricoMensagem();
	}

	public void receberMensagem() {
		validarConctadoInternet();
		System.out.println("Recebendo mensagem");
		salvarHistoricoMensagem();
	}

	private void validarConctadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}

	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o hitórico de mensagem\n");
	}
}
