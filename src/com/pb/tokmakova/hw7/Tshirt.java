package com.pb.tokmakova.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{
    public Tshirt(Size size, String color) {
        super(size, color);
    }

    public Tshirt(Size size, String color, double price) {
        super(size, color, price);
    }

    @Override
    public String toString() {
        return "Футболка[" +
                "размер = " + getSize() +
                ", цена = " + getPrice() + " грн" +
                ", цвет = " + getColor() +
                "]";
    }
}
