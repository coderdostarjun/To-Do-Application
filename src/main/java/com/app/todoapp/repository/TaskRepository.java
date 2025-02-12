package com.app.todoapp.repository;

import com.app.todoapp.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//repository is basically class or an interface that connects your application with database allowing you to save retrieve update and delete data.

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {

}
