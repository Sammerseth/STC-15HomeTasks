package ru.zolotarev.task9;

public class Mum {
    public static void main(String[] args) throws TastelessFoodException {
        Kid kid = new Kid();
        try {
            kid.eating(Food.CARROT);
        } catch (TastelessFoodException e) {
            System.out.println("not tasty..");
            System.out.println("thanks Mum");
        }
     }
}
