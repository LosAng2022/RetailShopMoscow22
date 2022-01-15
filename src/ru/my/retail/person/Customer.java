package ru.my.retail.person;

import ru.my.retail.shop.Shop;

public class Customer extends Person {

    private String name = "John", genderOfPerson = "man", address = "Lenina 54";
    private short age = 37;
    private int customerMoney = 15000;


    public Customer() {
        super();
    }

    public Customer(String name, String genderOfPerson, String address, short age, int customerMoney) {
        this.name = name;
        this.genderOfPerson = genderOfPerson;
        this.address = address;
        this.age = age;
        this.customerMoney = customerMoney;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCustomerMoney() {
        return customerMoney;
    }

    public void setCustomerMoney(int customerMoney) {
        if (customerMoney > 500 && customerMoney < 10000000)
            this.customerMoney = customerMoney;
    }

    // достаточно ли денег у покупателя
    public int checkCustomerMoney() {
        if (customerMoney > 1000) {
            System.out.println("Покупатель " + name + " идёт в магазин за продуктами, у него достаточно денег!");

        } else
            System.out.println("Покупатель " + name + " не идёт в магазин");
        return customerMoney;
    }

    // вход покупателя в магазин
    public void enterTheShop(Shop shop) {
        System.out.println("Покупатель " + name + " входит в магазин " + shop.getNameShop() + " который находиться " +
                "по адресу " + shop.getShopAddress() + ".");

    }

}


