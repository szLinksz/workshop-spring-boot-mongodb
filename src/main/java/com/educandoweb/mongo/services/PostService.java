package com.educandoweb.mongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.mongo.domain.Post;
import com.educandoweb.mongo.repository.PostRepository;
import com.educandoweb.mongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	
	@Autowired
	private PostRepository repository;
	

	
	public Post findById(String id) {
		Optional<Post> post = repository.findById(id);
		
		return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
}
	
	