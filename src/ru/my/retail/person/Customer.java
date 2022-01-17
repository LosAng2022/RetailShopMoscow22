package ru.my.retail.person;

import ru.my.retail.product.DairyProduct;
import ru.my.retail.product.FoodProduct;
import ru.my.retail.product.Kefir;
import ru.my.retail.shop.Shop;

import java.util.Scanner;

public class Customer extends Person {

    private String name = "John", genderOfPerson = "man", address = "Lenina 54";
    private short age = 37;
    private int customerMoney = 15000;
    Scanner scanner = new Scanner(System.in);


    public Customer() {
        super();
    }

    public Customer(String name, String genderOfPerson, String address, short age, int customerMoney) {
        this.name = name;
        this.genderOfPerson = genderOfPerson;
        this.address = address;
        this.age = age;
        this.customerMoney = customerMoney;
    }


    @Override
    public void display() {

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getGenderOfPerson() {
        return super.getGenderOfPerson();
    }

    @Override
    public void setGenderOfPerson(String genderOfPerson) {
        super.setGenderOfPerson(genderOfPerson);
    }

    @Override
    public short getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(short age) {
        super.setAge(age);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCustomerMoney() {
        return customerMoney;
    }

    public void setCustomerMoney(int customerMoney) {
        if (customerMoney > 500 && customerMoney < 10000000)
            this.customerMoney = customerMoney;
    }

    // достаточно ли денег у покупателя
    public int checkCustomerMoney() {
        if (customerMoney > 1000) {
            System.out.println("Покупатель " + name + " идёт в магазин за продуктами, у него достаточно денег!");

        } else
            System.out.println("Покупатель " + name + " не идёт в магазин");
        return customerMoney;
    }
// подсчёт купюр по 5000
    public void moneyСounting() {
        for (int banknote = 1; banknote <= 3; banknote++)
            System.out.println(banknote + " купюра номиналом 5000 руб.");
        System.out.println(" итого ".toUpperCase() + customerMoney + " руб.");

    }
    public void guessShop () {
    String guess;
        do {
        System.out.print("Угадай название магазина: ");
        guess = scanner.nextLine();
    }
        while (!"Billa".equals(guess));
        System.out.println("Поздравляю! Ты угадал название магазина!");

    }

    // вход покупателя в магазин
    public void enterTheShop(Shop shop) {
        System.out.println("Покупатель " + name + " входит в магазин " + shop.getNameShop() + " который находиться " +
                "по адресу " + shop.getShopAddress() + ".");

    }

    public void takeTheProduct(FoodProduct foodProduct) {
        System.out.print("Покупатель " + name + " берёт продукт " + foodProduct.getProductName());
        foodProduct.infoProduct();
    }

    public void viewTheContent(DairyProduct dairyProduct) {
        System.out.print("Покупатель " + name + "смотрит состав продукта " + dairyProduct.getProductName());
        dairyProduct.productContent();

    }

    public void productPutItInTheBasket(FoodProduct foodProduct) {
        System.out.println("Покупатель " + name + " кладёт продукт " + foodProduct.getProductName() + " в корзину.");

    }
}


