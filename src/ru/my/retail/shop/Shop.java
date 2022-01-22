package ru.my.retail.shop;

public class Shop {

    private String nameShop;
    public final String NAME_SHOP = "Billa";
    private String shopAddress;
    public final String SHOP_ADDRESS = "Lenina 44";
    private Kassa kassaOne;
    private Kassa kassaTwo;
    private Shelf shelfOne, shelfTwo, shelfThree;


    public Shop() {
        shelfOne = new Shelf("Полка", 1);
        shelfTwo = new Shelf("Полка", 2);
        shelfThree = new Shelf("Полка" , 3);
        kassaOne = new Kassa("Касса № 1", 10000);
        kassaTwo = new Kassa("Касса № 2", 10005);

    }

    public String getNAME_SHOP() {
        return NAME_SHOP;
    }

    public String getSHOP_ADDRESS() {
        return SHOP_ADDRESS;
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
        System.out.println("Прибыль магазина " + NAME_SHOP + " составляет " + b + " руб." + " без НДС");
        return b;
    }

}
