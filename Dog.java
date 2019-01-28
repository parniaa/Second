/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Dog extends Animal {

    public Dog(int a) {
        super(a);
    }

    public static void main(String[] args) {

        Animal newAnimal = new Animal(4);
        Collection<Animal> animalCollections =  new LinkedList<Animal>();
        animalCollections.add(newAnimal);
        System.out.println(animalCollections);

    }
}
