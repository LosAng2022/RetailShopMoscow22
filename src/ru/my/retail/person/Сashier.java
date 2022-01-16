package ru.my.retail.person;

import ru.my.retail.product.DairyProduct;
import ru.my.retail.shop.Kassa;
import ru.my.retail.shop.Shop;

import java.util.Scanner;

public class Сashier extends Person {

    private String name = "Alice", genderOfPerson = "female", address = "Lenina 44";
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
    public void checkCashier() {
        System.out.println("Введите возраст (он же пин для кассы) " + age + ".");
        age = scanner.nextShort();

        System.out.println("Имя: " + name + " возраст " + age + " место работы: " + placeOfWork + " , кассир.");
    }

    public void reportCashier(Kassa kassaOne) {
        int m = kassaOne.getMoney();
        String s = m > 10000 ? "<Большая сумма, закрыть кассу на отчёт." : "Сумма в кассе не большая, продолжать работать.";
        System.out.println(s.toUpperCase());

    }

    public void testKassa() {  // проверка правильности работы кассы
        System.out.println("Проверка систем кассы");
        int x = 5;
        while (x > 0) {
            System.out.println("код " + x + " успешно");
            x--;

        }


    }


}
