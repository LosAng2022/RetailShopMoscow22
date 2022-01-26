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
        cashier.helloDeveloper();
        cashier.checkKassaAndCashier(kassaOne);
 // прибыль магазина
       int shopMoney = shop.getKassaOne().getMoney() + shop.getKassaTwo().getMoney();
       System.out.println("Общая сумма в кассах магазина " + Shop.NAME_SHOP + " составляет " + shopMoney + " руб.");
       shop.storeRevenue();
// продукты
        Kefir kefir = new Kefir("Kefir ZZZ", 150, 123456, "25/01/2022",
                15, 10, 25, 25, "MKK","Tetra Pack");
        kefir.productForSaleInRetailShop();
        kefir.productForSaleInRetailShop(", молочный продукт для здорового питания!");
        Cheese cheese = new Cheese("Parmezan XXX", 650, 456789, "25/01/2022",
                10, 25, 35, 30, "MKK","Tetra Pack");
        cheese.productForSaleInRetailShop();
        cheese.productForSaleInRetailShop(", молочный продукт для настоящих ценителей");
 // продуктовые полки
       Shelf shelfOne = shop.getShelfOne();
       Shelf shelfTwo = shop.getShelfTwo();
// Менчейдайзер и его функции
        Merchandiser merchandiser = new Merchandiser();
        merchandiser.helloDeveloper();
        merchandiser.checkTheProductBeforeSale(kefir, cheese, shelfOne, shelfTwo, merchandiser);
        merchandiser.checkTheProductOnTheShelf(kefir, cheese);
// Покупатель и его функции
        Customer customer = new Customer();
        customer.helloDeveloper();
        customer.weLoveToEat();
        customer.checkCustomer(shop);
        customer.customerCameTheShelvesAnd(shelfOne, kefir, kefir);
        customer.kefirInTheBasket(kefir);
        customer.cheeseInTheBasket(cheese);

    }
}





