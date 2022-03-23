package ru.my.retail;
import ru.my.retail.person.Courier;
import ru.my.retail.shop.*;
import ru.my.retail.stream.Resource;
import ru.my.retail.stream.TheStreamThread;
import ru.my.retail.person.Customer;
import ru.my.retail.person.Merchandiser;
import ru.my.retail.person.Сashier;
import ru.my.retail.product.Cheese;
import ru.my.retail.product.Kefir;
import ru.my.retail.stream.ThreadResource;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static ru.my.retail.person.Courier.courierActions;
import static ru.my.retail.person.Customer.customerActions;
import static ru.my.retail.person.Merchandiser.merchandiserActions;
import static ru.my.retail.person.Сashier.cashierActions;
import static ru.my.retail.product.Cheese.getCheese;
import static ru.my.retail.product.DairyProduct.dairyProducts;
import static ru.my.retail.product.Kefir.getKefir;
import static ru.my.retail.shop.Shop.*;

public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       Shop shop = shopBilla(); // поток
        Kassa kassaOne = shop.getKassaOne();
        Kassa kassaTwo = shop.getKassaTwo();
        ShopService shopService = new ShopService();
        Basket basket = shop.getBasket();
        Shelf shelfOne = shop.getShelfOne();
        Shelf shelfTwo = shop.getShelfTwo();
        Shelf shelfThree = shop.getShelfThree();
        cashierActions(kassaOne);
        Kefir kefir = getKefir();
        Cheese cheese = getCheese();
        shelfOne.productOnShelfOne(dairyProducts()[2], shelfOne);
        shelfTwo.productOnShelfTwo(dairyProducts()[2], shelfTwo);
        merchandiserActions(kefir, cheese, shelfOne, shelfTwo);
        customerActions(shop, kefir, cheese, shelfOne, shelfTwo); // поток
        courierActions(scanner, shop, shopService, kefir);

    }

}
















