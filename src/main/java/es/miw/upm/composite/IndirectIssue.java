package es.miw.upm.composite;

import es.miw.upm.modelo.Issue;

public class IndirectIssue extends IndirectIssueComponent{
	
	private Issue issue;

	@Override
	public void closeIssue() {
		this.issue.setOpened(false);
	}
	
	

}
