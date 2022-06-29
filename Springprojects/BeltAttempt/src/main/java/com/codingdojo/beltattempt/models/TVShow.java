package com.codingdojo.beltattempt.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="tvshows")
public class TVShow {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotEmpty(message="required field!")
    @Size(min=3, message="must be at least 3 characters")
    private String title;
	
	@NotEmpty(message="required field!")
    @Size(min=3, message="must be at least 3 characters")
    private String network;
	
	@NotEmpty(message="required field!")
    @Size(min=3, message="must be at least 3 characters")
    private String description;
	
	@NotNull(message="required field!")
	@DecimalMin(value="1.0", message="must have a value between 1 and 5")
	@DecimalMax(value="5.0", message="must have a value between 1 and 5")
    private double rating;
		
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User creator;
    
    public TVShow() {

	}
    
    public TVShow(String title, String network, String description, double rating, User creator) {
		this.title = title;
		this.network = network;
		this.description = description;
		this.rating = rating;
		this.creator = creator;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	@PrePersist
   	protected void onCreate() {
   		this.createdAt = new Date();
   	}
   	
   	@PreUpdate
   	protected void onUpdate() {
   		this.updatedAt = new Date();
   	}
    
}
