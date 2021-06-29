package com.example.demo;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String location;
    private String[]interests;
    private int id;

    public Student(String firstName, String lastName, int age, String location, String[] interests, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.location = location;
        this.interests = interests;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
