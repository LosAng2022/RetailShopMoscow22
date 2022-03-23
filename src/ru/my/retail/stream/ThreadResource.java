package ru.my.retail.stream;

import ru.my.retail.product.FoodProduct;

import java.util.ArrayList;
import java.util.List;

import static ru.my.retail.product.DairyProduct.dairyProducts;

public class ThreadResource implements Runnable {

    Resource resource;

    public ThreadResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
       resource.increment(new ArrayList<>(List.of(dairyProducts())));
    }
}
