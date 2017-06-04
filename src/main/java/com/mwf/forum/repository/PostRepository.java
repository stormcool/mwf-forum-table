package com.mwf.forum.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.mwf.forum.model.Post;
import com.mwf.forum.model.Thread;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {

	
    @Query("SELECT c FROM Post c where c.postId = :id") 
	Post findNameById(@Param("id") Long id);
	
}
