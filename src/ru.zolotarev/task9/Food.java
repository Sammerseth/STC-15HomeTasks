package ru.zolotarev.task9;

public enum Food {CARROT (false), APPLE(true), MEAT(true),
    ;
    boolean tastiness;

    public boolean isTastiness() {
        return tastiness;
    }

    public void setTastiness(boolean tastiness) {
        this.tastiness = tastiness;
    }

    Food(boolean tastiness) {
        this.tastiness = tastiness;
    }
}
