package ru.my.retail.shop;

import ru.my.retail.product.Cheese;
import ru.my.retail.product.FoodProduct;
import ru.my.retail.product.Kefir;

import java.util.Collections;
import java.util.List;

public class Shop {

    private String nameShop;
    public static final String NAME_SHOP = "Billa";
    private String shopAddress;
    public static final String SHOP_ADDRESS = "Lenina 44";
    protected Kassa kassaOne;
    protected Kassa kassaTwo;
    protected Shelf shelfOne, shelfTwo, shelfThree;


    public Shop() {
        shelfOne = new Shelf("Полка", 1);
        shelfTwo = new Shelf("Полка", 2);
        shelfThree = new Shelf("Полка", 3);
        kassaOne = new Kassa("Касса № 1", 10000);
        kassaTwo = new Kassa("Касса № 2", 10005);

    }

    public String getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public Kassa getKassaOne() {
        return kassaOne;
    }

    public Kassa getKassaTwo() {
        return kassaTwo;
    }

    public Shelf getShelfOne() {
        return shelfOne;
    }

    public Shelf getShelfTwo() {
        return shelfTwo;
    }

    public Shelf getShelfThree() {
        return shelfThree;
    }

    public int storeRevenue() {  // выручка магазина
        int nds = 20;
        int x = 120;
        int sum = (getKassaOne().getMoney() + getKassaTwo().getMoney());
        int a = (sum / x) * nds; // НДС в том числе
        int b = sum - a; // сумма без ндс
        System.out.println("Прибыль магазина " + NAME_SHOP + " по адресу " + SHOP_ADDRESS + " составляет "
                + b + " руб." + " без НДС");
        return b;
    }

    public void shopProfit(Shop shop) {
        int shopMoney = shop.getKassaOne().getMoney() + shop.getKassaTwo().getMoney();
        System.out.println("Общая сумма в кассах магазина " + Shop.NAME_SHOP + " составляет " + shopMoney + " руб.");
        shop.storeRevenue();

    }
    public void productShelf(Shop shop) {
        Shelf shelfOne = shop.getShelfOne();
        Shelf shelfTwo = shop.getShelfTwo();
    }

    }

