package org.adaschool.schoolmanagement;

public class Course {

    private int id;
    private String name;
    private String description;
    private int numbercredist;
    private String version;

    public Course() {
        this.id = id;
        this.name = name;
        this.description = description;
        this.numbercredist = numbercredist;
        this.version = version;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumbercredist() {
        return numbercredist;
    }

    public void setNumbercredist(int numbercredist) {
        this.numbercredist = numbercredist;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numbercredist=" + numbercredist +
                ", version='" + version + '\'' +
                '}';
    }
}


