package ru.my.retail;
import ru.my.retail.person.Customer;
import ru.my.retail.person.Merchandiser;
import ru.my.retail.person.Сashier;
import ru.my.retail.product.Cheese;
import ru.my.retail.product.FoodProduct;
import ru.my.retail.product.Kefir;
import ru.my.retail.shop.Kassa;
import ru.my.retail.shop.Shelf;
import ru.my.retail.shop.Shop;
import java.util.*;

public class Main {

     public static void main(String[] args) {

// создание магазина
         Shop shop = new Shop();
         shop.newProductsInShop();
// создание кассы в магазине
         Kassa kassaOne = shop.getKassaOne();
         Kassa kassaTwo = shop.getKassaTwo();
// кассир и его функции
         Сashier cashier = new Сashier();
         cashier.checkKassaAndCashier(kassaOne);
// прибыль магазина
         shop.shopProfit(shop);
// продукты
         Kefir kefir = new Kefir("Kefir Rustic", 150, 123456, "11/02/2022", "MKK",
                 10.5, 7.2, 15.0, 25, "Tetra Pack");
         kefir.kefirForSail(kefir);
         kefir.forEating(kefir);
         Cheese cheese = new Cheese("Parmezan", 650, 147258, "11/02/2022",
                 "ITA", 10.5, 20.2, 40.0, 30, "Wox");
         cheese.cheeseForSail(cheese);
         cheese.forEating(cheese);
// продуктовые полки
         Shelf shelfOne = shop.getShelfOne();
         Shelf shelfTwo = shop.getShelfTwo();
// продукты на полке
         shelfOne.productOnShelfOne(kefir, cheese, shelfOne);
         shelfTwo.productOnShelfTwo(cheese, shelfTwo);
// Менчейдайзер и его функции
         Merchandiser merchandiser = new Merchandiser();
         merchandiser.checkTheProductBeforeSale(kefir, cheese, shelfOne, shelfTwo, merchandiser);
         merchandiser.checkTheProductOnTheShelf(kefir, cheese);
// Покупатель и его функции
         Customer customer = new Customer();
         customer.checkCustomer(shop, kefir, kefir, cheese);
         customer.lookingForProductsOnAShelfOne(shelfOne, kefir, shop);
         customer.lookingForProductsOnAShelfTwo(shelfTwo, cheese);

     }

}











