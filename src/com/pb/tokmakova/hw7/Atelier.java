package com.pb.tokmakova.hw7;

public class Atelier {
    public static void main(String[] args) {


       Clothes [] clothes={
               new Tshirt(Size.XS, "зеленый", 750),
               new Tshirt(Size.XXS, "белый", 599),
               new Pants(Size.L, "красный", 699),
               new Pants(Size.XXS, "черный", 799),
               new Skirt(Size.S, "бордо", 800),
               new Skirt(Size.M, "фуксия", 990),
               new Tie(Size.S, "бирюзовый", 455),
               new Tie(Size.XS, "серый", 485),
       };

        Dressing dressing = new Dressing();
        dressing.dressMan(clothes);
        System.out.println();
        dressing.dressWoman(clothes);
}
}


