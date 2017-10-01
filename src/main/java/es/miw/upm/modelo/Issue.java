package es.miw.upm.modelo;

public class Issue {
	private long id;
	private String title;
	private String description;
	private boolean opened;
	private User usuario;
	
	public Issue(long id) {
		this.id = id;		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isOpened() {
		return opened;
	}

	public void setOpened(boolean opened) {
		this.opened = opened;
	}

	public User getUsuario() {
		return usuario;
	}

	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}

	public long getId() {
		return id;
	}
	
	

}
