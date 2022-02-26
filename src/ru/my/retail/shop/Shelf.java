package ru.my.retail.shop;

import ru.my.retail.person.Merchandiser;
import ru.my.retail.product.*;

import java.util.*;

import static ru.my.retail.product.DairyProduct.dairyProducts;

public class Shelf implements ProductForHealthyDiet {

    private String name;
    private int number;
    private LinkedList<Object> products;
    private Collection<FoodProduct> foodProducts = new HashSet<>();


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

    public void productOnShelfOne(FoodProduct foodProduct, Shelf shelfOne) {
        List<FoodProduct> productsOnAShelf = new ArrayList<>(List.of(dairyProducts()));
        System.out.println("На " + shelfOne.getName() + " " + shelfOne.getNumber() + " находятся продукты :" + productsOnAShelf);
        System.out.println((long) productsOnAShelf.size() + " шт. количество продуктов находится на полке.");
        productsOnAShelf.remove(productsOnAShelf.get(1));
        System.out.println("Один продукт упал с полки и теперь на полке находятся : " + productsOnAShelf);
        System.out.println("Есть ли сыр на полке ? ");
        String s = productsOnAShelf.contains(productsOnAShelf.get(2)) ? "Да" : "Нет";
        System.out.println(s);
        System.out.println("Проверим его индекс - " + productsOnAShelf.indexOf(foodProduct));
        System.out.println((long) productsOnAShelf.size() + " шт. - количество продуктов находится на полке.");
        System.out.println("Породукт на полке под № 3 : " + productsOnAShelf.get(2));
        productsOnAShelf.add(1, foodProduct);
        System.out.println("Упавший продукт положили на полку и теперь продукт на полке под № 3 :" + productsOnAShelf.get(2));
        System.out.println("Наличие продуктов: Kefir Urban и Kefir Ladybug на полке:");
        String ku = "Kefir Urban";
        String klb = "Kefir Ladybug";
        for (FoodProduct f : productsOnAShelf) {
            if (f.getProductName().equals(ku))
                System.out.println("Продукт найден: ".toUpperCase() + f.getProductName());
            if (f.getProductName().equals(klb))
                System.out.println("Продукт найден: ".toUpperCase() + f.getProductName());
            else
                System.out.println("Другой продукт!!!");
        }
        System.out.println("Все продукты на полке: ");
        for (int i = 0; i < 9; i++) {
            System.out.println(productsOnAShelf.get(i));
            continue;
        }
    }

    public void productOnShelfTwo(FoodProduct foodProduct, Shelf shelfTwo) {
        System.out.println();
        LinkedList<FoodProduct> productsOnAShelfTwo = new LinkedList<>(List.of(dairyProducts()));
        System.out.println("На " + shelfTwo.getName() + " " + shelfTwo.getNumber() + " находятся новые продукты :" + productsOnAShelfTwo);
        System.out.println("Первый продукт на полке - " + productsOnAShelfTwo.getFirst());
        System.out.println("Породукт на полке под № 4 (он стоит последним) : " + productsOnAShelfTwo.get(3));
        productsOnAShelfTwo.addLast(foodProduct);
        System.out.println("Добавим ешё один продукт " + productsOnAShelfTwo.getLast());
        System.out.println("И теперь он стоит последним на полке под № 5 : " + productsOnAShelfTwo.get(4));
        System.out.println("Проверим наличие продуктов по цене:");
        int ct = 450;
        int p = 560;
        for (FoodProduct fp2 : productsOnAShelfTwo) {
            if (fp2.getProductPrice() == ct)
                System.out.println("Продукт найден: ".toUpperCase() + fp2.getProductName() + " c ценой " + fp2.getProductPrice() + " руб.");
            if (fp2.getProductPrice() == p)
                System.out.println("Продукт найден: ".toUpperCase() + fp2.getProductName()+ " c ценой " + fp2.getProductPrice() + " руб.");
            else
                System.out.println("Другая цена!");
        }
        System.out.println("Все продукты на полке: ");
        for (int i = 0; i < 9; i++) {
            System.out.println(productsOnAShelfTwo.get(i));
            continue;
        }
    }


    @Override
    public void forHealthyDiet() {

    }

}