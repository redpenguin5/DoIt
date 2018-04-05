package com.doIt.DoIt.entity;

import javax.persistence.*;
import java.io.Serializable;
//Additon
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name="Task")
public class Task implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    //Additions standard validation annotations Tom S, 3/4/18
    @NotNull
    private int taskID;

    @NotNull
    @Size(max=50)
    private String name;

    @NotNull
    @Size(max=300)
    private String description;

    @NotNull
    @Size(max=30)
    private String status;

    @NotNull
    private int hours_contributed;

    @NotNull
    private int hours_estimated;

    @NotNull
    private int projectID;

    public Task() {
    }

//TH and TS edited on 16.03 for validity checks on Task contrsuctor. There are two constructors so we weren't sure if the validty checks were needed on both?

    public Task(String name, String description, String status, int hours_contributed, int hours_estimated, int projectID) {
        super();

        if(name.length() > 50 || name == null) {
            throw new IllegalArgumentException("Task name must be specified as a string under 50 characters.");
        }
        else this.name = name;

        if(description.length() > 300 || description == null) {
            throw new IllegalArgumentException("Task description must be specified as a string under 300 characters.");
        }
        else this.description = description;

        if(status.length() > 30 || status == null) {
            throw new IllegalArgumentException("Task status must be specified as a string under 30 characters.");
        }
        else this.status = status;

        this.hours_contributed = hours_contributed;

        this.hours_estimated = hours_estimated;


        this.projectID = projectID;
    }

    public Task(String name, String description) {
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
        if(name.length() > 50 || name == null) {
            throw new IllegalArgumentException("Task name must be specified as a string under 50 characters.");
        }
        else this.name = name;
    }

    public void setDescription(String description) {
        if (description.length() > 300 || description == null) {
            throw new IllegalArgumentException("Task description must be specified as a string under 300 characters.");
        } else this.description = description;
    }

    public void setStatus(String status) {
        if(status.length() > 30 || status == null) {
            throw new IllegalArgumentException("Task status must be specified as a string under 30 characters.");
        }
        else this.status = status;
    }


    public void setHours_contributed(int hours_contributed) {
        this.hours_contributed = hours_contributed;}

    public void setHours_estimated(int hours_estimated) {
        this.hours_estimated = hours_estimated;}

    public void setProjectID(int projectID) {
        this.projectID = projectID;}

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
