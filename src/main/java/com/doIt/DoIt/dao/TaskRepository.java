package com.doIt.DoIt.dao;

import com.doIt.DoIt.entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> {
}
