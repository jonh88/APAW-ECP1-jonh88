package es.miw.upm.composite;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import es.miw.upm.modelo.Issue;

public class IndirectIssueComponentTest {
	
	private IndirectIssueComposite root;
	private IndirectIssueComposite intermedio;
	private IndirectIssue leaf1, leaf2, leaf3;
	
	@Before
	public void before() {
	
		Issue issue = new Issue(1L);
		Issue issue2 = new Issue(2L);
		Issue issue3 = new Issue(3L);		
		
		this.root= new IndirectIssueComposite();
		this.leaf1 = new IndirectIssue(issue);
		this.root.add(leaf1);
		
		this.intermedio = new IndirectIssueComposite();
		this.leaf2 = new IndirectIssue(issue2);
		this.leaf3 = new IndirectIssue(issue3);
		this.intermedio.add(leaf2);
		this.intermedio.add(leaf3);
		
		this.root.add(intermedio);						
	}
	
	@Test
	public void TestIsComposed() {
		assertTrue(this.root.isComposed());
		assertTrue(!this.leaf1.isComposed());
	}
	
	@Test
	public void TestCloseIssue() {
		this.root.closeIssue();
		
		assertTrue(!this.leaf1.getIssue().isOpened());
		assertTrue(!this.leaf2.getIssue().isOpened());
		assertTrue(!this.leaf3.getIssue().isOpened());
	}

}
