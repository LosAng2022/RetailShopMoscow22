package ru.my.retail.person;

import ru.my.retail.product.Cheese;
import ru.my.retail.product.FoodProduct;
import ru.my.retail.product.Kefir;
import ru.my.retail.shop.Shop;

public abstract class Person {

    private String name, genderOfPerson;
    private short age;

    public Person() {

    }

    public Person(String name, String genderOfPerson, short age) {
        this.name = name;
        this.age = age;
        this.genderOfPerson = genderOfPerson;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenderOfPerson() {
        return genderOfPerson;
    }

    public void setGenderOfPerson(String genderOfPerson) {
        this.genderOfPerson = genderOfPerson;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        if (age > 10 && age < 110)
            this.age = age;
    }

   public abstract void helloDeveloper();


}




