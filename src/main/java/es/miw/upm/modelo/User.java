package es.miw.upm.modelo;

import java.util.Calendar;

public class User {
	private long id;
	private String name;
	private Calendar birthdate;
	private boolean active;
	
	
	public User(long id, String name){
		this.id = id;			
		this.name = name;
		this.active = true;
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


	public long getId() {
		return id;
	}
	
	
	
}
