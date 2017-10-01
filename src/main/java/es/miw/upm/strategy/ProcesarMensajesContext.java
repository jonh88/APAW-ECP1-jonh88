package es.miw.upm.strategy;

public class ProcesarMensajesContext {
	
	private IEnviarMensaje sender;
	
	public ProcesarMensajesContext(IEnviarMensaje sender) {
		this.sender = sender;
	}
	
	public String procesar() {
		return this.sender.enviar();
	}

}
