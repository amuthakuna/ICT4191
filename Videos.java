package com.example.demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Videos {
	@Id
	private int Id;
	private String Login;
	private String password;
	private String Token;
	
	@OneToMany(mappedBy = "video")
	private List<Video_Has_Tags>videohastags;
	
	
	@OneToMany(mappedBy = "video")
	private List<User_comment_Videos>usercommentvideos;
	
	@ManyToOne
	@JoinColumn(name="user_id",referencedColumnName = "Id")
	private Users user;

	public Videos(int id, String login, String password, String token, List<Video_Has_Tags> videohastags,
			List<User_comment_Videos> usercommentvideos, Users user) {
		super();
		Id = id;
		Login = login;
		this.password = password;
		Token = token;
		this.videohastags = videohastags;
		this.usercommentvideos = usercommentvideos;
		this.user = user;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return Token;
	}

	public void setToken(String token) {
		Token = token;
	}

	public List<Video_Has_Tags> getVideohastags() {
		return videohastags;
	}

	public void setVideohastags(List<Video_Has_Tags> videohastags) {
		this.videohastags = videohastags;
	}

	public List<User_comment_Videos> getUsercommentvideos() {
		return usercommentvideos;
	}

	public void setUsercommentvideos(List<User_comment_Videos> usercommentvideos) {
		this.usercommentvideos = usercommentvideos;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	
}
