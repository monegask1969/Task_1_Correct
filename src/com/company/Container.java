package com.company;

import java.util.Scanner;

/**
 * Created by Max on 05.02.2016.
 */
public class Container {
    Scanner scanner = new Scanner(System.in);

    Laptops[] laptopses;

    private int index;

    public Container() {
    }

    public Container(int n) {
        laptopses = new Laptops[n];
    }

    public void Add()
    {
        if(index < laptopses.length)
        {
            System.out.println("\n You want to add: \n 1.Gaming Laptop. \n 2.Low Cost Laptop. \n Enter the number: ");

            switch (scanner.nextInt())
            {
                case 1:
                    Gaming_Laptops for_game = new Gaming_Laptops();
                    System.out.println("Please enter the name of laptop: ");
                    for_game.setName(scanner.next());
                    System.out.println("Enter the volume of HDD: ");
                    for_game.setHDD(scanner.nextInt());
                    System.out.println("Enter screen diagonal: ");
                    for_game.setScreen_diagonal(scanner.nextDouble());
                    System.out.println("Enter processor name: ");
                    for_game.setProcessor(scanner.next());
                    System.out.println("Enter RAM value: ");
                    for_game.setRAM(scanner.nextInt());
                    System.out.println("Enter weight: ");
                    for_game.setWeight(scanner.nextDouble());
                    System.out.println("Enter availability of additional video card(true or false): ");
                    for_game.setAdditional_video_card(scanner.next());
                    System.out.println("Enter price of Laptop: ");
                    for_game.setPrice(scanner.nextDouble());

                case 2:
                    LowCostLaptops low_cost = new LowCostLaptops();
                    System.out.println("Please enter the name of laptop: ");
                    low_cost.setName(scanner.next());
                    System.out.println("Enter the volume of HDD: ");
                    low_cost.setHDD(scanner.nextInt());
                    System.out.println("Enter screen diagonal: ");
                    low_cost.setScreen_diagonal(scanner.nextDouble());
                    System.out.println("Enter processor name: ");
                    low_cost.setProcessor(scanner.next());
                    System.out.println("Enter RAM value: ");
                    low_cost.setRAM(scanner.nextInt());
                    System.out.println("Enter weight: ");
                    low_cost.setWeight(scanner.nextDouble());
                    System.out.println("Enter the availability of DVD-ROM(true of false): ");
                    low_cost.setDVD_ROM(scanner.next());
                    System.out.println("Enter price of Laptop: ");
                    low_cost.setPrice(scanner.nextDouble());

                    default:
                        System.out.println("Incorrect number!");
            }
        }
        System.out.println();
    }

    public void AutoAdd()
    {
        if(index < laptopses.length)
        {
            System.out.println("\n You want to add: \n 1.Gaming Laptop. \n 2.Low Cost Laptop. \n Enter the number: ");

            switch (scanner.nextInt())
            {
                case 1:
                    laptopses[index++] = new Gaming_Laptops("Alienware",16,2000,17,"Intel",860.90,2.90,"true");
                    break;
                case 2:
                    laptopses[index++] = new LowCostLaptops("Lenovo",2,250,15.4,"AMD",270,2,"false");
            }
        }
        System.out.println();
    }

    public void sortion()
    {
        for (int i =0; i<laptopses.length;i++){
            for (int j=i+1; j<laptopses.length;j++){
                if (laptopses[i].getPrice()<laptopses[j].getPrice()){
                    Laptops tmp = laptopses[i];
                    laptopses[i]=laptopses[j];
                    laptopses[j]=tmp;
                }
            }
        }
    }

    public int Quantity()
    {
        return index;
    }

    public int getIndex() {
        return index;
    }

    public Laptops getLaptop(int index) {
        return laptopses[index];
    }

    public void printer()
    {
        for(Laptops laptops : laptopses)
        {
            System.out.println(laptops.toString());
        }
        System.out.println();
    }
}
