package es.miw.upm.builderDefensa.modeloDefensa;

public class Issue {
	private long id;
	private String title;
	private String description;
	private boolean opened;
	
	public Issue(long id, String title) {
		this.id = id;
		this.title = title;
		this.description = "";
	}
	
	public long getId() {
		return id;
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

}
