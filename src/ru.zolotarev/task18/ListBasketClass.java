package ru.zolotarev.task18;

import java.util.ArrayList;
import java.util.List;


public class ListBasketClass implements Basket {
    ArrayList<Position> products = new ArrayList<>();

    @Override
    public void addProduct(String product, int quantity) {
        for (int i = 0 ; i < products.size(); i++){
            if (products.get(i).getName().equals(product)){
                products.get(i).setQuantity(+quantity);
            }
        }
    }


    @Override
    public void removeProduct(String product) {
        for (Position position : products){
            if (position.getName().equals(product)){
                products.remove(position);
            }
        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        for (Position position : products){
            if (position.getName().equals(product)) {
                position.setQuantity(quantity);
            }
        }
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        System.out.println(products.toString());
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        int productQuantity = 0;
        for (Position position : products){
            if (position.getName().equals(product)){
                productQuantity = position.getQuantity();
                System.out.println(position.getQuantity());
            }
        }
        return productQuantity;
    }
}
