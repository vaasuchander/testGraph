/**
 * 
 */
package com.learning.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * @author vbejjanki
 *
 */

@Entity
public class GraphJson {
	
	@Id
	private Long id;
	
	@Lob
	private String json;

}
