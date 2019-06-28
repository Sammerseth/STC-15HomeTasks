package ru.zolotarev.task18;

import java.util.ArrayList;
import java.util.List;

interface Basket {

    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    List <String> getProducts();

    int getProductQuantity(String product);

}