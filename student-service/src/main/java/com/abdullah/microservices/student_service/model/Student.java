package com.abdullah.microservices.student_service.model;

public class Student {
    private int id;
    private String name;
    private String major;
    private String favoriteDrink;

    public Student(int id, String name, String major, String favoriteDrink) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.favoriteDrink = favoriteDrink;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getMajor() { return major; }
    public String getFavoriteDrink() { return favoriteDrink; }
}
