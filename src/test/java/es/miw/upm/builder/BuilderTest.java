package es.miw.upm.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import es.miw.upm.modelo.Issue;
import es.miw.upm.modelo.User;

public class BuilderTest {
	
	private IssueBuilder issueBuilder;	
	private Random random;
	private String titulo, description;	
	private boolean opened;
	private User usuario;
	
	@Before
	public void before() {
		
		this.random = new Random();		
		this.issueBuilder = new IssueBuilder(this.random.nextLong());
		this.description = "Descripcion";
		this.titulo = "Titulo";
		this.opened = true;
		this.usuario = new User(this.random.nextLong(),"Pepe");
		
	}
	
	@Test
	public void testIssueBuilder() {
		Issue issueTest = this.issueBuilder.build();
		assertTrue(issueTest != null);
	}
	
	@Test
	public void testTitle() {		
		Issue issueTest = this.issueBuilder.title(this.titulo).build();		
		assertEquals(this.titulo,issueTest.getTitle());
	}
	
	@Test
	public void testDescription() {		
		Issue issueTest = this.issueBuilder.description(this.description).build();		
		assertEquals(this.description,issueTest.getDescription());
	}

	@Test
	public void testOpened() {	
		Issue issueTest = this.issueBuilder.opened(this.opened).build();		
		assertTrue(issueTest.isOpened());
	}
	
	@Test
	public void testUser() {		
		Issue issueTest = this.issueBuilder.user(usuario).build();		
		assertEquals(this.usuario.getId(),issueTest.getUsuario().getId());
	}
	
	@Test
	public void testAllParams() {
		Issue issueTest = this.issueBuilder.title(titulo).description(description)
				.opened(this.opened).user(this.usuario).build();
		assertEquals(issueTest.getTitle(), this.titulo);
		assertEquals(this.description,issueTest.getDescription());
		assertTrue(issueTest.isOpened());
		assertEquals(this.usuario.getId(),issueTest.getUsuario().getId());
	}	
}
