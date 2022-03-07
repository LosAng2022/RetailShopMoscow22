package ru.my.retail.person;

public class Courier extends Person {

    public Courier() {
    }

    public Courier(String name, String phoneNumber) {
        super(name, phoneNumber);
    }


    @Override
    public void helloDeveloper() {
        System.out.println("Привет крутой разработчик! Я курьер!");
    }

    @Override
    public String toString() {
        System.out.print("Доставку осуществляет: ");
        return "курьер " + getName() + ", телефон: " + getPhoneNumber();
    }
}


