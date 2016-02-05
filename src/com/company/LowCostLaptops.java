package com.company;

/**
 * Created by Max on 05.02.2016.
 */
public class LowCostLaptops extends Laptops{
    private String DVD_ROM;

    public LowCostLaptops() {
    }

    public LowCostLaptops(String name, int RAM, int HDD, double screen_diagonal, String processor, double price, double weight, String DVD_ROM) {
        super(name, RAM, HDD, screen_diagonal, processor, price, weight);
        this.DVD_ROM = DVD_ROM;
    }

    public String getDVD_ROM() {
        return DVD_ROM;
    }

    public void setDVD_ROM(String DVD_ROM) {
        this.DVD_ROM = DVD_ROM;
    }

    public String checker()
    {
        if(DVD_ROM == "true")return "There is a DVD-ROM";
        if (DVD_ROM == "false")return "There is no DVD-ROM";
        else return "incorrect value";
    }

    @Override
    public String toString() {
        return  "\nLow Cost Laptop " + super.toString() +
                "\nDVD_ROM: " + checker() + "\n";
    }
}
