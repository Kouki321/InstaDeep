package com.example.demo.Controller;

import com.example.demo.Enitity.Task;
import com.example.demo.Serivice.SeriviceTask;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Task")
public class ControllerTask {
    private SeriviceTask serviceTask;
    ///////////CREATE
    @PostMapping("/create")
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        return new ResponseEntity<>(serviceTask.createTask(task), HttpStatus.CREATED);
    }
    @PostMapping("/update")
    public ResponseEntity<Task> updateTask(@RequestBody Task task) {
        return new ResponseEntity<>(serviceTask.updateTask(task), HttpStatus.CREATED);
    }

    ///////////delete


    @PostMapping(path = "/delete/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable long id) {
        try {serviceTask.delete(id);
           return new ResponseEntity<>( HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new ResponseEntity<>( HttpStatus.CONFLICT);

    }
    @GetMapping(path = "/getByCategory/{id}")
    public ResponseEntity<ArrayList<Task>> findByCategory(@PathVariable String  category) {
        try {serviceTask.findByCategory(category);
            return (ResponseEntity<ArrayList<Task>>) serviceTask.findByCategory(category);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new ResponseEntity<>( HttpStatus.CONFLICT);

    }
    @GetMapping
    public List<Task> getAllTask() {
        return serviceTask.getAllTask();
    }


}

