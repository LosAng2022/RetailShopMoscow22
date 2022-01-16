package ru.my.retail.person;
import java.util.Scanner;
import ru.my.retail.product.DairyProduct;
import ru.my.retail.product.FoodProduct;


public class Merchandiser extends Person {

    private String name = "Nika", genderOfPerson = "female", address = "Lenina 44";
    private short age = 25;
    private String placeOfWork = "Billa";


    public Merchandiser(){
        super();
    }

    public Merchandiser(String name, String genderOfPerson, String address, short age, String placeOfWork) {
        this.name = name;
        this.genderOfPerson = genderOfPerson;
        this.address = address;
        this.age = age;
        this.placeOfWork = placeOfWork;
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
    public void inflation(FoodProduct foodProduct) {
        int x = foodProduct.getProductPrice();
        int y = 100;
        int inflation = 20;
        int z;
        z = (x * inflation / y + x);
        foodProduct.setProductPrice(z);
        System.out.println("Мерчендайзер " + name + " меняет цену продукта - " + "В связи с ростом инфляции цена продукта "
                + foodProduct.getProductName() + " составляет: " + z + " руб.");

    }

    // проверка срока годности продукта
    public void checkShelfLife(DairyProduct dairyProduct) {
        int day_x = 5;
        int day_y = 30;
        if (dairyProduct.getShelfLife() >= day_x && dairyProduct.getShelfLife() >= day_y) {
            System.out.println("Продукт " + dairyProduct.getProductName() + " просрочен, убрать с полки.");
        } else {
            System.out.println("Продукт " + dairyProduct.getProductName() + " свежий, оставить на полке.");

        }

    }


}




