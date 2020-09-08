package com.company;

public class Book {
    private String author;
    private String name;
    private int year;

    public Book(String author, String name, int year){
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String getAuthor(){
        return author;
    }

    public String getName(){
        return name;
    }

    public int getYear(){
        return year;
    }

    public void setAuthor(String a){
        author = a;
    }

    public void setName(String n){
        name = n;
    }

    public void setYear(int y){
        year = y;
    }

}
