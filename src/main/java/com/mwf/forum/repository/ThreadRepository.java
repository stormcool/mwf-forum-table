package com.mwf.forum.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.mwf.forum.model.Thread;

public interface ThreadRepository extends PagingAndSortingRepository<Thread, Long> {

	
    @Query("SELECT c FROM Thread c where c.threadId = :id") 
	Thread findNameById(@Param("id") Long id);
	
}
