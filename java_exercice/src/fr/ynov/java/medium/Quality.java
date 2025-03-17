package fr.ynov.java.medium;

import java.util.Objects;

public class Quality {
    private int id;
    private String name;


    public Quality(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Quality quality = (Quality) obj;
        return id == quality.id && Objects.equals(name, quality.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

class Main {
    public static void main(String[] args) {
        Quality q1 = new Quality(1, "Yepee");
        Quality q2 = new Quality(1, "High");
        System.out.println("Using == operator: " + (q1 == q2));
        System.out.println("Using equals method: " + q1.equals(q2));
    }
}
