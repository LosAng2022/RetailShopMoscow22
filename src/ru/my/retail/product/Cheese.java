package ru.my.retail.product;

import java.util.Random;

public class Cheese extends DairyProduct {

    private String packing;

    public Cheese() {
        super();
    }

    public Cheese(String productName, int productPrice, int barCode, String manufacturer) {
        super(productName, productPrice, barCode, manufacturer);
    }
    public Cheese(String productName, int productPrice, int barCode, String manufacturer, String dateOfProduction, double carboHydrate,
                  double protein, double calorieContent, int shelfLife, String packing) {
        super(productName, productPrice, barCode, dateOfProduction, manufacturer, carboHydrate, protein, calorieContent, shelfLife);

        this.packing = packing;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    @Override
    public void infoProduct() {
        System.out.println(" с ценой: " + getProductPrice() + " руб, штрих-код: " + getBarCode()
                + ", дата производства: " + getDateOfProduction() + " упаковка: " + packing);
    }

    @Override
    public double productContent() { return super.productContent();
    }

    public void productForSaleInRetailShop (String str) { // пример статического полимор.
        System.out.println("Продукт для продажи в розничном магазине" + str);
    }
    public void slicedHardCheeseParmesan () {
        System.out.println("Твердый сыр пармезан нарезан слайсами");
    }
    @Override
    public void forHealthyDiet() {
        System.out.println(getProductName() + " для здорового питания");
    }

    public void cheeseForSail(Cheese cheese) {
        cheese.productForSaleInRetailShop();
        cheese.productForSaleInRetailShop(", молочный продукт для настоящих ценителей");
        cheese.forHealthyDiet();

    }

    @Override
    public String toString() {
        return super.toString();
    }
}


