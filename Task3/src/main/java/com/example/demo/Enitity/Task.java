package com.example.demo.Enitity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Title")
    private  String Title;
    @Column(name = "Priority")
    private  String Priority;
    @Column(name = "Category")
    private String Category;
    @Column(name = "Description")
    private String Description;
    @Column(name = "status")
    private String status;
    @Column(name = "Date")
    private java.util.Date Date;
    public String getTitle(){return this.Title;}

}

