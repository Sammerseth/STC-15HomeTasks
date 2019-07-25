package ru.zolotarev.task10;

public enum  Drinks {WATER(10,"Water"), TEA(20,"Tea"), COFFEE(25,"Coffee");
    int cost;
    String title;

    Drinks(int cost, String title) {
        this.cost = cost;
        this.title = title;
    }
}
