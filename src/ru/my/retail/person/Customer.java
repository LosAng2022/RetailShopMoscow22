package ru.my.retail.person;

import ru.my.retail.product.Cheese;
import ru.my.retail.product.FoodProduct;
import ru.my.retail.product.Kefir;
import ru.my.retail.shop.Shelf;
import ru.my.retail.shop.Shop;
import ru.my.retail.stream.Resource;
import ru.my.retail.stream.ThreadResource;

import java.util.*;

import static ru.my.retail.product.DairyProduct.dairyProducts;

public class Customer extends Person implements EntryInTheDiary {

    public static final String NAME = "John";
    private int customerMoney;
    boolean theCustomerNeedsProducts;
    private Kefir kefir;
    private int regenArrayIndex;
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
    public void toDoList() {
        System.out.println("У нашего покупателя по имени " + NAME + " в ежедневнике есть заметка со списком продуктов, " +
                "которые нужно купить.");

        FoodProduct[] shoppingList;                     // = new FoodProduct[dairyProducts(kefir, cheese).length];
        shoppingList = dairyProducts();

        for (int i = 0; i < 9; i++) {
            System.out.println("У " + NAME + " в списке покупок находится : " + shoppingList[i]);

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
        toDoList();

    }

    public void lookingForProductsOnAShelfOne(Shelf shelfOne, Shop shop) {
        enterTheShop(shop);
        System.out.println(NAME + " подходит к продуктовой полке № " + shelfOne.getNumber() +
                " молочного отдела и начинает искать интересующие его продукты.");
        System.out.println("На продуктовой полке " + shelfOne.getNumber() + " находятся следующие продукты :");
        List<FoodProduct> shelf1 = new LinkedList<>(List.of(dairyProducts()));

        for (FoodProduct foodProduct1 : shelf1) {
            System.out.println(foodProduct1);
        }
        System.out.println("Всего " + shelf1.size() + " шт.");
        System.out.println(NAME + " взял с полки " + shelf1.get(2) + ".");
        System.out.println(NAME + " взял с полки " + shelf1.get(4) + ".");
        System.out.println(NAME + " взял с полки " + shelf1.get(6) + "." + "\n");

        shelf1.remove(2);
        shelf1.remove(4);
        shelf1.remove(6);
        System.out.println("Осталось продуктов на полке: ");

        for (FoodProduct foodProduct1 : shelf1) {

            System.out.println(foodProduct1 + " руб.");
        }
        System.out.println(shelf1.size() + " шт.");

    }

    public static Map<String, FoodProduct> lookingForProductsOnAShelfTwo(Shelf shelfTwo) {
        System.out.println(NAME + " подходит к продуктовой полке № " + shelfTwo.getNumber() +
                " молочного отдела и начинает искать интересующие его продукты.");
        Map<String, FoodProduct> shelf2 = new HashMap<>();
        shelf2.put("1 ", new Kefir("Kefir Rustic", 150, 123456, "MKK"));
        shelf2.put("2 ", new Cheese("Parmezan", 650, 147258, "ITA"));
        shelf2.put("3 ", new Cheese("Cheese Tofu", 450, 478963, "ITA"));
        shelf2.put("4 ", new Kefir("Kefir Urban", 120, 112456, "RU"));
        shelf2.put("5 ", new Cheese("Cheese Chechil", 780, 632145, "ITA"));
        shelf2.put("6 ", new Kefir("Kefir Ladybug", 200, 332654, "RU"));
        shelf2.put("7 ", new Cheese("Ricotta", 950, 456987, "ITA"));
        System.out.println("На полке стоят продукты :");
        for (Map.Entry<String, FoodProduct> entry : shelf2.entrySet()) {
            String key = entry.getKey();
            String value = String.valueOf(entry.getValue());
            System.out.print(key + ": ");
            System.out.println(value);
        }
        List<FoodProduct> list = new ArrayList<>(shelf2.values());
        String ita = "ITA";
        System.out.println(" ");
        System.out.println(NAME + " находит интересующие его продукты:");
        for (FoodProduct foodProduct : list) {
            if (foodProduct.getManufacturer().equals(ita))
                System.out.println("Продукт сыр найден: ".toUpperCase() + foodProduct.getProductName());
            else
                System.out.println("Другой продукт!");
        }
        System.out.println(NAME + " берёт интересующие его продукты :");
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(4));
        System.out.println(list.get(5));

        return shelf2;

    }

    public void customerCountsProducts() {
        System.out.println(NAME + " решил посмотреть на все продукты на и пересчитать их, но это сделал и другой покупатель");
        Resource resource = new Resource();
        for (int i = 1; i < 3; i++) {
            Thread thread = new Thread(new ThreadResource(resource));
            thread.start();

        }
    }

    public static void customerActions(Shop shop, Kefir kefir, Cheese cheese, Shelf shelfOne, Shelf shelfTwo) {
        Customer customer = new Customer();
        customer.checkCustomer(shop, kefir, kefir, cheese);
        customer.lookingForProductsOnAShelfOne(shelfOne, shop);
        Customer.lookingForProductsOnAShelfTwo(shelfTwo);
        customer.customerCountsProducts();
    }
}














