package com.mwf.forum.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mwf.forum.model.Topic;
import com.mwf.forum.model.Post;
import com.mwf.forum.model.Thread;
import com.mwf.forum.repository.PostRepository;
import com.mwf.forum.repository.ThreadRepository;
import com.mwf.forum.repository.TopicRepository;

@RestController
@RequestMapping("/forum/posts")
public class ForumPostController {
	
	private final PostRepository postRepository;
	
	@Autowired
	ForumPostController(PostRepository postRepository){
		this.postRepository=postRepository;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	Iterable<Post> retrieveAllPosts(){
		return this.postRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{postId}")
	Post retrievePost(@PathVariable Long postId){
		return this.postRepository.findNameById(postId);
	}
	
	
	
}
