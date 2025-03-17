package fr.ynov.java.medium;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    //private int age;
    private LocalDate birthDate;
    private String gender;
    private float height;
    private float weight;
    private Nationality nationality;

    public Person(String name, String gender, float height, float weight, Nationality nationality, LocalDate birthDate) {
        this.name = name;
        //this.age = age;
        this.birthDate = birthDate;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public int calculateAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public void printAttributes() {
        System.out.println("Name: " + name);
        //System.out.println("Age: " + age);
        System.out.println("Age: " + calculateAge() + " years");
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height + " m");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Nationality: " + nationality);
    }
}