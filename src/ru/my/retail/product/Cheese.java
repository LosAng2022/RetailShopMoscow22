package ru.my.retail.product;

public class Cheese extends DairyProduct {

    private String manufacturer;
    private String packing;

    public Cheese() {
        super();
    }

    public Cheese(String productName, int productPrice, int barCode, String dateOfProduction, double carboHydrate,
                  double protein, double calorieContent, int shelfLife, String manufacturer, String packing) {
        super(productName, productPrice, barCode, dateOfProduction, carboHydrate, protein, calorieContent, shelfLife);
        this.manufacturer = manufacturer;
        this.packing = packing;
    }
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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
                + ", дата производства: " + getDateOfProduction() + " производитель: " + manufacturer + " упаковка: "
                + packing);
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

}


