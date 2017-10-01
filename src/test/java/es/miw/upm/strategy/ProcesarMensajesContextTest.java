package es.miw.upm.strategy;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ProcesarMensajesContextTest {
	
	@Test
	public void testSmsSender() {
		ProcesarMensajesContext procesadorMensajes = new ProcesarMensajesContext(new SMSSender());
		
		String resultado = procesadorMensajes.procesar();
		
		assertTrue(resultado.contains("SMS"));
	}

	
	@Test
	public void testEmailSender() {
		ProcesarMensajesContext procesadorMensajes = new ProcesarMensajesContext(new EmailSender());
		
		String resultado = procesadorMensajes.procesar();
		
		assertTrue(resultado.contains("EMAIL"));
	}
}
