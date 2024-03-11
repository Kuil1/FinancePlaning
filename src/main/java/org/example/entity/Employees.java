package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "Employees")
public class Employees {
    private String name;
    private String secondName;
    private Integer age;
    private String companyName;
    private String cashIncome;

}
