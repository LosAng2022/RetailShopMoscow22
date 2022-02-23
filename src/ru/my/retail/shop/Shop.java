package ru.my.retail.shop;

import ru.my.retail.product.Cheese;
import ru.my.retail.product.FoodProduct;
import ru.my.retail.product.Kefir;

import java.util.*;

public class Shop {

    private String nameShop;
    public static final String NAME_SHOP = "Billa";
    private String shopAddress;
    public static final String SHOP_ADDRESS = "Lenina 44";
    protected Kassa kassaOne;
    protected Kassa kassaTwo;
    protected Shelf shelfOne, shelfTwo, shelfThree;

    private FoodProduct[] foodProducts = new FoodProduct[10];
    private int productIndex;
    private int regenArrayIndex;

    public Shop() {
        shelfOne = new Shelf("Полка", 1);
        shelfTwo = new Shelf("Полка", 2);
        shelfThree = new Shelf("Полка", 3);
        kassaOne = new Kassa("Касса № 1", 10000);
        kassaTwo = new Kassa("Касса № 2", 10005);
    }

    public Shop(String nameShop) {
        this.nameShop = nameShop;
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

    @Override
    public String toString() {
        return getNameShop();

    }

    public FoodProduct[] FoodProducts() {
        return foodProducts;
    }

    public Object[] getFoodProduct() {
        return foodProducts;
    }

    public void addFoodProduct(FoodProduct foodProduct) {
        if (regenArrayIndex >= 10) {
            FoodProduct[] foodProducts1 = new FoodProduct[foodProducts.length + 10];
            System.arraycopy(foodProducts, 0, foodProducts1, 0, foodProducts.length);
            foodProducts = foodProducts1;
            regenArrayIndex = 0;
        }

        foodProducts[productIndex++] = foodProduct;
        regenArrayIndex++;
    }

    public void newProductsCounter() {
        for (int i = 0; i < 10; i++) {
            addFoodProduct(selectAnyProduct());
        }

        for (int i = 0; i < getFoodProduct().length; i++)
            System.out.println("Молочный продукт : " + getFoodProduct()[i] + " руб.");
    }

    private static FoodProduct selectAnyProduct() {
        Random r = new Random();
        int i = r.nextInt(10);
        if (i % 2 == 0) {
            return new Kefir("Kefir Urban", 120, 112456, "RU");

        }

        return new Cheese("Cheese Chechil", 780, 634896, "ITA");

    }

    public void newProductsInShop() {
        System.out.println("Магазин " + NAME_SHOP + " получил свежие продукты для продажи : ");
        newProductsCounter();

    }


}





