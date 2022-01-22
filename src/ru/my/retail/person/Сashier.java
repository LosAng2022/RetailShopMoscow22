package ru.my.retail.person;

import ru.my.retail.product.DairyProduct;
import ru.my.retail.shop.Kassa;
import ru.my.retail.shop.Shop;

import java.util.Scanner;

public class Сashier extends Person {
    String name = "Alice", genderOfPerson = "female", address = "Lenina 44";
    private short age = 35;
    private String placeOfWork = "Billa";
    private Kassa kassaOne;
    private Kassa kassaTwo;
    Scanner scanner = new Scanner(System.in);

    public Сashier () {
        super();
    }

    public Сashier(String name, String genderOfPerson, String address, short age, String placeOfWork) {
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

    // приветствие кассира
    private void checkCashier() {
        System.out.println("Введите возраст (он же пин для кассы) " + age + ".");
        age = scanner.nextShort();

        System.out.println("Имя: " + name + " возраст " + age + " место работы: " + placeOfWork + " , кассир.");
    }

    private void reportCashier(Kassa kassaOne) {
        int m = kassaOne.getMoney();
        String s = m > 10000 ? "<Большая сумма, положить часть денег в сейф." : "Есть сумма в кассе необходимая для работы.";
        System.out.println(s.toUpperCase());

    }

    private void testKassa() {  // проверка правильности работы кассы
        System.out.println("Проверка систем кассы");
        int x = 1;
        while (x <= 7) {
            System.out.println("тест системы " + x + " - успешно");
            x++;

        }


    }

    public void checkKassaAndCashier(Kassa kassaOne) {
        System.out.println(name + " приступает к работе на кассе!");
        checkCashier();
        System.out.println("Проверяет работу кассы :");
        testKassa();
        System.out.println("Теперь нужно проверить сумму в кассе");
        reportCashier(kassaOne);

    }

}
