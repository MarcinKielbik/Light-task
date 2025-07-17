package com.example.to_do_list.service;

import com.example.to_do_list.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {

    List<Task> getAllTasks();

    Optional<Task> getTaskById(Long id);
    Task saveTask(Task task);
    Task updateTask(Long id, Task task);

    void deleteTask(Long id);
}
