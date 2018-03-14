package com.doIt.DoIt.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name="Task")
public class Task implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int taskID;
    private String name;
    private String description;
    private String status;
    private int hours_contributed;
    private int hours_estimated;
    private int projectID;

    public Task() {
    }

    public Task(String name, String description, String status, int hours_contributed, int hours_estimated, int projectID) {
        super();
        this.name = name;
        this.description = description;
        this.status = status;
        this.hours_contributed = hours_contributed;
        this.hours_estimated = hours_estimated;
        this.projectID = projectID;
    }


    public Task( String name, String description) {
        super();
        this.name = name;
        this.description = description;
        this.status = "Not Started";
        this.hours_contributed= 0;
        this.hours_estimated = 0;
        this.projectID = 1;
    }

    public int getTaskID() {
        return taskID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public int getHours_contributed() {
        return hours_contributed;
    }

    public int getHours_estimated() {
        return hours_estimated;
    }

    public int getProjectID() {
        return projectID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setHours_contributed(int hours_contributed) {
        this.hours_contributed = hours_contributed;
    }

    public void setHours_estimated(int hours_estimated) {
        this.hours_estimated = hours_estimated;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskID=" + taskID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", hours_contributed=" + hours_contributed +
                ", hours_estimated=" + hours_estimated +
                ", projectID=" + projectID +
                '}';
    }
}