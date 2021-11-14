package com.pb.tokmakova.hw7;

public interface ManClothes {
    default void dressMan()
    {
        System.out.println("Одеваем мужчину");
    }
   // Эти методы не принимают параметров, а только выводят информацию о одежде (название, размер, цену, цвет).
}
