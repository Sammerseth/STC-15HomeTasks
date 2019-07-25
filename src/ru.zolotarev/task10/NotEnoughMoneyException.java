package ru.zolotarev.task10;

public class NotEnoughMoneyException extends Exception {
    @Override
    public String getMessage() {
        return "Not enough money!";
    }
}
