package ru.my.retail.model;

public enum Day {
    MONDAY ("понедельник"),
    TUESDAY ("вторник"),
    WEDNESDAY ("среда"),
    THURSDAY ("четверг"),
    FRIDAY ("пятница");
    //SATURDAY
    //SUNDAY
    private String name;
    Day(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


