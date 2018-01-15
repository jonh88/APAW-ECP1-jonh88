package es.miw.upm.builderDefensa.modeloDefensa;

import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public class User {

	private long id;
	private String name;
	private Calendar birthdate;
	private boolean active;
	private List<Issue> issues;
	
	public User(long id, String name){
		this.id = id;			
		this.name = name;
		this.issues = new ArrayList<Issue>();
		this.active = true;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Calendar birthdate) {
		this.birthdate = birthdate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<Issue> getIssues() {
		return issues;
	}

	public void setIssues(List<Issue> issues) {
		this.issues = issues;
	}
	
}
