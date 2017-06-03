package com.mwf.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mwf.forum.model.Topic;


@RepositoryRestResource
public interface TopicRepository extends PagingAndSortingRepository<Topic, Long> {
	/**
	 * Method that returns a lista of clients doing a search by the passed name parameter.
	 *  
	 * @param name
	 * @return list of clients
	 */
	List<Topic> findByName(@Param("name") String name);
	
	/**
	 * Method that returns a client with only its name doing a search by the passed id parameter.
	 * 
	 * @param id
	 * @return client of the id passed as parameter.
	 */   
    @Query("SELECT c FROM Topic c where c.topic_id = :id") 
	Topic findNameById(@Param("id") Long id);
	
	/**
	 * Method that returns a list of clients doing a search by the passed name parameter and sorting them by the name.
	 *  
	 * @param name
	 * @return list of clients
	 */
	List<Topic> findByNameOrderByName(@Param("name") String name);

}