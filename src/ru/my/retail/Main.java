package ru.my.retail;

import ru.my.retail.person.Customer;
import ru.my.retail.person.Merchandiser;
import ru.my.retail.person.Person;
import ru.my.retail.person.Сashier;
import ru.my.retail.product.Cheese;
import ru.my.retail.product.FoodProduct;
import ru.my.retail.product.Kefir;
import ru.my.retail.shop.Kassa;
import ru.my.retail.shop.Shelf;
import ru.my.retail.shop.Shop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// создание магазина
        Shop shop = new Shop();
// создание кассы в магазине
        Kassa kassaOne = shop.getKassaOne();
        Kassa kassaTwo = shop.getKassaTwo();
// кассир и его функции
        Сashier cashier = new Сashier();
        cashier.checkKassaAndCashier(kassaOne);
 // прибыль магазина
        shop.shopProfit(shop);
// продукты
        Kefir kefir = new Kefir("Kefir ZZZ", 150, 123456, "25/01/2022",
                15, 10, 25, 25, "MKK","Tetra Pack");
        kefir.kefirForSail(kefir);
        kefir.forEating(kefir);
        Cheese cheese = new Cheese("Parmezan XXX", 650, 456789, "25/01/2022",
                10, 25, 35, 30, "MKK","Tetra Pack");
        cheese.cheeseForSail(cheese);
        cheese.forEating(cheese);
        // продуктовые полки
       Shelf shelfOne = shop.getShelfOne();
       Shelf shelfTwo = shop.getShelfTwo();
// Менчейдайзер и его функции
        Merchandiser merchandiser = new Merchandiser();
        merchandiser.checkTheProductBeforeSale(kefir, cheese, shelfOne, shelfTwo, merchandiser);
        merchandiser.checkTheProductOnTheShelf(kefir, cheese);
// Покупатель и его функции
        Customer customer = new Customer();
        customer.customerHello(shop, customer);
        customer.customerCameTheShelvesAnd(shelfOne, kefir, kefir);
        customer.kefirInTheBasket(kefir);
        customer.cheeseInTheBasket(cheese);

    }

}












