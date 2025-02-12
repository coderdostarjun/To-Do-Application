package com.app.todoapp.controller;

import com.app.todoapp.dto.DeleteResponseDto;
import com.app.todoapp.dto.TaskDto;
import com.app.todoapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    //create task
    @PostMapping("/create")
    //ResponseEntity<?> createTask(@RequestBody TaskDto taskDto)
   public String createTask(@ModelAttribute TaskDto taskDto)
    {
       taskService.createTask(taskDto);
       return "redirect:/api/v1/task/tasks";
//    TaskDto createdTask=taskService.createTask(taskDto);
//     return ResponseEntity.status(HttpStatus.OK).body(createdTask);
    }

    //update
    @PostMapping("/update")
//    ResponseEntity<?> updateTask(@RequestParam Long taskId,@RequestBody TaskDto taskDto)
        public  String updateTask(@RequestParam Long taskId,@ModelAttribute TaskDto taskDto)
    {
        taskService.updateTask(taskId,taskDto);
        return "redirect:/api/v1/task/tasks";
//        ResponseEntity<?> updatedTask= taskService.updateTask(taskId,taskDto);
//        return  updatedTask;
    }

    //delete
    @PostMapping("/delete")
//    ResponseEntity<?> deleteTask(@RequestParam Long taskId)
    String deleteTask(@RequestParam Long taskId)
    {
        taskService.deleteTask(taskId);
        return "redirect:/api/v1/task/tasks";
//        DeleteResponseDto deleteResponseDto=new DeleteResponseDto();
//        deleteResponseDto.setMessage("Post delete successfully");
//        deleteResponseDto.setSuccess(true);
//        return ResponseEntity.status(HttpStatus.OK).body(deleteResponseDto);
    }

    //get
    @GetMapping("/get")
//    ResponseEntity<?> getTask(@RequestParam Long taskId)
   String getTask(@RequestParam Long taskId,Model model)
    {
        TaskDto task = taskService.getTask(taskId); // Fetch the task using the service
        model.addAttribute("singleTask", task); // Add the task to the model
        return "tasks"; // Return the Thymeleaf template name
//       TaskDto getOneTask= taskService.getTask(taskId);
//      return ResponseEntity.status(HttpStatus.OK).body(getOneTask);
    }

    //getAll
    @GetMapping("/tasks")
//    ResponseEntity<?> getAllTask(Model model)
    public String getAllTask(Model model)
    {
        List<TaskDto> getallTask= taskService.getAllTask();
        model.addAttribute("getAllTask",getallTask);
        return "tasks"; // Renders tasks.html
        // return ResponseEntity.status(HttpStatus.OK).body(getallTask);

    }
}
