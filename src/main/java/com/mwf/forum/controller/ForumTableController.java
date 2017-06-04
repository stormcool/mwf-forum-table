package com.mwf.forum.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mwf.forum.model.Topic;
import com.mwf.forum.repository.TopicRepository;

@RestController
@RequestMapping("/forum/topics")
public class ForumTableController {
	
	private final TopicRepository topicRepository;
	
	@Autowired
	ForumTableController(TopicRepository topicRepository){
		this.topicRepository=topicRepository;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	Iterable<Topic> retrieveAllTopics(){
		return this.topicRepository.findAll();
	}
	
	
}
