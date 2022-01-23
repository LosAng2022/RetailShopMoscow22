package ru.my.retail.person;

import ru.my.retail.product.Cheese;
import ru.my.retail.product.DairyProduct;
import ru.my.retail.product.FoodProduct;
import ru.my.retail.product.Kefir;
import ru.my.retail.shop.Shelf;
import ru.my.retail.shop.Shop;

import java.util.Scanner;

public class Customer extends Person {

    private String name, genderOfPerson, address;
    private short age;
    public static final String NAME = "John";
    private int customerMoney;
        boolean theCustomerNeedsProducts;
    Scanner scanner = new Scanner(System.in);


    public Customer() {
        super();
    }

    public Customer(String name, String genderOfPerson, short age, int customerMoney){
        super(name, genderOfPerson, age);
            this.name = name;
            this.age = age;
            this.genderOfPerson = genderOfPerson;
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
    public void checkCustomerMoney() {
        int x = customerMoney;
        System.out.println("Введите сумму наличных (желательно более 1000) у покупателя :");
        x = scanner.nextInt();
        if (x > 1000) {
            System.out.println("У " + NAME + " достаточно денег!");

        } else
            System.exit(1000);




    }
// подсчёт денег
    public void moneyCounting() {
        for (int banknote = 1; banknote <= 3; banknote++)
            System.out.println(banknote + " наличные.");
        System.out.println(" пачка денег ".toUpperCase());

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
    public void enterTheShop(Shop shop) {
        System.out.println("Покупатель " + NAME + " входит в магазин " + Shop.NAME_SHOP + " который находиться " +
                "по адресу " + Shop.SHOP_ADDRESS + ".");

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
        System.out.println(NAME + " решил пересчитать свои деньги");
        moneyCounting();
        System.out.println("Угадаете ли вы в какой магазин пойдёт покупатель?");
        guessShop();
        enterTheShop(shop);

    }
    public void takeTheProduct(FoodProduct foodProduct) {
        System.out.print(NAME + " берёт продукт " + foodProduct.getProductName());

    }

    public void viewTheContent(DairyProduct dairyProduct) {
        System.out.print(NAME + " смотрит состав продукта " + dairyProduct.getProductName());


    }

    public void customerCameTheShelvesAnd(Shelf shelfOne, FoodProduct foodProduct, DairyProduct dairyProduct) {
        System.out.println(NAME + " подходит к продуктовой полке № " + shelfOne.getNumber() +
                " молочного отдела :");
        takeTheProduct(dairyProduct);
        foodProduct.infoProduct();
        viewTheContent(dairyProduct);
        dairyProduct.productContent();
        }

    public void producInTheBasket(FoodProduct foodProduct) {
        System.out.println("Покупатель " + NAME + " кладёт продукт в корзину.");

        String [] kefir = new String[4];

        kefir [0] = "Kefir";
        kefir [1] = "Kefirik";
        kefir [2] = "Proto Kefir";
        kefir [3] = "Abstract Kefir";
        for (int i = 0; i < 4; i++) {
            System.out.println("У " + NAME + " в корзине находится продукт :" + kefir[i] + " и " + NAME + " сверяет его с "
                    + kefir[2] + " по составу");


            }
        }

    }




