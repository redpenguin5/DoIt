package com.doIt.DoIt.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name="Task")
public class Task implements Serializable {

    @Id
    private int task_ID;
    private String task_name;
    private String task_description;
    private String task_status;
    private int hours_contributed;
    private int hours_estimated;
    private int project_ID;

    public Task() {
    }

    public Task(int task_ID, String task_name, String task_description, String task_status, int hours_contributed, int hours_estimated, int project_ID) {
        this.task_ID = task_ID;
        this.task_name = task_name;
        this.task_description = task_description;
        this.task_status = task_status;
        this.hours_contributed = hours_contributed;
        this.hours_estimated = hours_estimated;
        this.project_ID = project_ID;
    }

    public void setTask_ID(int task_ID) {
        this.task_ID = task_ID;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public void setTask_description(String task_description) {
        this.task_description = task_description;
    }

    public void setTask_status(String task_status) {
        this.task_status = task_status;
    }

    public void setHours_contributed(int hours_contributed) {
        this.hours_contributed = hours_contributed;
    }

    public void setHours_estimated(int hours_estimated) {
        this.hours_estimated = hours_estimated;
    }

    public void setProject_ID(int project_ID) {
        this.project_ID = project_ID;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task_ID=" + task_ID +
                ", task_name='" + task_name + '\'' +
                ", task_description='" + task_description + '\'' +
                ", task_status='" + task_status + '\'' +
                ", hours_contributed=" + hours_contributed +
                ", hours_estimated=" + hours_estimated +
                ", project_ID=" + project_ID +
                '}';
    }
}