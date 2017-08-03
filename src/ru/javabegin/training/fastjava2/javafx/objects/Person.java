package ru.javabegin.training.fastjava2.javafx.objects;

public class Person {

    private String zadacha;
    private String time;


    public Person(String zadacha, String time) {
        this.zadacha = zadacha;
        this.time = time;
    }

    public String getZadacha() {
        return zadacha;
    }

    public void setZadacha(String zadacha) {
        this.zadacha = zadacha;
    }

    public String getTime() {
        return time;
    }

    public void setPhone(String time) {
        this.time = time;
    }

}

