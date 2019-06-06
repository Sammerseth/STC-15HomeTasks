package ru.zolotarev.task9;

public class Kid {
    public static void eating(Food food) {
        if (food.tastiness == false){
             throw new TastelessFoodException("not tasty..");
        }
        else {
            System.out.println("eating..");
            System.out.println("thanks Mum");
        }
    }
}

