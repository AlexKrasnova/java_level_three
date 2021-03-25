package ru.geekbrains.alexkrasnova.javalevelthree.lesson1;

import ru.geekbrains.alexkrasnova.javalevelthree.lesson1.fruit.Fruit;

import java.util.*;

public class Box<T extends Fruit> {
    List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public List<T> getFruits() {
        return fruits;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.size() > 0) {
            return fruits.get(0).getWeight() * fruits.size();
        }
        return 0f;
    }

    public boolean compareTo(Box<?> anotherBox) {
        if (Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.00001) {
            return true;
        }
        return false;
    }

    public void pourTo(Box<T> anotherBox) {
        Iterator<T> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            T fruit = iterator.next();
            anotherBox.addFruit(fruit);
            iterator.remove();
        }
    }
}
