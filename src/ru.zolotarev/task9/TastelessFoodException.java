package ru.zolotarev.task9;

public class TastelessFoodException extends RuntimeException {
    public TastelessFoodException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
