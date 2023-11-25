package org.adaschool.schoolmanagement;

public class Class {

    private int id;
    private String name;
    private String description;
    private int numbercredist;
    private String version;

    public Class(int id, String name, String description, int numbercredist, String version) {
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
}


