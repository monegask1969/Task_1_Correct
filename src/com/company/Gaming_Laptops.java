package com.company;

/**
 * Created by Max on 05.02.2016.
 */
public class Gaming_Laptops extends Laptops {

    private String additional_video_card;

    public Gaming_Laptops(String name, int RAM, int HDD, double screen_diagonal, String processor, double price, double weight, String additional_video_card) {
        super(name, RAM, HDD, screen_diagonal, processor, price, weight);
        this.additional_video_card = additional_video_card;
    }

    public Gaming_Laptops() {
    }

    public String getAdditional_video_card() {
        return additional_video_card;
    }

    public void setAdditional_video_card(String additional_video_card) {
        this.additional_video_card = additional_video_card;
    }

    public String checker()
    {
        if(additional_video_card == "true" || additional_video_card == "True")return "There is a additional video card";
        if(additional_video_card == "false" || additional_video_card == "False") return "There is no additional video card";
        else return "Incorrect value";
    }

    @Override
    public String toString() {
        return "Gaming Laptop " + super.toString() +
                "\nAdditional video card: " + checker() + "\n";
    }
}
