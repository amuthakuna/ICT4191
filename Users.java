package com.example.demo.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.OneToMany;

public class Users {
	private int Id;
	private String Login;
	private String Email;
	private Date ConnectionDate;
	private String Token;
	private String Profile_photo;
	private Date CreatedAt;
	private Date UpdatedAt;
	
	@OneToMany(mappedBy = "user")
	private List<User_comment_Videos>usercommentvideos;
	
	@OneToMany(mappedBy = "user")
	private List<Videos>video;

	public Users(int id, String login, String email, Date connectionDate, String token, String profile_photo,
			Date createdAt, Date updatedAt, List<User_comment_Videos> usercommentvideos, List<Videos> video) {
		super();
		Id = id;
		Login = login;
		Email = email;
		ConnectionDate = connectionDate;
		Token = token;
		Profile_photo = profile_photo;
		CreatedAt = createdAt;
		UpdatedAt = updatedAt;
		this.usercommentvideos = usercommentvideos;
		this.video = video;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Date getConnectionDate() {
		return ConnectionDate;
	}

	public void setConnectionDate(Date connectionDate) {
		ConnectionDate = connectionDate;
	}

	public String getToken() {
		return Token;
	}

	public void setToken(String token) {
		Token = token;
	}

	public String getProfile_photo() {
		return Profile_photo;
	}

	public void setProfile_photo(String profile_photo) {
		Profile_photo = profile_photo;
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

	public List<User_comment_Videos> getUsercommentvideos() {
		return usercommentvideos;
	}

	public void setUsercommentvideos(List<User_comment_Videos> usercommentvideos) {
		this.usercommentvideos = usercommentvideos;
	}

	public List<Videos> getVideo() {
		return video;
	}

	public void setVideo(List<Videos> video) {
		this.video = video;
	}
	
	
}
