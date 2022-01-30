package ru.my.retail.product;

public interface ProductForHealthyDiet {


    void forHealthyDiet();

    default void forEating(FoodProduct foodProduct) {
        System.out.println(foodProduct.getProductName() + " диетически молочный продукт для употребления в пищу.");

    }}




