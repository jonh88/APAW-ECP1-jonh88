package es.miw.upm.builderDefensa;

import java.util.Calendar;
import java.util.List;

import es.miw.upm.builderDefensa.modeloDefensa.Issue;
import es.miw.upm.builderDefensa.modeloDefensa.User;

public class UserBuilder {
	private User user;
	
	public UserBuilder(long id, String name) {
		this.user = new User(id, name);
	}
	
	public UserBuilder birthDate(Calendar birthDate) {
		this.user.setBirthdate(birthDate);
		return this;
	}
	
	public UserBuilder active (boolean active) {
		this.user.setActive(active);
		return this;
	}
	
	public UserBuilder issues(List<Issue> listIssues) {
		this.user.setIssues(listIssues);
		return this;		
	}
	
	public UserBuilder addSingleIssue(Issue newIssue) {
		for (Issue issue: this.user.getIssues()) {
			if (issue.getId() == newIssue.getId()) {
				return this;
			}
		}				
		this.user.getIssues().add(newIssue);
		return this;
	}
	
	public User build() {
		return this.user;
	}
}
