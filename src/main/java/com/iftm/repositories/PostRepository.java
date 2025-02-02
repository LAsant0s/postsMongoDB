package com.iftm.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iftm.models.entities.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
