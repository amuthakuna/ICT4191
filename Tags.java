package com.example.demo.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.OneToMany;

public class Tags {
	private int Id;
	private String name;
	private Date CreatedAt;
	private Date UpdatedAt;
	
	@OneToMany(mappedBy = "tag")
	private List<Video_Has_Tags>videohastags;

	public Tags(int id, String name, Date createdAt, Date updatedAt, List<Video_Has_Tags> videohastags) {
		super();
		Id = id;
		this.name = name;
		CreatedAt = createdAt;
		UpdatedAt = updatedAt;
		this.videohastags = videohastags;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedAt() {
		return CreatedAt;
	}

	public void setCreatedAt(Date createdAt) {
		CreatedAt = createdAt;
	}

	public Date getUpdatedAt() {
		return UpdatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		UpdatedAt = updatedAt;
	}

	public List<Video_Has_Tags> getVideohastags() {
		return videohastags;
	}

	public void setVideohastags(List<Video_Has_Tags> videohastags) {
		this.videohastags = videohastags;
	}
	
	
}
