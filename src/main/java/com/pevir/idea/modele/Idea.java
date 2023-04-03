package com.pevir.idea.modele;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Idea {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	
	@Column(name="title", nullable = true)
	private String title;
	
	@Column(name="content", nullable = true)
	private String content;
	
	@Column(name="status", nullable = true)
	private int status;

	public Idea() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Idea(int id, String title, String content, int status) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.status = status;
	}

}
