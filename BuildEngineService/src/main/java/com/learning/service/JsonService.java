/**
 * 
 */
package com.learning.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.learning.model.Task;
import com.learning.model.json.Flow;
import com.learning.model.json.JsonGraph;

/**
 * @author vbejjanki
 *
 */
@Service
public class JsonService {

	@Inject
	private TaskService taskService;

	public JsonGraph buildJsonGraph() {
		
		JsonGraph jsonGraph  =  new JsonGraph();
		
		List<Task> taskList = taskService.getTasks();
		
		 Map<String, Flow> flows = new HashMap<>();
		
		 Map<Long, com.learning.model.json.Task> tasks = taskList.stream()
				 .map( s -> new com.learning.model.json.Task(s.getId(),s.getName()))
				 .collect(Collectors.toMap(com.learning.model.json.Task::getId, Function.identity()));
		
		// taskList.stream().
		 
		jsonGraph.setTasks(tasks);
		jsonGraph.setFlows(flows);
		
		return jsonGraph;
	}

}
