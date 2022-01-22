package ru.my.retail;

import ru.my.retail.person.Customer;
import ru.my.retail.person.Merchandiser;
import ru.my.retail.person.Сashier;
import ru.my.retail.product.Cheese;
import ru.my.retail.product.Kefir;
import ru.my.retail.shop.Kassa;
import ru.my.retail.shop.Shelf;
import ru.my.retail.shop.Shop;

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
        int shopMoney = shop.getKassaOne().getMoney() + shop.getKassaTwo().getMoney();
        System.out.println("Общая сумма в кассах магазина " + shop.getNAME_SHOP() + " составляет " + shopMoney + " руб.");
        shop.storeRevenue();
// продукты
        Kefir kefir = new Kefir();
        Cheese cheese = new Cheese();
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

