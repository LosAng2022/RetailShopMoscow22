package ru.my.retail.shop;

public class Shop {
    private String nameShop;
    private String shopAddress;
    private Kassa kassaOne;
    private Kassa kassaTwo;

    public Shop(String nameShop, String shopAddress) {
        kassaOne = new Kassa("Касса № 1", 10000);
        kassaTwo = new Kassa("Касса № 2", 10000);
        this.nameShop = nameShop;
        this.shopAddress = shopAddress;
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

    public int storeRevenue() {  // выручка магазина
        int nds = 20;
        int x = 120;
        int sum = (getKassaOne().getMoney() + getKassaTwo().getMoney());
        int a = (sum / x) * nds; // НДС в том числе
        int b = sum - a; // сумма без ндс
        System.out.println("Прибыль магазина " + nameShop + " составляет " + b + " руб." + " без НДС");
        return b;
    }
}
