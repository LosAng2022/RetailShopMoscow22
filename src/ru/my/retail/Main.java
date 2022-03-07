package ru.my.retail;
import ru.my.retail.model.Day;
import ru.my.retail.person.Courier;
import ru.my.retail.person.Customer;
import ru.my.retail.person.Merchandiser;
import ru.my.retail.person.Сashier;
import ru.my.retail.product.Cheese;
import ru.my.retail.product.Kefir;
import ru.my.retail.shop.Kassa;
import ru.my.retail.shop.Shelf;
import ru.my.retail.shop.Shop;
import ru.my.retail.shop.ShopService;

import java.util.Scanner;

import static ru.my.retail.product.DairyProduct.dairyProducts;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// создание магазина
        Shop shop = new Shop();
        shop.newProductsInShop();
// создание кассы в магазине
        Kassa kassaOne = shop.getKassaOne();
        Kassa kassaTwo = shop.getKassaTwo();
        ShopService shopService = new ShopService();
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
        Cheese cheese = new Cheese("Parmezan", 650, 147258, "ITA",
                "11/02/2022", 10.5, 20.2, 40.0, 30, "Wox");
        cheese.cheeseForSail(cheese);
        cheese.forEating(cheese);
// продуктовые полки
        Shelf shelfOne = shop.getShelfOne();
        Shelf shelfTwo = shop.getShelfTwo();
// продукты на полке
        shelfOne.productOnShelfOne(dairyProducts()[2], shelfOne);
        shelfTwo.productOnShelfTwo(dairyProducts()[2], shelfTwo);
// Менчейдайзер и его функции
        Merchandiser merchandiser = new Merchandiser();
        merchandiser.shopProductsDatabase();
        merchandiser.checkTheProductBeforeSale(kefir, cheese, shelfOne, shelfTwo, merchandiser);
        merchandiser.checkTheProductOnTheShelf(kefir, cheese);
// Покупатель и его функции
        Customer customer = new Customer();
        customer.checkCustomer(shop, kefir, kefir, cheese);
        customer.lookingForProductsOnAShelfOne(shelfOne,shop);
        customer.lookingForProductsOnAShelfTwo(shelfTwo);
//доставка
       shop.delivery();
       Courier courier = shopService.confirmDelivery(kefir, scanner.next());
       System.out.println(courier);

    }

}








