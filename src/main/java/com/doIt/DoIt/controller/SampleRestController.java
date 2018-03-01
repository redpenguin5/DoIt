package com.doIt.DoIt.controller;

import com.doIt.DoIt.entity.Task;
import com.doIt.DoIt.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public String allTasks(){
        return taskService.getAllTasks().toString();
    }

    /*
    @GetMapping("/save-task")
    public String saveTask(@RequestParam int id, @RequestParam String name, @RequestParam String desc){
        Task task = new Task(id, name, desc);
        taskService.save(task);
        return "Task saved";
    }

    @GetMapping("/delete-task")
    public String saveTask(@RequestParam int id){
        taskService.delete(id);
        return "Task deleted";
    }*/
}
