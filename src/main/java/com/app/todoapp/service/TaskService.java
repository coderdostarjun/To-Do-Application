package com.app.todoapp.service;

import com.app.todoapp.dto.TaskDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {
        //create
        TaskDto createTask(TaskDto taskDto);
        //update
        ResponseEntity<?> updateTask(Long taskId,TaskDto taskDto);
        //delete
       void  deleteTask(Long taskId);
        //get single task
       TaskDto getTask(Long taskId);
        //get all task
       List<TaskDto> getAllTask();
}
