package ru.my.retail.shop;

import ru.my.retail.model.Day;
import ru.my.retail.person.Courier;
import ru.my.retail.product.FoodProduct;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShopService {

    private String name;

    public ShopService(String name) {
        this.name = name;
    }

    public Map<Day, Courier> dayToDelivery = new HashMap<>();

    public ShopService() {
        dayToDelivery.put(Day.MONDAY, new Courier("Михаил", "+79555555555"));
        dayToDelivery.put(Day.TUESDAY, new Courier("Александр", "+79566666666"));
        dayToDelivery.put(Day.WEDNESDAY, new Courier("Пётр", "+79577777777"));
        dayToDelivery.put(Day.THURSDAY, new Courier("Алексей", "+7958888888"));
        dayToDelivery.put(Day.FRIDAY, new Courier("Григорий", "+7959999999"));

    }

    public void buy(FoodProduct foodProduct) {

    }

    public Courier confirmDelivery(FoodProduct foodProduct, String day) {
        Day value = Day.valueOf(day);
        //System.out.println(value.getName());

        return dayToDelivery.get(value);

    }
}
