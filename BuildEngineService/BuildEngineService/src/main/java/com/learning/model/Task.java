/**
 * 
 */
package com.learning.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author vbejjanki
 *
 */

@Entity
public class Task{

	@Id
	private Long id;

	private String name;
	
	private String constraintType;

	private Long parentId;

	private Long predecessorId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getPredecessorId() {
		return predecessorId;
	}

	public void setPredecessorId(Long predecessorId) {
		this.predecessorId = predecessorId;
	}

	public String getConstraintType() {
		return constraintType;
	}

	public void setConstraintType(String constraintType) {
		this.constraintType = constraintType;
	}

}
