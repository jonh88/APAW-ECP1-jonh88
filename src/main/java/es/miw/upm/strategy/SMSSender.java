package es.miw.upm.strategy;

public class SMSSender implements IEnviarMensaje {

	public SMSSender() {
		
	}
	
	@Override
	public String enviar() {
		return "Se ha enviado el mensaje por SMS";
	}

}
