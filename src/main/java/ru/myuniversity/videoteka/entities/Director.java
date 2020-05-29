package ru.myuniversity.videoteka.entities;

public class Director extends Person {
    public Director() {
        super();
    }

    public Director(String name, String surname, int age) {
        super();
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
