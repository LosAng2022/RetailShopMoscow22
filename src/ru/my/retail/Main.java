package ru.my.retail;

import ru.my.retail.person.Customer;
import ru.my.retail.person.Merchandiser;
import ru.my.retail.person.Person;
import ru.my.retail.person.Сashier;
import ru.my.retail.product.Cheese;
import ru.my.retail.product.FoodProduct;
import ru.my.retail.product.Kefir;
import ru.my.retail.product.ProductForHealthyDiet;
import ru.my.retail.shop.Kassa;
import ru.my.retail.shop.Shelf;
import ru.my.retail.shop.Shop;

import java.awt.List;
import java.util.*;

public class Main {

     public static void main(String[] args) {

// создание магазина
        Shop shop = new Shop();
// создание кассы в магазине
        Kassa kassaOne = shop.getKassaOne();
        Kassa kassaTwo = shop.getKassaTwo();
// кассир и его функции
        Сashier cashier = new Сashier();
        //cashier.checkKassaAndCashier(kassaOne);
 // прибыль магазина
        //shop.shopProfit(shop);
// продукты
       Kefir kefir = new Kefir("Kefir Rustic", 150, 123456, "MKK");
       //kefir.kefirForSail(kefir);
       //kefir.forEating(kefir);
        Cheese cheese = new Cheese("Parmezan", 650, 456789,  "MKK");
       //cheese.cheeseForSail(cheese);
       //cheese.forEating(cheese);
      // продуктовые полки
         Shelf shelfOne = shop.getShelfOne();
         Shelf shelfTwo = shop.getShelfTwo();
         // продукты на полке
         shelfOne.productOnShelfOne(kefir, cheese, shelfOne); //List<FoodProduct> productsOnAShelf = new ArrayList<>()
         shelfTwo.productOnShelfTwo(cheese, shelfTwo); //LinkedList<FoodProduct> productsOnAShelfTwo = new LinkedList<>();
         // Менчейдайзер и его функции
         Merchandiser merchandiser = new Merchandiser();
         //merchandiser.checkTheProductBeforeSale(kefir, cheese, shelfOne, shelfTwo, merchandiser);
         //merchandiser.checkTheProductOnTheShelf(kefir, cheese);
// Покупатель и его функции
         Customer customer = new Customer();
         //customer.customerHello(shop, customer);
         //customer.customerCameTheShelvesAnd(shelfOne, kefir, kefir);
         //customer.kefirInTheBasket(kefir);
         //customer.cheeseInTheBasket(cheese);


    }

}














