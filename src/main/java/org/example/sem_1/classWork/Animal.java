package org.example.sem_1.classWork;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void animalInfo(){
        System.out.println("Животное: " + name);
    }
    public void voice(){
        System.out.println("Животное: " + name + " издало звук");
    }
    public void jump(){
        System.out.println("Животное: " + name + " подпрыгнуло");
    }

}
