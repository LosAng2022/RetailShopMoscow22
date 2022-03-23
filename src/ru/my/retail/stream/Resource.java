package ru.my.retail.stream;

import ru.my.retail.product.FoodProduct;

import java.util.List;

public class Resource {

    synchronized void increment(List<FoodProduct> productsOnAShelf) {
        for (int i = 1; i < productsOnAShelf.size(); i++) {
            System.out.println(i + ") " + Thread.currentThread().getName() + " : " + productsOnAShelf.get(i));
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}