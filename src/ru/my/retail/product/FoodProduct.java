package ru.my.retail.product;

public abstract class FoodProduct implements ProductForHealthyDiet {

    private String productName;
    private int productPrice;
    private int barCode;
    private String dateOfProduction;

    public FoodProduct() {

    }

    public FoodProduct(String productName, int productPrice, int barCode, String dateOfProduction) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.barCode = barCode;
        this.dateOfProduction = dateOfProduction;
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

    public void infoProduct() { // информация о продукте
        System.out.println(" с ценой: " + productPrice + " руб, штрих-код: " + barCode
                + ", дата производства: " + dateOfProduction + ".");
    }
}
