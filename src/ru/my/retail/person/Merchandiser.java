package ru.my.retail.person;
import java.text.DecimalFormat;
import java.util.Scanner;

import ru.my.retail.product.Cheese;
import ru.my.retail.product.DairyProduct;
import ru.my.retail.product.FoodProduct;
import ru.my.retail.product.Kefir;
import ru.my.retail.shop.Shelf;


public class Merchandiser extends Person {

    private String name = "Nika", genderOfPerson = "female", address = "Lenina 44";
    private short age = 25;
    private String placeOfWork = "Billa";

    Scanner scanner = new Scanner(System.in);
    DecimalFormat decimalFormat = new DecimalFormat("#.00");


    public Merchandiser() {
        super();
    }


    @Override
    public void display() {

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getGenderOfPerson() {
        return super.getGenderOfPerson();
    }

    @Override
    public void setGenderOfPerson(String genderOfPerson) {
        super.setGenderOfPerson(genderOfPerson);
    }

    @Override
    public short getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(short age) {
        super.setAge(age);
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    // расчёт инфляции
    private void inflation(FoodProduct foodProduct) {
        int x = foodProduct.getProductPrice();
        int y = 100;
        int inflation = 20;
        int z;
        z = (x * inflation / y + x);
        foodProduct.setProductPrice(z);
        System.out.println(name + " меняет цену продукта - " + "В связи с ростом инфляции цена продукта "
                + foodProduct.getProductName() + " составляет: " + z + " руб.");

    }

    // проверка срока годности продукта
    private void checkShelfLife(DairyProduct dairyProduct) {
        int day_x = 5;
        int day_y = 30;
        if (dairyProduct.getShelfLife() >= day_x && dairyProduct.getShelfLife() >= day_y) {
            System.out.println("продукт " + dairyProduct.getProductName() + " просрочен, убрать с продажи.");
        } else {
            System.out.println("продукт " + dairyProduct.getProductName() + " свежий, всё отлично.");

        }
    }

    private void putProductOnTheShelf(Kefir kefir, Cheese cheese, Shelf shelfOne, Shelf shelfTwo) {
        String s = "Мерчендайзер " + name + " выставила продукт " + kefir.getProductName() +
                " на полке № " + shelfOne.getNumber() + " с новой ценой "
                + kefir.getProductPrice() + " руб. - \n - " + " и продукт " + cheese.getProductName()
                + " на полке № " + shelfTwo.getNumber() + " с новой ценой " + cheese.getProductPrice() + " руб.";
        System.out.println(s);
    }

    private void countTheProductsOnTheShelf(Kefir kefir, Cheese cheese) {
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
        System.out.println("Менчердайзер по имени " + name + " собирается посчитать товар на полках. " +
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
        System.out.println("Менчердайзер по имени " + name + " проверяет продукт");
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
        System.out.println("В магазин поступили продукты и менчендайзер " + merchandiser.name + " всё пересчитала :");
        countTheProductsOnTheShelf(kefir, cheese);
        System.out.println("Проверила срок годности :");
        checkShelfLife(kefir);
        checkShelfLife(cheese);
        System.out.println("Затем распечатала ценники с учётом новых вводных:");
        inflation(kefir);
        inflation(cheese);
        System.out.println("И только потом :");
        putProductOnTheShelf(kefir, cheese, shelfOne, shelfTwo);

    }
}









