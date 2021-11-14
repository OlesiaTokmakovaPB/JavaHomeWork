package com.pb.tokmakova.hw7;

public interface WomenClothes {
    default void dressWoman()
    {
       System.out.println("Одеваем женщину ");
    }
    //Эти методы не принимают параметров, а только выводят информацию о одежде (название, размер, цену, цвет).
}
