package es.miw.upm.strategy;

public class EmailSender implements IEnviarMensaje{
	
	public EmailSender() {
		
	}

	@Override
	public String enviar() {		
		return "Se ha enviado el mensaje por EMAIL";
	}

}
