package com.bugtrack.proj1.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProjectEntity {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long projId; //in html, this will be given by db
	
	private String projTitle; //in html, this will be a text field
	private String projDescription; //in html, this will be a text box
	
	
	public ProjectEntity() {
		
	}
	
	
	public ProjectEntity(String projTitle, String projDescription) {
		super();
		this.projTitle = projTitle;
		this.projDescription = projDescription;
	}


	public Long getProjId() {
		return projId;
	}


	public void setProjId(Long projId) {
		this.projId = projId;
	}


	public String getProjTitle() {
		return projTitle;
	}


	public void setProjTitle(String projTitle) {
		this.projTitle = projTitle;
	}


	public String getProjDescription() {
		return projDescription;
	}


	public void setProjDescription(String projDescription) {
		this.projDescription = projDescription;
	}
	
	
}
