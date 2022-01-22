package ru.my.retail.product;

import ru.my.retail.shop.Shelf;

public class Kefir extends DairyProduct {

    private final String PRODUCT_NAME = "Kefir Kefi";
    private final int PRODUCT_PRISE = 80;
    private final int BAR_CODE = 123456;
    private final String DATE_OF_PRODUCTION = "20.12.2021";
    private final double CARBO_HYDRATE = 15;
    private final double PROTEIN = 10;
    private final double CALORIES_CONTENT = 30;
    private final String SHELF_LIFE = "31.12.2021";
    private String manufacturer;
    private String packing;
    private final String MANUFACTURER = "MKK";
    private final String PACKING = "Tetra Pack";

    public Kefir() {
        super();
    }

    public Kefir(String productName, int productPrice, int barCode, String dateOfProduction, double carboHydrate,
                 double protein, double calorieContent, int shelfLife, String manufacturer, String packing) {
        super(productName, productPrice, barCode, dateOfProduction, carboHydrate, protein, calorieContent, shelfLife);
        this.manufacturer = manufacturer;
        this.packing = packing;
    }

    public String getPRODUCT_NAME() {
        return PRODUCT_NAME;
    }

    public int getPRODUCT_PRISE() {
        return PRODUCT_PRISE;
    }

    public int getBAR_CODE() {
        return BAR_CODE;
    }

    public String getDATE_OF_PRODUCTION() {
        return DATE_OF_PRODUCTION;
    }

    public double getCARBO_HYDRATE() {
        return CARBO_HYDRATE;
    }

    public double getPROTEIN() {
        return PROTEIN;
    }

    public double getCALORIES_CONTENT() {
        return CALORIES_CONTENT;
    }

    public String getSHELF_LIFE() {
        return SHELF_LIFE;
    }

    public String getMANUFACTURER() {
        return MANUFACTURER;
    }

    public String getPACKING() {
        return PACKING;
    }

    @Override
    public String getProductName() {
        return super.getProductName();
    }

    @Override
    public void setProductName(String productName) {
        super.setProductName(productName);
    }

    @Override
    public int getProductPrice() {
        return super.getProductPrice();
    }

    @Override
    public void setProductPrice(int productPrice) {
        super.setProductPrice(productPrice);
    }

    @Override
    public int getBarCode() {
        return super.getBarCode();
    }

    @Override
    public void setBarCode(int barCode) {
        super.setBarCode(barCode);
    }

    @Override
    public String getDateOfProduction() {
        return super.getDateOfProduction();
    }

    @Override
    public void setDateOfProduction(String dateOfProduction) {
        super.setDateOfProduction(dateOfProduction);
    }

    @Override
    public void infoProduct() {
        super.infoProduct();
    }

    @Override
    public double getCarboHydrate() {
        return super.getCarboHydrate();
    }

    @Override
    public void setCarboHydrate(double carboHydrate) {
        super.setCarboHydrate(carboHydrate);
    }

    @Override
    public double getProtein() {
        return super.getProtein();
    }

    @Override
    public void setProtein(double protein) {
        super.setProtein(protein);
    }

    @Override
    public double getCalorieContent() {
        return super.getCalorieContent();
    }

    @Override
    public void setCalorieContent(double calorieContent) {
        super.setCalorieContent(calorieContent);
    }

    @Override
    public int getShelfLife() {
        return super.getShelfLife();
    }

    @Override
    public double productContent() {
        return super.productContent();
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

    public void setPackaging(String packing) {
        this.packing = packing;
    }
}
