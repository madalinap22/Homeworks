package org.madalina.bankingsystem.dto;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.time.LocalDate;
//@Getter   //lombok
//@Setter
//@AllArgsConstructor //lombok inlocuieste constructorul cu toti parametri sau @Data
public class User {

    private int id;

   @Nonnull
    private String name;


    private int age;
    private LocalDate joinDate;

    public User(int id, String name, int age, LocalDate joinDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.joinDate = joinDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }
}
