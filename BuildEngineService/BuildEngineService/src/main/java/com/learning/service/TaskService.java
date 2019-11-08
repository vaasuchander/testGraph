/**
 * 
 */
package com.learning.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.learning.model.Task;
import com.learning.repository.TaskRepository;

/**
 * @author vbejjanki List<Task>
 */
@Service
public class TaskService {

	@Inject
	private TaskRepository taskRepository;

	public List<Task> getTasks() {
		List<Task> taskList = new ArrayList<>();
		taskRepository.findAll().forEach(taskList::add);
		return taskList;
	}

}
