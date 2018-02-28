package com.doIt.DoIt.controller;

import com.doIt.DoIt.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public String allTasks(){
        return taskService.getAllTasks().toString();
    }
}
