package ru.zolotarev.task10;

public class InvalidCommandException extends Exception{
    @Override
    public String getMessage() {
        return "Invalid command!";
    }
}
