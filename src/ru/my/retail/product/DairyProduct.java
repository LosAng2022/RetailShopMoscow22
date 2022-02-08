package ru.my.retail.product;

public abstract class DairyProduct extends FoodProduct {

    private double carboHydrate;
    private double protein;
    private double calorieContent;
    private int shelfLife;

    public DairyProduct() {
        super();
    }

    public DairyProduct(String productName, int productPrice, int barCode, String manufacturer) {
        super(productName, productPrice, barCode, manufacturer);
    }

    public DairyProduct(String productName, int productPrice, int barCode, String dateOfProduction, String manufacturer, double carboHydrate,
                        double protein, double calorieContent, int shelfLife) {
        super(productName, productPrice, barCode, dateOfProduction, manufacturer);
        this.carboHydrate = carboHydrate;
        this.protein = protein;
        this.calorieContent = calorieContent;
        this.shelfLife = shelfLife;
    }

    public double getCarboHydrate() {
        return carboHydrate;
    }

    public void setCarboHydrate(double carboHydrate) {
        if (carboHydrate > 0.5 && carboHydrate < 50)
        this.carboHydrate = carboHydrate;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        if (protein > 0.5 && protein < 50)
        this.protein = protein;
    }

    public double getCalorieContent() {
        return calorieContent;
    }

    public void setCalorieContent(double calorieContent) {
        if (calorieContent > 0.5 && calorieContent < 50)
        this.calorieContent = calorieContent;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        if (shelfLife > 5 && shelfLife < 30)
        this.shelfLife = shelfLife;
    }

    @Override
    public void forHealthyDiet() {
        super.forHealthyDiet();
    }

    public double productContent() { // состав продукта
        System.out.println(" углеводы: " + carboHydrate + ", белок: " + protein +
                ", калории: " + calorieContent + ", срок годности: " + shelfLife + " дней.");
        return carboHydrate + protein + calorieContent;
    }
}
