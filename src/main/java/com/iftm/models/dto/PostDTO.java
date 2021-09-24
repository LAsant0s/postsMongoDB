package com.iftm.models.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.iftm.models.embedded.Author;
import com.iftm.models.embedded.Comment;
import com.iftm.models.entities.Post;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostDTO {

	private String id; 
	private Instant moment;
	private String title;
	private String body;
	
	private Author author;
	
	private List<Comment> comments = new ArrayList<>();

	public PostDTO(String id, Instant moment, String title, String body, Author author) {
		this.id = id;
		this.moment = moment;
		this.title = title;
		this.body = body;
		this.author = author;
	}
	
	public PostDTO(Post entity) {
		this.id = entity.getId();
		this.moment = entity.getMoment();
		this.title = entity.getTitle();
		this.body = entity.getBody();
		this.author = entity.getAuthor();
		this.comments.addAll(entity.getComments());
	}
	
}
