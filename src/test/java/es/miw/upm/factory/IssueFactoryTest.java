package es.miw.upm.factory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import es.miw.upm.modelo.Issue;

public class IssueFactoryTest {
	
	private IssueFactory issueFactory;
	private Issue newIssue;
	private long id;
	
	@Before
	public void before() {
		this.id = 145875L;
		this.issueFactory = IssueFactory.getInstance();
		this.newIssue = new Issue(this.id);
		
		this.issueFactory.insertIssue(newIssue);
	}
	
	@Test
	public void getExistentIssueTest() {
		Issue issue = this.issueFactory.get(id);
		
		assertNotNull(issue);	
	}
	
	@Test
	public void getNonExistentIssueTest() {
		Issue issue = this.issueFactory.get(1L);
		
		assertNull(issue);
	}
	
	@Test
	public void singletonFactoryTest() {
		IssueFactory sameIssueFactory = IssueFactory.getInstance();
		
		assertSame(sameIssueFactory, this.issueFactory);
	}

}
