package com.taskmanagements.controller;

// import java.util.ArrayList;
import java.util.List;
// import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanagements.entity.Taskentity;
import com.taskmanagements.repository.Repository;

@RestController
public class Controller {

    @Autowired
    Repository repo;

    @RequestMapping("/saveTask")
	@ResponseBody
	public List<Taskentity> in(@RequestParam String taskId,@RequestParam String taskHolderName,@RequestParam String taskDate,@RequestParam String taskName,@RequestParam String taskStatus)
	{
		Taskentity task = new Taskentity();
		// cust.setId(id);
		task.setTaskId(taskId);
		task.setTaskHolderName(taskHolderName);
        task.setTaskDate(taskDate);
        task.setTaskName(taskName);
        task.setTaskStatus(taskStatus);
		repo.save(task);
		
		return repo.display(taskId);
	}

    @RequestMapping("/changeStatus")
	@ResponseBody
	public List<Taskentity> changeStatus(@RequestParam String taskId)
	{
        Taskentity task = new Taskentity();
        String status ="completed";
        task.setTaskStatus(status);
        repo.save(task);
		return repo.display(taskId);
	}

    @RequestMapping("/alltasks")
	@ResponseBody
	public List<Taskentity> getall()
	{
		return repo.findAll();
	}

    @RequestMapping("/deleteHouse")
	@ResponseBody
	public List<Taskentity> del(@RequestParam String taskId)
	{
        // Taskentity task = new Taskentity();
        repo.deleteById(taskId);
        return repo.delById(taskId);
		// return repo.findAll();
	}

    @RequestMapping("/getTask")
	@ResponseBody
	public List<Taskentity> getask(@RequestParam String taskHolderName)
	{

		return repo.getTask(taskHolderName);
	}
}


