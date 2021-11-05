package com.pb.tokmakova.hw6;

public class Veterinarian {
    Cat cat=new Cat();
    Dog dog=new Dog();
    Horse horse=new Horse();


    public static void treatAnimal(Animal animal) {

            System.out.println("Животное: " + animal.getName() + ", " +
                    "ест: " + animal.getFood() + ", " +
                    "прибыло из города: " + animal.getLocation());

        }
    }

