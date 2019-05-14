package ru.zolotarev.task7;

public class Main {
    public static void main(String[] args) {

        Cat Barsik = new Cat("cat");
        Barsik.getName();
        Barsik.running();
        Barsik.swimming();

        Duck Donald = new Duck("duck");
        Donald.getName();
        Donald.running();
        Donald.flying();
        Donald.swimming();

        Eagle Skif = new Eagle("eagle");
        Skif.getName();
        Skif.flying();

    }
}
