/**
 * 
 */
package com.learning.repository;

import org.springframework.data.repository.CrudRepository;

import com.learning.model.Task;

/**
 * @author vbejjanki
 *
 */

public interface TaskRepository extends CrudRepository<Task, Long>{
	
	
}
