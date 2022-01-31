package ru.my.retail.shop;

import ru.my.retail.product.Cheese;
import ru.my.retail.product.FoodProduct;
import ru.my.retail.product.Kefir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shelf {

    private String name;
    private int number;


    public Shelf(String name, int number) {

        this.name = name;
        this.number = number;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number > 0 && number < 500)
        this.number = number;
    }

    public void productOnShelfOne(Kefir kefir, Cheese cheese, Shelf shelfOne) {
        List<FoodProduct> productsOnAShelf = new ArrayList<>();
        productsOnAShelf.add(kefir);
        productsOnAShelf.add(cheese);
        productsOnAShelf.add(new Kefir());
        productsOnAShelf.add(new Cheese());
        System.out.println("На " + shelfOne.getName() + " " + shelfOne.getNumber() + " находятся продукты :" + productsOnAShelf);
        System.out.println((long) productsOnAShelf.size() + " шт. количество продуктов находится на полке.");
        productsOnAShelf.remove(kefir);
        System.out.println("Один продукт упал с полки и теперь на полке находятся : " + productsOnAShelf);
        System.out.println("Есть ли сыр на полке ? ");

        String s = productsOnAShelf.contains(cheese) ? "Да" : "Нет";
        System.out.println(s);

        System.out.println((long) productsOnAShelf.size() + " шт. - количество продуктов находится на полке.");
        System.out.println("Породукт на полке под № 3 : " + productsOnAShelf.get(2));
        productsOnAShelf.add(1, kefir);
        System.out.println("Упавший продукт положили на полку и теперь продукт на полке под № 3 :" + productsOnAShelf.get(2));

        for (int i = 0; i < 4; i++) {
            System.out.println(productsOnAShelf.get(i));

        }
    }

    public void productOnShelfTwo(Kefir kefir, Cheese cheese, Shelf shelfTwo, Shelf shelfOne) {
        List<FoodProduct> productsOnAShelfTwo = new ArrayList<>();
        productsOnAShelfTwo.add(kefir);
        productsOnAShelfTwo.add(kefir);
        productsOnAShelfTwo.add(new Kefir());
        productsOnAShelfTwo.add(new Cheese());
        productsOnAShelfTwo.add(new Cheese());
        System.out.println("На " + shelfTwo.getName() + " " + shelfTwo.getNumber() + " находятся продукты :" + productsOnAShelfTwo);
        System.out.println((long) productsOnAShelfTwo.size() + " шт. - количество продуктов находится на полке.");
        System.out.println("Породукт на полке под № 3 : " + productsOnAShelfTwo.get(2));
        for (int i = 0; i < 5; i++) {
            System.out.println(productsOnAShelfTwo.get(i));
        }

    }
}