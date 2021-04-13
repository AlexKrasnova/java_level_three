package ru.geekbrains.alexkrasnova.javalevelthree.lesson5;

public abstract class Stage {
    protected int length;
    protected String description;
    public String getDescription() {
        return description;
    }
    public abstract void go(Car c);
}
