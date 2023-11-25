package org.adaschool.schoolmanagement;

import java.time.LocalDate;

public class Person {

    private String name;
    private String lastname;

    private String birthdate;

    public Person(String name, String lastname, String birthdate) {
        this.name = name;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }

    public Person() {

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
        return LocalDate.parse(birthdate);
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }
}
