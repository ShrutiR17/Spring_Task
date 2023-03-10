package com.taskmanagements.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Taskentity {
	
	@Id
	private String taskId;
	private String taskHolderName;
	private String taskDate;
	private String taskName;
	private String taskStatus;

	
	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskHolderName() {
		return this.taskHolderName;
	}

	public void setTaskHolderName(String taskHolderName) {
		this.taskHolderName = taskHolderName;
	}

	public String getTaskDate() {
		return this.taskDate;
	}

	public void setTaskDate(String taskDate) {
		this.taskDate = taskDate;
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}


}
