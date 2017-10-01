package es.miw.upm.builder;

import es.miw.upm.modelo.Issue;
import es.miw.upm.modelo.User;

public class IssueBuilder {
	
	private Issue newIssue;
	
	public IssueBuilder(long id) {
		this.newIssue = new Issue(id);
	}
	
	public IssueBuilder title(String title) {
		this.newIssue.setTitle(title);
		return this;
	}
	
	public IssueBuilder description(String description) {
		this.newIssue.setDescription(description);
		return this;
	}
	
	public IssueBuilder opened(boolean opened) {
		this.newIssue.setOpened(opened);
		return this;
	}
	
	public IssueBuilder user(User user) {
		this.newIssue.setUsuario(user);
		return this;
	}
	
	public Issue build() {
		return this.newIssue;
	}

}
