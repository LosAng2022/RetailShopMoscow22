package ru.my.retail.product;

import ru.my.retail.shop.Shelf;
import ru.my.retail.shop.Shop;

import java.util.Random;

public class Kefir extends DairyProduct {

    private String packing;

    public Kefir() {
        super();
    }

    public Kefir(String productName, int productPrice, int barCode, String manufacturer) {
        super(productName, productPrice, barCode, manufacturer);
    }

    public Kefir(String productName, int productPrice, int barCode, String dateOfProduction, String manufacturer, double carboHydrate,
                 double protein, double calorieContent, int shelfLife, String packing) {
        super(productName, productPrice, barCode, dateOfProduction, manufacturer, carboHydrate, protein, calorieContent, shelfLife);
               this.packing = packing;

    }

    public String getPacking() {
        return packing;
    }

    public void setPackaging(String packing) {
        this.packing = packing;

    }
    @Override
    public void infoProduct() {
        System.out.println(" с ценой: " + getProductPrice() + " руб, штрих-код: " + getBarCode()
                + ", дата производства: " + getDateOfProduction() +  " упаковка: " + packing);
    }
    @Override
    public double productContent() {
        return super.productContent();
    }
    public void productForSaleInRetailShop (String str) { // пример статического полимор.
        System.out.println("Продукт для продажи в розничном магазине" + str);
    }

    public void packageOfKefirSwollen() {
        System.out.println("Пакет кефира вздулся");

    }

    @Override
    public void forHealthyDiet() {
        System.out.println(getProductName() + " для здорового питания");
    }

    public void kefirForSail(Kefir kefir) {
        kefir.productForSaleInRetailShop();
        kefir.productForSaleInRetailShop(", вкусный молочный продукт!");
        kefir.forHealthyDiet();

    }

    @Override
    public String toString() {
        return super.toString();
    }


    }



