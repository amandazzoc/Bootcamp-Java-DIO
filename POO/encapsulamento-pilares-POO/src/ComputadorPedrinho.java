
/*
 * Simulação do uso da classe MSNMessenger
 */

public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		var msn = new MSNMessenger();
		
		// msn.validarConectadoInternet(); não precisa aparecer para o pedrinho isso
		msn.enviarMensagem();
		// msn.salvarHistoricoMensagem(); não precisa aparecer para o pedrinho isso
		
		msn.receberMensagem();
	}
}
