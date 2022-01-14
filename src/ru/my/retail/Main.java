package ru.my.retail;

import ru.my.retail.person.Customer;
import ru.my.retail.person.Merchandiser;
import ru.my.retail.product.Cheese;
import ru.my.retail.product.Kefir;
import ru.my.retail.shop.Kassa;
import ru.my.retail.shop.Shop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
// создание магазина
        Shop shop = new Shop("Billa", "Lenina 44");
// создание кассы в магазине
        Kassa kassaOne = shop.getKassaOne();
        Kassa kassaTwo = shop.getKassaTwo();
// прибыль магазина
        int shopMoney = shop.getKassaOne().getMoney() + shop.getKassaTwo().getMoney();
        System.out.println("Прибыль магазина " + shop.getNameShop() + " составляет " + shopMoney + " руб.");
        shop.storeRevenue();
// продукты
        Kefir kefir = new Kefir("Kefir Kefi",150,123456,"01/01/2022",
                15.0,10.0,20.0,"15/01/2022","Manufacturer","Tetra Pack");

        Cheese cheese = new Cheese("Parmezan",900,789456,"01/01/2022",
                10.0,25.0,40.0,"01/01/2024","Italiano","wox");

// в главных ролях
        Customer customer = new Customer("John","man",(short)36 ,"Lenina 54");
        Merchandiser merchandiser = new Merchandiser("Nika","female",(short) 25,"Billa");




    }
}
