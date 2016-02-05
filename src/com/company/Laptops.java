package com.company;

/**
 * Created by Max on 05.02.2016.
 */
public abstract class Laptops {

    private String name;

    private int RAM;

    private int HDD;

    private double screen_diagonal;

    private String processor;

    private double price;

    private double weight;

    private static int COUNT;

    private static double SUM_PRICE;

    public Laptops() {
    }

    public Laptops(String name, int RAM, int HDD, double screen_diagonal, String processor, double price, double weight) {
        this.name = name;
        this.RAM = RAM;
        this.HDD = HDD;
        this.screen_diagonal = screen_diagonal;
        this.processor = processor;
        this.price = price;
        this.weight = weight;
        COUNT++;
        SUM_PRICE +=price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    static public double getAverageSum()
    {
        return SUM_PRICE / COUNT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public double getScreen_diagonal() {
        return screen_diagonal;
    }

    public void setScreen_diagonal(double screen_diagonal) {
        this.screen_diagonal = screen_diagonal;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "\nName: " + name +
                "\nRAM: " + RAM +
                "\nScreen diagonal: " + screen_diagonal +
                "\nProcessor: " + processor  +
                "\nPrice: " + price ;
    }
}
