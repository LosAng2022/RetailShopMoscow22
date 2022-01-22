package ru.my.retail.person;

import ru.my.retail.product.DairyProduct;
import ru.my.retail.product.FoodProduct;
import ru.my.retail.product.Kefir;
import ru.my.retail.shop.Shelf;
import ru.my.retail.shop.Shop;

import java.util.Scanner;

public class Customer extends Person {

    private String name, genderOfPerson, address;
    private short age;
    private final String NAME = "John", GENDER_OF_PERSON = "man", ADDRESS = "Lenina 54";
    private final short AGE = 37;
    private int customerMoney;
    private final int CUSTOMER_MONEY = 15000;
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

    public String getNAME() {
        return NAME;
    }

    public String getGENDER_OF_PERSON() {
        return GENDER_OF_PERSON;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public short getAGE() {
        return AGE;
    }

    public int getCUSTOMER_MONEY() {
        return CUSTOMER_MONEY;
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
        if (customerMoney > 1000) {
            System.out.println("У " + NAME + " достаточно денег!");

        } else
            System.out.println("У " + NAME + " не достаточно денег");

    }
// подсчёт купюр по 5000
    public void moneyCounting() {
        for (int banknote = 1; banknote <= 3; banknote++)
            System.out.println(banknote + " купюра номиналом 5000 руб.");
        System.out.println(" итого ".toUpperCase() + CUSTOMER_MONEY + " руб.");

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
        System.out.println("Покупатель " + NAME + " входит в магазин " + shop.getNameShop() + " который находиться " +
                "по адресу " + shop.getSHOP_ADDRESS() + ".");

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

    public void productPutItInTheBasket(FoodProduct foodProduct) {
        System.out.println("Покупатель " + NAME + " кладёт продукт " + foodProduct.getProductName() + " в корзину.");

    }
        int [] array = new int[3];
        Kefir [] basket = new Kefir[5];

        Kefir kefirA = new Kefir();
        Kefir kefirB = new Kefir();
        Kefir kefirC = new Kefir();

        Kefir [] basket2 = {kefirA, kefirB, kefirC};

        public void foo() {
            System.out.println(basket2[2]);

        }
}


