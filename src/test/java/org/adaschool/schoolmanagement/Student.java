package org.adaschool.schoolmanagement;

import org.adaschool.schoolmanagement.Person;

import java.time.LocalDate;

public class Student extends Person {

    private int id;
    private String name;
    private String lastname;
    private LocalDate Birthdate;
    private String state;

    public Student(String name, String lastname, String birthdate, int id, String name1, String lastname1, LocalDate birthdate1, String state) {
        super(name, lastname, birthdate);
        this.id = id;
        this.name = name1;
        this.lastname = lastname1;
        this.Birthdate = birthdate1;
        this.state = state;
    }

    public Student() {
        super();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getLastname() {
        return lastname;
    }

    @Override
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
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

    public static void setName() {
    }
}
