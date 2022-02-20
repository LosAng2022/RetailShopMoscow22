package ru.my.retail.product;

import java.util.Objects;

public abstract class FoodProduct implements ProductForHealthyDiet {

    private String productName;
    private int productPrice;
    private int barCode;
    private String dateOfProduction;
    private String manufacturer;

    public FoodProduct() {

    }

    public FoodProduct(String productName, int productPrice, int barCode, String manufacturer) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.barCode = barCode;
        this.manufacturer = manufacturer;

    }

    public FoodProduct(String productName, int productPrice, int barCode, String dateOfProduction, String manufacturer) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.barCode = barCode;
        this.dateOfProduction = dateOfProduction;
        this.manufacturer = manufacturer;
    }
    public void productForSaleInRetailShop () { // пример статического полимор.
        System.out.println("Продукт " + productName + " для продажи.");
    }

    @Override
    public void forHealthyDiet() {

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
   }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        if (productPrice > 0 && productPrice < 10000)
           this.productPrice = productPrice;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public String getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void infoProduct() { // информация о продукте
        System.out.println(" с ценой: " + productPrice + " руб, штрих-код: " + barCode
                + ", дата производства: " + dateOfProduction + " производитель : " + manufacturer);
    }

    @Override
    public String toString() {
        return getProductName() + " с ценой " + getProductPrice() + " руб., штрих-код: " + getBarCode() + ", производитель: " + getManufacturer() + ".";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodProduct that = (FoodProduct) o;
        return Objects.equals(productName, that.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productPrice, barCode);
    }

}
