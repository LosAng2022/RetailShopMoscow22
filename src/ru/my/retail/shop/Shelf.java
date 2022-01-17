package ru.my.retail.shop;

import ru.my.retail.product.Kefir;

public class Shelf {

    private String name;
    private int number;
    private Kefir kefir;

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
}
