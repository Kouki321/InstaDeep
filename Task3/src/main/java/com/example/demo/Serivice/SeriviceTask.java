package com.example.demo.Serivice;

import com.example.demo.Repository.RepoTask;
import org.springframework.stereotype.Service;
import com.example.demo.Enitity.Task;

import java.util.List;

@Service

public class SeriviceTask {
    public final RepoTask repoTask;
    public SeriviceTask(RepoTask repoTask) {
        this.repoTask = repoTask;
    }






    public Task createTask(Task task) {
        if (task.getTitle() == null || task.getTitle().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        return repoTask.save(task);
    }

    public List<Task> getAllTask() {
        return repoTask.findAll();
    }

    public List<Task> findByCategory(String category) {
        return repoTask.findByCategegory(category);
    }

    public Task updateTask(Task task) {
        return repoTask.updateTask(task);
    }

    public void delete(long id) {

        repoTask.deleteById(id);

    }

}
