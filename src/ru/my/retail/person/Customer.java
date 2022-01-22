package ru.my.retail.person;

import ru.my.retail.product.DairyProduct;
import ru.my.retail.product.FoodProduct;
import ru.my.retail.product.Kefir;
import ru.my.retail.shop.Shelf;
import ru.my.retail.shop.Shop;

import java.util.Scanner;

public class Customer extends Person {

    private String name = "John", genderOfPerson = "man", address = "Lenina 54";
    private short age = 37;
    private int customerMoney = 15000;
    boolean theCustomerNeedsProducts;
    Scanner scanner = new Scanner(System.in);


    public Customer() {
        super();
    }

    public Customer(String name, String genderOfPerson, String address, short age, int customerMoney,
                    boolean theCustomerNeedsProducts) {
        this.name = name;
        this.genderOfPerson = genderOfPerson;
        this.address = address;
        this.age = age;
        this.customerMoney = customerMoney;
        this.theCustomerNeedsProducts = theCustomerNeedsProducts;
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
    private int checkCustomerMoney() {
        if (customerMoney > 1000) {
            System.out.println("У " + name + " достаточно денег!");

        } else
            System.out.println("У " + name + " не достаточно денег");
        return customerMoney;
    }
// подсчёт купюр по 5000
    private void moneyСounting() {
        for (int banknote = 1; banknote <= 3; banknote++)
            System.out.println(banknote + " купюра номиналом 5000 руб.");
        System.out.println(" итого ".toUpperCase() + customerMoney + " руб.");

    }
    private void guessShop () {
    String guess;
        do {
        System.out.print("Угадай название магазина: ");
        guess = scanner.nextLine();
    }
        while (!"Billa".equals(guess));
        System.out.println("Поздравляю! Вы угадали название магазина!");

    }

    // вход покупателя в магазин
    private void enterTheShop(Shop shop) {
        System.out.println("Покупатель " + name + " входит в магазин " + shop.getNameShop() + " который находиться " +
                "по адресу " + shop.getShopAddress() + ".");

    }

    private void checkCustomerNeedsProducts(Shop shop) {
        boolean theCustomerNeedsProducts = true;
        String s = theCustomerNeedsProducts ? "Иду в магазин!" : "Иду в баню!";
        System.out.println(s);

    }
    public void checkCustomer(Shop shop) {
        System.out.println("Привет покупатель! Идёшь ли ты в магазин? ");
        checkCustomerNeedsProducts(shop);
        System.out.println("Есть ли у покупателя денеги?");
        checkCustomerMoney();
        System.out.println(name + " решил пересчитать свои деньги");
        moneyСounting();
        System.out.println("Угадаете ли вы в какой магазин пойдёт покупатель?");
        guessShop();
        enterTheShop(shop);

    }
    public void takeTheProduct(FoodProduct foodProduct) {
        System.out.print(name + " берёт продукт " + foodProduct.getProductName());

    }

    public void viewTheContent(DairyProduct dairyProduct) {
        System.out.print(name + " смотрит состав продукта " + dairyProduct.getProductName());


    }

    public void customerCameTheShelvesAnd(Shelf shelfOne, FoodProduct foodProduct, DairyProduct dairyProduct) {
        System.out.println(name + " подходит к продуктовой полке № " + shelfOne.getNumber() +
                " молочного отдела :");
        takeTheProduct(dairyProduct);
        foodProduct.infoProduct();
        viewTheContent(dairyProduct);
        dairyProduct.productContent();
        }

    public void productPutItInTheBasket(FoodProduct foodProduct) {
        System.out.println("Покупатель " + name + " кладёт продукт " + foodProduct.getProductName() + " в корзину.");

    }


}


