package model;

import java.io.Serializable;

public class Movie implements Serializable{

	private long id;
	private String title;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(String title) {
		super();
		this.title = title;
	}

	public Movie(long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + "]";
	}
	
	
}
