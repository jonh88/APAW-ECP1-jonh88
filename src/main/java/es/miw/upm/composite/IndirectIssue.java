package es.miw.upm.composite;

import es.miw.upm.modelo.Issue;

public class IndirectIssue extends IndirectIssueComponent{
	
	private Issue issue;
	
	public IndirectIssue (Issue issue) {
		this.issue = issue;
	}
		
	public Issue getIssue() {
		return issue;
	}

	@Override
	public void closeIssue() {
		this.issue.setOpened(false);
	}

	@Override
	public boolean isComposed() {
		return false;
	}
		
}
