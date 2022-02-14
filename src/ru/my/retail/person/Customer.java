package ru.my.retail.person;

import ru.my.retail.product.Cheese;
import ru.my.retail.product.DairyProduct;
import ru.my.retail.product.FoodProduct;
import ru.my.retail.product.Kefir;
import ru.my.retail.shop.Shelf;
import ru.my.retail.shop.Shop;

import java.util.*;

public class Customer extends Person implements EntryInTheDiary {

    public static final String NAME = "John";
    private int customerMoney;
    boolean theCustomerNeedsProducts;
    private Kefir kefir;
    Scanner scanner = new Scanner(System.in);

    public Customer() {
        super();
    }

    public Customer(String name, String genderOfPerson, short age, int customerMoney) {
        super(name, genderOfPerson, age);
        this.customerMoney = customerMoney;

    }

    @Override
    public void helloDeveloper() {
        System.out.println("Привет крутой разработчик! Я покупатель!");
    }


    public int getCustomerMoney() {
        return customerMoney;
    }

    public void setCustomerMoney(int customerMoney) {
        if (customerMoney > 500 && customerMoney < 10000000)
            this.customerMoney = customerMoney;
    }

    // достаточно ли денег у покупателя
    public void checkCustomerMoney() {
        int x = customerMoney;
        System.out.println("Введите сумму наличных (желательно более 1000) у покупателя :");
        x = scanner.nextInt();
        if (x > 1000) {
            System.out.println("У " + NAME + " достаточно денег!");

        } else
            System.exit(1000);

    }

    // подсчёт денег
    public void moneyCounting() {
        for (int banknote = 1; banknote <= 3; banknote++)
            System.out.println(banknote + " наличные.");
        System.out.println(" пачка денег ".toUpperCase());

    }

    private void guessShop() {
        String guess;
        do {
            System.out.print("Угадай название магазина: ");
            guess = scanner.nextLine();
        }
        while (!"Billa".equals(guess));
        System.out.println("Поздравляю! Вы угадали название магазина!");

    }

    // вход покупателя в магазин
    public void enterTheShop(Shop shop) {
        System.out.println("Покупатель " + NAME + " входит в магазин " + Shop.NAME_SHOP + " который находиться " +
                "по адресу " + Shop.SHOP_ADDRESS + ".");

    }

    public void checkCustomerNeedsProducts(Shop shop) {
        String s = theCustomerNeedsProducts ? "Иду в баню!" : "Иду в магазин!";
        System.out.println(s);

    }

    @Override
    public void toDoList(FoodProduct foodProduct, Kefir kefir, Cheese cheese) {
        System.out.println("У нашего покупателя по имени " + NAME + " в ежедневнике есть заметка со списком продуктов, " +
                "которые нужно купить.");
        FoodProduct[] shoppingList = new FoodProduct[6];
        shoppingList[0] = cheese;
        shoppingList[1] = kefir;
        shoppingList[2] = new Cheese("Cheese Tofu", 450, 478963, "ITA");
        shoppingList[3] = new Kefir("Kefir Urban", 120, 112456, "RU");
        shoppingList[4] = new Cheese("Cheese Chechil", 780, 634896, "ITA");
        shoppingList[5] = new Kefir("Kefir Ladybug", 200, 332654, "RU");

        for (int i = 0; i < 6; i++) {
            System.out.println("У " + NAME + " в списке покупок находится : " + shoppingList[i] + " " + foodProduct.getProductName());

        }
        System.out.println();
        System.out.println("А также в ежедневнике имеется запись со списком магазинов где можно купить продукты, " +
                "но желательно выбрать один!");
        Shop[] storelist = new Shop[4];
        storelist[0] = new Shop("Billa");
        storelist[1] = new Shop("Шестёрочка");
        storelist[2] = new Shop("Ащяс");
        storelist[3] = new Shop("НеВерный");
        int index = 0;
        do {
            System.out.println("Магазин : " + storelist[index++]);

        } while (index < storelist.length);

        System.out.println(NAME + " пойдёт в магазин " + storelist[0]);

    }

    public void checkCustomer(Shop shop, FoodProduct foodProduct, Kefir kefir, Cheese cheese) {
        helloDeveloper();
        System.out.println("Привет покупатель! Идёшь ли ты в магазин? ");
        checkCustomerNeedsProducts(shop);
        System.out.println("Есть ли у покупателя денеги?");
        checkCustomerMoney();
        System.out.println(NAME + " решил пересчитать свои деньги");
        moneyCounting();
        System.out.println("Угадаете ли вы в какой магазин пойдёт покупатель?");
        guessShop();
        toDoList(foodProduct, kefir, cheese);

    }

    public void lookingForProductsOnAShelfOne(Shelf shelfOne, FoodProduct foodProduct, Shop shop) {
        enterTheShop(shop);
        System.out.println(NAME + " подходит к продуктовой полке № " + shelfOne.getNumber() +
                " молочного отдела и начинает искать интересующие его продукты.");
        System.out.println("На продуктовой полке " + shelfOne.getNumber() + " находятся следующие продукты :");
        List<FoodProduct> shelf1 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            shelf1.add(foodProduct);
            shelf1.add(new Kefir("Kefir Urban", 120, 112456, "RU"));
        }
        for (FoodProduct foodProduct1 : shelf1) {

            System.out.println(foodProduct1 + " руб.");
        }
        System.out.println("Всего " + shelf1.size() + " шт.");
        System.out.println(NAME + " взял с полки 3 шт. " + foodProduct + " руб. которые стоят под номером : ");

        for (int i = 0; i < 8; i++) {

            if ((i % 2) == 0 && i != 0)

                System.out.println(i + " - " + foodProduct + " руб.");
        }
        shelf1.remove(2);
        shelf1.remove(4);
        shelf1.remove(6);

        for (FoodProduct foodProduct1 : shelf1) {

            System.out.println(foodProduct1 + " руб.");
        }
        System.out.println("Осталось " + shelf1.size() + " шт.");

    }

    public void lookingForProductsOnAShelfTwo(Shelf shelfTwo, Cheese cheese) {
        System.out.println(NAME + " подходит к продуктовой полке № " + shelfTwo.getNumber() +
                " молочного отдела и начинает искать интересующие его продукты.");
        Map<Cheese, Integer> map1 = new HashMap<>();
        map1.put(cheese, cheese.getProductPrice());
        Cheese cheese1 = new Cheese("Cheese Tofu", 450, 478963, "ITA");
        Cheese cheese2 = new Cheese("Cheese Chechil", 780, 632145, "ITA");
        Cheese cheese3 = new Cheese("Ricotta", 950, 456987, "ITA");
        map1.put(cheese, cheese.getProductPrice());
        map1.put(cheese1, cheese1.getProductPrice());
        map1.put(cheese2, cheese2.getProductPrice());
        map1.put(cheese3, cheese3.getProductPrice());

    }

}














