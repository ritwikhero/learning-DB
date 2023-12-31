package com.example.databaseLearning;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Client {
    @Id
    private int id;

    private String name;

    private String emailId;

    private  int funding;

    private int contactNo;

    private String address;
}
