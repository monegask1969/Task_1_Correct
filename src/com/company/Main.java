package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter quantity of Laptops: ");
        Container container = new Container(scanner.nextInt());

        while(container.getIndex() < container.laptopses.length)
        {
            System.out.println("Adding Laptop:");
            System.out.println("1.Auto add. \n2.Add Laptop manually.");

            switch (scanner.nextInt())
            {
                case 1:
                    container.AutoAdd();
                    break;
                case 2:
                    container.Add();
                    break;
            }
        }

        System.out.println("The list of Laptops: ");
        container.printer();

        System.out.println("Sorting Laptops by price...\n");

        container.sortion();
        System.out.println("Laptops were sorted by price: \n");
        container.printer();

        System.out.println("The medium price of Gaming Laptop: " + Gaming_Laptops.getAverageSum());
        System.out.println("The medium price of Low Cost Laptop: " + LowCostLaptops.getAverageSum());
    }
}
