package com.doIt.DoIt.controller;

import com.doIt.DoIt.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private TaskService taskService;

    @RequestMapping(value ="/", method = RequestMethod.GET)
    public String home(HttpServletRequest request){
        request.setAttribute("mode", "MODE_HOME");
        return "index";
    }

    @GetMapping("/all-tasks")
    public String allTasks(HttpServletRequest request){
        request.setAttribute("tasks", taskService.getAllTasks());
        request.setAttribute("mode", "MODE_TASKS");
        return "index";
    }
    String message = "welcome";
    @RequestMapping(value ="/home", method = RequestMethod.GET)
    @ResponseBody
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }
}
