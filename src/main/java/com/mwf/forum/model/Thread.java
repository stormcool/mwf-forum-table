package com.mwf.forum.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the thread database table.
 * 
 */
@Entity
//@NamedQuery(name="Thread.findAll", query="SELECT t FROM Thread t")
public class Thread implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="thread_id")
	private Long threadId;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="modified_by")
	private String modifiedBy;

	@Column(name="modified_date")
	private Timestamp modifiedDate;

	private String name;

	//bi-directional many-to-one association to Post
//	@OneToMany(mappedBy="thread")
//	private List<Post> posts;

	//bi-directional many-to-one association to Topic
//	@ManyToOne
//	@JoinColumn(name="topic_id")
//	private Topic topic;

	public Thread() {
	}

	public Long getThreadId() {
		return this.threadId;
	}

	public void setThreadId(Long threadId) {
		this.threadId = threadId;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public List<Post> getPosts() {
//		return this.posts;
//	}
//
//	public void setPosts(List<Post> posts) {
//		this.posts = posts;
//	}
//
//	public Post addPost(Post post) {
//		getPosts().add(post);
//		post.setThread(this);
//
//		return post;
//	}
//
//	public Post removePost(Post post) {
//		getPosts().remove(post);
//		post.setThread(null);
//
//		return post;
//	}

//	public Topic getTopic() {
//		return this.topic;
//	}
//
//	public void setTopic(Topic topic) {
//		this.topic = topic;
//	}

}