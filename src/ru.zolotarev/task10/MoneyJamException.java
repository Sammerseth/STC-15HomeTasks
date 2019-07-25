package ru.zolotarev.task10;

public class MoneyJamException extends Exception {
    @Override
    public String getMessage() {
        return "Money jammed!";
    }
}
