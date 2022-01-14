package ru.my.retail.person;

public class Merchandiser extends Person {

    private String placeOfWork;

    public Merchandiser(String name, String genderOfPerson, short age, String placeOfWork) {
        super(name, genderOfPerson, age);
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
}
