package com.mwf.forum.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mwf.forum.model.Topic;
import com.mwf.forum.model.Thread;
import com.mwf.forum.repository.ThreadRepository;
import com.mwf.forum.repository.TopicRepository;

@RestController
@RequestMapping("/forum/threads")
public class ForumThreadController {
	
	private final ThreadRepository threadRepository;
	
	@Autowired
	ForumThreadController(ThreadRepository threadRepository){
		this.threadRepository=threadRepository;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	Iterable<Thread> retrieveAllTopics(){
		return this.threadRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{threadId}")
	Thread retrieveTopic(@PathVariable Long threadId){
		return this.threadRepository.findNameById(threadId);
	}
	
	
	
}
