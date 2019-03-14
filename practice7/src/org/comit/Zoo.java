package org.comit;

public class Zoo {

    public static void main(String[] args){
        Animal animal1;
        Dog dog1 = new Dog();
        Gato gato1 = new Gato();

        dog1.move();
        dog1.eat();
        dog1.bark();

        gato1.move();
        gato1.eat();

        animal1 = dog1;
        animal1.move();
    }
}
