/**
 * 
 */
package com.learning.model.json;

/**
 * @author vbejjanki
 *
 */
public class Task {

	private Long id;
	
	private String name;
	
	public Task(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
