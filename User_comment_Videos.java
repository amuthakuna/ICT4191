package com.example.demo.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class User_comment_Videos  implements Serializable{
	private String Commentary;
	private Date CreatedAt;
	private Date UpdatedAt;
	
	
	@Id
	@ManyToOne
	@JoinColumn(name="video_id",referencedColumnName = "Id")
	private Videos video;
	
	@Id
	@ManyToOne
	@JoinColumn(name="user_id",referencedColumnName = "Id")
	private Users user;

	public User_comment_Videos(String commentary, Date createdAt, Date updatedAt, Videos video, Users user) {
		super();
		Commentary = commentary;
		CreatedAt = createdAt;
		UpdatedAt = updatedAt;
		this.video = video;
		this.user = user;
	}

	public String getCommentary() {
		return Commentary;
	}

	public void setCommentary(String commentary) {
		Commentary = commentary;
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

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	
}
