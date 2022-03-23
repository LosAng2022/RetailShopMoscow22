package ru.my.retail.person;

import ru.my.retail.product.Kefir;
import ru.my.retail.shop.Shop;
import ru.my.retail.shop.ShopService;

import java.util.Scanner;

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

    public static void courierActions(Scanner scanner, Shop shop, ShopService shopService, Kefir kefir) {
        shop.delivery();
        Courier courier = shopService.confirmDelivery(kefir, scanner.next());
        System.out.println(courier);
    }
}


