package com.company;

public abstract class Dog {
    private double weight;
    private String class_dog;

    public double getWeight(){return weight;}
    public String getClass_dog(){return class_dog;}

    public abstract void displayInfo();

    public Dog(double weight, String class_dog)
    {
        this.weight = weight;
        this.class_dog = class_dog;
    }

}

class Labrador extends Dog{
    private String color;

    public Labrador(double weight, String class_dog, String color){
        super(weight, class_dog);
        this.color = color;
    }

    public void displayInfo(){
        System.out.println("Собака весит: " + super.getWeight() + "кг, " + "Принадлежит классу: " + super.getClass_dog() + "\n" + "Имеет цвет: " + color);
    }
}
