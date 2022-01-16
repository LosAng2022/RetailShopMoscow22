package ru.my.retail;

import ru.my.retail.person.Customer;
import ru.my.retail.person.Merchandiser;
import ru.my.retail.person.Сashier;
import ru.my.retail.product.Cheese;
import ru.my.retail.product.Kefir;
import ru.my.retail.shop.Kassa;
import ru.my.retail.shop.Shop;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
// создание магазина
        Shop shop = new Shop("Billa", "Lenina 44");
// создание кассы в магазине
        Kassa kassaOne = shop.getKassaOne();
        Kassa kassaTwo = shop.getKassaTwo();
// кассир
        Сashier cashier = new Сashier();
// проверка кассира
       cashier.checkCashier();
// тест кассы
        cashier.testKassa(); // while
// отчёт по кассе
        cashier.reportCashier(kassaOne); // тернарный оператор
// прибыль магазина
        int shopMoney = shop.getKassaOne().getMoney() + shop.getKassaTwo().getMoney();
        System.out.println("Общая сумма в кассах магазина " + shop.getNameShop() + " составляет " + shopMoney + " руб.");
        shop.storeRevenue();
       // продукты
        Kefir kefir = new Kefir("Kefir Kefi",150,123456,"01/01/2022",
                15.0,10.0,20.0,15,"Manufacturer","Tetra Pack");
        Cheese cheese = new Cheese("Parmezan",900,789456,"01/01/2022",
                10.0,25.0,40.0,20,"Italiano","wox");
// в главных ролях
        Customer customer = new Customer();
// идёт ли он в магазин if и else
        customer.checkCustomerMoney();
// покупатель додсчитал деньги
        customer.moneyСounting(); // for
        customer.guessShop(); // do while
// покупатель входит в магазин
        customer.enterTheShop(shop);
// работник магизина
        Merchandiser merchandiser = new Merchandiser();
// замена ценников
       merchandiser.inflation(kefir);
       merchandiser.inflation(cheese);
// проверка срока годности продукта if и else
       merchandiser.checkShelfLife(kefir);
       merchandiser.checkShelfLife(cheese);

    }
}
