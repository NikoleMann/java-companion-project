package com.organization.mvcproject.MGL_Task1.model;

import org.springframework.stereotype.Component;

@Component
public class Game {

	private Long id;
	private String name;
	private String genre;

	public Long getid() {
		return id;
	}

	public void setid(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGame_genre() {
		return genre;
	}

	public void setGame_genre(String genre) {
		this.genre = genre;
	}

}
