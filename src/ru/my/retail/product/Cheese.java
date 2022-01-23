package ru.my.retail.product;

public class Cheese extends DairyProduct {

    public static final String PRODUCT_NAME = "Parmezan";
    public static final int PRODUCT_PRISE = 950;
    public static final int BAR_CODE = 456789;
    public static final String DATE_OF_PRODUCTION = "20.12.2021";
    public static final double CARBO_HYDRATE = 10;
    public static final double PROTEIN = 25;
    public static final double CALORIES_CONTENT = 50;
    public static final String SHELF_LIFE = "31.12.2023";
    private String manufacturer;
    private String packing;
    public static final String MANUFACTURER = "Italiano Parmezano";
    public static final String PACKING = "Wox";

    public Cheese() {
        super();
    }
    public Cheese(String productName, int productPrice, int barCode, String dateOfProduction, double carboHydrate,
                  double protein, double calorieContent, int shelfLife, String manufacturer, String packing) {
        super(productName, productPrice, barCode, dateOfProduction, carboHydrate, protein, calorieContent, shelfLife);
        this.manufacturer = manufacturer;
        this.packing = packing;
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

    public void setPacking(String packing) {
        this.packing = packing;
    }
}


