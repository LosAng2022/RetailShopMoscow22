package ru.my.retail.person;
import java.text.DecimalFormat;
import java.util.Scanner;

import ru.my.retail.product.Cheese;
import ru.my.retail.product.DairyProduct;
import ru.my.retail.product.FoodProduct;
import ru.my.retail.product.Kefir;
import ru.my.retail.shop.Shelf;

public class Merchandiser extends Person {

    public static final String NAME = "Nika";
    private String placeOfWork;
    public static final String PLACE_OF_WORK = "Billa";

    Scanner scanner = new Scanner(System.in);
    DecimalFormat decimalFormat = new DecimalFormat("#.00");

    public Merchandiser() {
        super();
    }

    public Merchandiser(String name, String genderOfPerson, short age, String placeOfWork) {
        super(name, genderOfPerson, age);
        this.placeOfWork = placeOfWork;

    }

    @Override
    public void helloDeveloper() {
        System.out.println("Привет крутой разработчик! Я работник магазина!");
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    // расчёт инфляции для продукта
    public int inflation(FoodProduct foodProduct) {
        System.out.println("Введите цену продукта (первый кефир, затем сыр) :");
        int x = foodProduct.getProductPrice();
        x = scanner.nextInt();
        int y = 100;
        int inflation = 20;
        int z;
        z = (x * inflation / y + x);
        foodProduct.setProductPrice(z);
        System.out.println(NAME + " меняет цену продукта - " + "В связи с ростом инфляции цена продукта "
                + foodProduct.getProductName() + " составляет: " + z + " руб.");

        return inflation;

    }

    // проверка срока годности продукта
    public void checkShelfLife(DairyProduct dairyProduct) {
        int day_x = 0;
        int day_y = 30;
        int z = dairyProduct.getShelfLife();
        System.out.println("Введите количество дней (от 1 до 30 иначе продукт будет просрочен) :");
        z = scanner.nextInt();
        if (z > day_x && z <= day_y) {
            System.out.println("продукт " + dairyProduct.getProductName() + " свежий, всё отлично.");
        } else {
            System.out.println("продукт " + dairyProduct.getProductName() + " просрочен, убрать с продажи.");

        }
    }

    public void putProductOnTheShelf(Kefir kefir, Cheese cheese, Shelf shelfOne, Shelf shelfTwo) {
        String s = "Мерчендайзер " + NAME + " выставила продукт " + kefir.getProductName() +
                " на полке № " + shelfOne.getNumber() + " с новой ценой "
                + kefir.getProductPrice() + " руб. - \n - " + " и продукт " + cheese.getProductName()
                + " на полке № " + shelfTwo.getNumber() + " с новой ценой " + cheese.getProductPrice() + " руб.";
        System.out.println(s);
    }

    public void countTheProductsOnTheShelf(Kefir kefir, Cheese cheese) {
        int kef = 0;
        int che = 0;

        for (int a1 = 1; a1 <= 1; a1++) {
            for (int b1 = 1; b1 <= 11; b1++) {
                kef++;
                System.out.print(kef + " ");

            }
            System.out.println(" - " + kefir.getProductName() + " шт.");

        }
        for (int c1 = 1; c1 <= 1; c1++) {
            for (int d1 = 1; d1 <= 15; d1++) {
                che++;
                System.out.print(che + " ");

            }
            System.out.println(" - " + cheese.getProductName() + " шт.");

        }
    }

    public void checkTheProductOnTheShelf(Kefir kefir, Cheese cheese) {
        System.out.println("Менчердайзер по имени " + NAME + " собирается посчитать товар на полках. " +
                "Сколько нужно проверить полок ? любое число : ");
        short shelfNumber = scanner.nextShort();
        System.out.println("На выбранной полке стоит продукт " + kefir.getProductName() + " и продукт " +
                cheese.getProductName() + " в количестве : ");
        short kefirNumber = scanner.nextShort();
        System.out.println("Варианты проверки товара : ");
        System.out.println("1 - проверить подукт по очереди");
        System.out.println("2 - проверить каждый второй");
        System.out.println("3 - проверить каждый третий");
        System.out.println("проверить выборочно, любое целое число : ");
        short scanOrder = scanner.nextShort();
        System.out.println("Менчердайзер по имени " + NAME + " проверяет продукт");
        for (short a1 = 1; a1 <= shelfNumber; a1++) {
            for (int a2 = 1; a2 <= kefirNumber; a2 = a2 + (int) scanOrder) {
                for (int a3 = 1; a3 <= kefirNumber; a3 = a3 + (int) scanOrder) {
                    System.out.println("Полка номер " + a1 + " продукт " + kefir.getProductName() + " - " + a2 +
                            ", продукт " + cheese.getProductName() + " - " + a3);

                }
            }
        }
    }

    public void checkTheProductBeforeSale(Kefir kefir, Cheese cheese, Shelf shelfOne, Shelf shelfTwo, Merchandiser merchandiser) {
        helloDeveloper();
        System.out.println("В магазин поступили продукты и менчендайзер " + Merchandiser.NAME + " всё пересчитала :");
        countTheProductsOnTheShelf(kefir, cheese);
        System.out.println("Выборочно проверила штрих-код и сверила по накладной с производителем:");
        scanBarcodeProduct(kefir);
        System.out.println("Проверяет срок годности продуктов:");
        checkShelfLife(kefir);
        checkShelfLife(cheese);
        System.out.println("Затем распечатала ценники с учётом новых вводных:");
        inflation(kefir);
        inflation(cheese);
        System.out.println("И только потом :");
        putProductOnTheShelf(kefir, cheese, shelfOne, shelfTwo);

    }

    public void scanBarcodeProduct(FoodProduct foodProduct) {
        int[] barcode = {435694, 654781, 328797, 932542, 123456, 244423, 444668};
        int i = 1;
        while (i < barcode.length) {

            if (barcode[i] == 123456) {
                System.out.println("Совпал штрих-код " + foodProduct.getBarCode() + " - " +
                        foodProduct.getProductName() + " производитель : " + foodProduct.getManufacturer() +
                        " позиция в товарной накладной " + i);
                break;
            }

            System.out.println("Штрих-код " + barcode[i] + " позиция в товарной накладной " + i);
            i++;
        }

    }
}










