package com.devsuperior.movieflix.dto;

import com.devsuperior.movieflix.entities.Review;

public class NewMovieReviewDTO {
	
	
	private Long id;
	private String text;
	private Long movieId;
	private UserDTO user;
	
	public NewMovieReviewDTO() {}
	
	
	public NewMovieReviewDTO(Long id, String text, Long movieId, UserDTO user) {
		super();
		this.id = id;
		this.text = text;
		this.movieId = movieId;
		this.user = user;
	}
	
	public NewMovieReviewDTO(Review entity) {
		this.id = entity.getId();
		this.text = entity.getText();
		this.movieId = entity.getMovie().getId();
	}
			
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}

}
