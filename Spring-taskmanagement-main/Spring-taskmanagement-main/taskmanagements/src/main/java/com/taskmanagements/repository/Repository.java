package com.taskmanagements.repository;

import com.taskmanagements.entity.Taskentity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;
// @Repository
import org.springframework.data.jpa.repository.Query;
public interface Repository extends JpaRepository<Taskentity, String>{

    @Query(value = "SELECT * FROM taskmanagement", nativeQuery = true)
    List<Taskentity> display(String taskId);

    @Query(value = "DELETE FROM taskmanagement WHERE taskId=?1", nativeQuery = true)
    List<Taskentity> delById(String taskId);

    @Query(value = "SELECT * FROM taskmanagement.taskentity WHERE taskHolderName=?1", nativeQuery = true)
	List<Taskentity> getTask(String taskHolderName);
}
