package com.sample7;

import java.util.HashMap;

/**
 * Created by bian17888 on 2018/7/7.
 */
public class Polymorphism {
    public static void main(String[] args) {
        Vet vet = new Vet();
        Dog dog = new Dog();
        Cat cat = new Cat();

        vet.giveShot(dog);
        vet.giveShot(cat);
    }
}

class Animal {
    public void makeNoise() {
        System.out.println("animal's noise! ");
    }
}

class Cat extends Animal {
    public void makeNoise() {
        System.out.println("cat's noise! ");
    }
}

class Dog extends Animal {
    public void makeNoise() {
        System.out.println("dog's noise! ");
    }
}

class Vet {
    public void giveShot(Animal a) {
        a.makeNoise();
    }
}
