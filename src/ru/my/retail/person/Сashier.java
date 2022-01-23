package ru.my.retail.person;

import ru.my.retail.product.DairyProduct;
import ru.my.retail.shop.Kassa;
import ru.my.retail.shop.Shop;

import java.util.Scanner;

public class Сashier extends Person {

    private String name, genderOfPerson;
    private short age;
    public static final String NAME = "Alice";
    public static final short AGE = 35;
    private String placeOfWork;
    public static final String PLACE_OF_WORK = "Billa";
    private Kassa kassaOne;
    private Kassa kassaTwo;
    Scanner scanner = new Scanner(System.in);

    public Сashier() {
        super();
    }

    public Сashier(String name, String genderOfPerson, short age, String placeOfWork) {
        super(name,genderOfPerson,age);
        this.name = name;
        this.age = age;
        this.genderOfPerson = genderOfPerson;
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

    // приветствие кассира
    public void checkCashier() {
        System.out.println("Введите возраст (он же пин для кассы) " + AGE + ".");
        age = scanner.nextShort();

        System.out.println("Имя: " + NAME + " возраст " + AGE + " место работы: " + PLACE_OF_WORK + " , кассир.");
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
        System.out.println(NAME + " приступает к работе на кассе!");
        checkCashier();
        System.out.println("Проверяет работу кассы :");
        testKassa();
        System.out.println("Теперь нужно проверить сумму в кассе");
        reportCashier(kassaOne);

    }

}
