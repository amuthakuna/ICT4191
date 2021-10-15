package com.example.demo.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Video_Has_Tags implements Serializable{
	private String test;
	private Date CreatedAt;
	private Date UpdatedAt;
	
	@Id
	@ManyToOne
	@JoinColumn(name="video_id",referencedColumnName = "Id")
	private Videos video;
	
	@Id
	@ManyToOne
	@JoinColumn(name="tag_id",referencedColumnName = "Id")
	private Tags tag;

	public Video_Has_Tags(String test, Date createdAt, Date updatedAt, Videos video, Tags tag) {
		super();
		this.test = test;
		CreatedAt = createdAt;
		UpdatedAt = updatedAt;
		this.video = video;
		this.tag = tag;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
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

	public Videos getVideo() {
		return video;
	}

	public void setVideo(Videos video) {
		this.video = video;
	}

	public Tags getTag() {
		return tag;
	}

	public void setTag(Tags tag) {
		this.tag = tag;
	}

	
	
	
}
