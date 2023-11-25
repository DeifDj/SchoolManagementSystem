package org.adaschool.schoolmanagement;

import java.time.LocalDate;

public class Student {

    private int id;
    private String name;
    private String lastname;
    private LocalDate Birthdate;
    private String state;

    public Student(int id, String name, String lastname, LocalDate birthdate, String state) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        Birthdate = birthdate;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        Birthdate = birthdate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
