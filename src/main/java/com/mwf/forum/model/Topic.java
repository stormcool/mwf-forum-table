package com.mwf.forum.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;


/**
 * The persistent class for the topic database table.
 * 
 */
@Entity
//@NamedQuery(name="Topic.findAll", query="SELECT t FROM Topic t")
public class Topic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="topic_id")
	private Long topicId;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="modified_by")
	private String modifiedBy;

	@Column(name="modified_date")
	private Timestamp modifiedDate;

	private String name;

	//bi-directional many-to-one association to Thread
	@OneToMany(targetEntity=Thread.class, fetch=FetchType.LAZY)
	@JoinColumn(name="topic_id")
	private List<Thread> threads;

	public Topic() {
	}

	public Long getTopicId() {
		return this.topicId;
	}

	public void setTopicId(Long topicId) {
		this.topicId = topicId;
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


	public List<Thread> getThreads() {
		return this.threads;
	}

	public void setThreads(List<Thread> threads) {
		this.threads = threads;
	}

}