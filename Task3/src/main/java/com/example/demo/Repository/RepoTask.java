package com.example.demo.Repository;

import com.example.demo.Enitity.Task;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepoTask extends JpaRepository<Task, Long> {

    Task updateTask(Task task);
    Task findById(long id);
    List<Task> findByCategegory(String Categegory);

    void deleteById(Long id);
}
