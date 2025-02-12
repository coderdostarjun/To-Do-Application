package com.app.todoapp.serviceimpl;

import com.app.todoapp.dto.TaskDto;
import com.app.todoapp.entity.Task;
import com.app.todoapp.exception.ResourceNotFoundException;
import com.app.todoapp.repository.TaskRepository;
import com.app.todoapp.service.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public TaskDto createTask(TaskDto taskDto) {
      Task createdTask= this.modelMapper.map(taskDto, Task.class);
      createdTask.setCompleted(true);
       return  this.modelMapper.map(taskRepository.save(createdTask),TaskDto.class);
    }

    @Override
    public ResponseEntity<?> updateTask(Long taskId, TaskDto taskDto) {
        Task task=taskRepository.findById(taskId).orElseThrow(()->new ResourceNotFoundException("task not found"));
        task.setTitle(taskDto.getTitle());
        taskRepository.save(task);
        return ResponseEntity.status(HttpStatus.OK).body(this.modelMapper.map(task, TaskDto.class));
    }

    @Override
    public void deleteTask(Long taskId) {
        Task task=taskRepository.findById(taskId).orElseThrow(()->new ResourceNotFoundException("task not found"));
        taskRepository.delete(task);
    }

    @Override
    public TaskDto getTask(Long taskId) {
        Task task=taskRepository.findById(taskId).orElseThrow(()->new ResourceNotFoundException("task not found"));
        return this.modelMapper.map(task, TaskDto.class);
    }

    @Override
    public List<TaskDto> getAllTask() {
        List<Task> taskList=taskRepository.findAll();
        List<TaskDto> taskDtoList=taskList.stream().map((taskharukolist -> {
           return this.modelMapper.map(taskharukolist, TaskDto.class);
        })).collect(Collectors.toList());
        return taskDtoList;
    }
}
