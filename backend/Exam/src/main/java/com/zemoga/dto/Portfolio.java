package com.zemoga.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	
@Table(name="portfolio")
public class Portfolio {

	@Column
	@Id
	private Integer idportfolio;
	
	@Column
	private String description;
	
	@Column(name="image_url")
	private String imageUrl;
	
	@Column(name="twitter_user_name")
	private String twitterUserName;
	
	@Column(name="title")
	private String title;

	public Integer getIdProfolio() {
		return idportfolio;
	}

	public void setIdProfolio(Integer idProfolio) {
		this.idportfolio = idProfolio;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getTwitterUserName() {
		return twitterUserName;
	}

	public void setTwitterUserName(String twitterUserName) {
		this.twitterUserName = twitterUserName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
