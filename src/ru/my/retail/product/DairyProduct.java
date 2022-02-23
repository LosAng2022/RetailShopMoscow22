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

    public static FoodProduct[] dairyProducts() {
        FoodProduct[] dairyProduct = new FoodProduct[9];
        dairyProduct[0] = new Cheese("Parmezan", 560, 456321, "ITA");
        dairyProduct[1] = new Kefir("Kefir Rustic", 130, 785236, "MKK");
        dairyProduct[2] = new Cheese("Cheese Tofu", 450, 478963, "ITA");
        dairyProduct[3] = new Kefir("Kefir Urban", 120, 112456, "RU");
        dairyProduct[4] = new Cheese("Cheese Chechil", 780, 634896, "ITA");
        dairyProduct[5] = new Kefir("Kefir Ladybug", 200, 332654, "RU");
        dairyProduct[6] = new Kefir("Kefir Rustic", 150, 123456, "MKK");
        dairyProduct[7] = new Cheese("Parmigiano Reggiano", 650, 147258, "ITA");
        dairyProduct[8] = new Cheese("Ricotta", 950, 456987, "ITA");

        return dairyProduct;
    }


}
