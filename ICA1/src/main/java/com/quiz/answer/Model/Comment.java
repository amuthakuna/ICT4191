package com.quiz.answer.Model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
public class Comment {
	@Id
	private long CommentId;
	private String Comment;
	private Date CommentedOn;
	@ManyToOne
	@JoinColumn(name="commented_by",referencedColumnName ="UserId")
	private User CommentedBy;
	
	@ManyToOne
	@JoinColumn(name="commented_in",referencedColumnName ="PostId")
	private Post CommentedIn;

	public Comment() {
		
	}
	
	

	public Comment(long commentId, String comment, Date commentedOn, User commentedBy, Post commentedIn) {
		super();
		CommentId = commentId;
		Comment = comment;
		CommentedOn = commentedOn;
		CommentedBy = commentedBy;
		CommentedIn = commentedIn;
	}


	public User getCommentedBy() {
		return CommentedBy;
	}



	public void setCommentedBy(User commentedBy) {
		CommentedBy = commentedBy;
	}



	public Post getCommentedIn() {
		return CommentedIn;
	}



	public void setCommentedIn(Post commentedIn) {
		CommentedIn = commentedIn;
	}



	public long getCommentId() {
		return CommentId;
	}

	public void setCommentId(long commentId) {
		CommentId = commentId;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

	public Date getCommentedOn() {
		return CommentedOn;
	}

	public void setCommentedOn(Date commentedOn) {
		CommentedOn = commentedOn;
	}
	
	
}
