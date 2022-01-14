package ru.my.retail.product;

public class DairyProduct extends FoodProduct {

    private double carboHydrate;
    private double protein;
    private double calorieContent;
    private String shelfLife;

    public DairyProduct(String productName, int productPrice, int barCode, String dateOfProduction, double carboHydrate,
                        double protein, double calorieContent, String shelfLife) {
        super(productName, productPrice, barCode, dateOfProduction);
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

    public String getShelfLife() {
        return shelfLife;
    }

    private void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }

    public double productContent() { // состав продукта
        System.out.println(getProductName() + " углеводы: " + carboHydrate + ", белок: " + protein +
                ", калории: " + calorieContent + ", срок годности: " + shelfLife + ".");
        return carboHydrate + protein + calorieContent;
    }
}
