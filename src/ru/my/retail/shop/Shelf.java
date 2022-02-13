package ru.my.retail.shop;

import ru.my.retail.person.Merchandiser;
import ru.my.retail.product.Cheese;
import ru.my.retail.product.FoodProduct;
import ru.my.retail.product.Kefir;

import java.util.*;

public class Shelf {

    private String name;
    private int number;
    private LinkedList<Object> products;


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
        if (number > 0 && number < 500)
            this.number = number;
    }

    public void productOnShelfOne(Kefir kefir, Cheese cheese, Shelf shelfOne) {
        List<FoodProduct> productsOnAShelf = new ArrayList<>();
        productsOnAShelf.add(kefir);
        productsOnAShelf.add(cheese);
        productsOnAShelf.add(kefir);
        productsOnAShelf.add(cheese);
        System.out.println("На " + shelfOne.getName() + " " + shelfOne.getNumber() + " находятся продукты :" + productsOnAShelf);
        System.out.println((long) productsOnAShelf.size() + " шт. количество продуктов находится на полке.");
        productsOnAShelf.remove(kefir);
        System.out.println("Один продукт упал с полки и теперь на полке находятся : " + productsOnAShelf);
        System.out.println("Есть ли сыр на полке ? ");
        String s = productsOnAShelf.contains(cheese) ? "Да" : "Нет";
        System.out.println(s);
        System.out.println("Проверим его индекс - " + productsOnAShelf.indexOf(cheese));
        System.out.println((long) productsOnAShelf.size() + " шт. - количество продуктов находится на полке.");
        System.out.println("Породукт на полке под № 3 : " + productsOnAShelf.get(2));
        productsOnAShelf.add(1, kefir);
        System.out.println("Упавший продукт положили на полку и теперь продукт на полке под № 3 :" + productsOnAShelf.get(2));
        System.out.println("Все продукты на полке: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(productsOnAShelf.get(i));

        }
    }

    public void productOnShelfTwo(Cheese cheese, Shelf shelfTwo) {
        System.out.println();
        LinkedList<FoodProduct> productsOnAShelfTwo = new LinkedList<>();
        productsOnAShelfTwo.add(new Cheese("Cheese Tofu", 450, 478963, "ITA"));
        productsOnAShelfTwo.add(new Cheese("Cheese Chechil", 780, 634896, "ITA"));
        productsOnAShelfTwo.add(new Kefir("Kefir Urban", 120, 112456, "RU"));
        productsOnAShelfTwo.add(new Kefir("Kefir Ladybug", 200, 332654, "RU"));
        System.out.println("На " + shelfTwo.getName() + " " + shelfTwo.getNumber() + " находятся новые продукты :" + productsOnAShelfTwo);
        System.out.println("Первый продукт на полке - " + productsOnAShelfTwo.getFirst());
        System.out.println("Породукт на полке под № 4 (он стоит последним) : " + productsOnAShelfTwo.get(3));
        productsOnAShelfTwo.addLast(cheese);
        System.out.println("Добавим ешё один продукт " + productsOnAShelfTwo.getLast());
        System.out.println("И теперь он стоит последним на полке под № 5 : " + productsOnAShelfTwo.get(4));
        System.out.println("Все продукты на полке: ");

        for (FoodProduct foodProduct : productsOnAShelfTwo) {
            System.out.println(foodProduct);

        }
    }

}