package ru.my.retail;

import ru.my.retail.person.Customer;
import ru.my.retail.person.Merchandiser;
import ru.my.retail.person.Сashier;
import ru.my.retail.product.Cheese;
import ru.my.retail.product.Kefir;
import ru.my.retail.shop.Kassa;
import ru.my.retail.shop.Shelf;
import ru.my.retail.shop.Shop;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// создание магазина
        Shop shop = new Shop("Billa", "Lenina 44");
// создание кассы в магазине
        Kassa kassaOne = shop.getKassaOne();
        Kassa kassaTwo = shop.getKassaTwo();
// кассир и его функции
        Сashier cashier = new Сashier();
        cashier.checkKassaAndCashier(kassaOne);
 // прибыль магазина
        int shopMoney = shop.getKassaOne().getMoney() + shop.getKassaTwo().getMoney();
        System.out.println("Общая сумма в кассах магазина " + shop.getNameShop() + " составляет " + shopMoney + " руб.");
        shop.storeRevenue();
// продукты
        Kefir kefir = new Kefir("Kefir Kefi",150,123456,"01/01/2022",
                15.0,10.0,20.0,15,"Manufacturer","Tetra Pack");
        Cheese cheese = new Cheese("Parmezan",900,789456,"01/01/2022",
                10.0,25.0,40.0,20,"Italiano","wox");
 // продуктовые полки
        Shelf shelfOne = shop.getShelfOne();
        Shelf shelfTwo = shop.getShelfTwo();
// Менчейдайзер и его функции
        Merchandiser merchandiser = new Merchandiser();
        merchandiser.checkTheProductBeforeSale(kefir, cheese, shelfOne, shelfTwo, merchandiser);
        merchandiser.checkTheProductOnTheShelf(kefir, cheese);
// Покупатель и его функции
        Customer customer = new Customer();
        customer.checkCustomer(shop);
        customer.customerCameTheShelvesAnd(shelfOne, kefir, kefir);
    }
}
