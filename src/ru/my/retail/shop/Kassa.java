package ru.my.retail.shop;

public class Kassa {

    private String name;
    private int money;

    public Kassa(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if(money > 100 && money < 10000000)
        this.money = money;
    }
}
