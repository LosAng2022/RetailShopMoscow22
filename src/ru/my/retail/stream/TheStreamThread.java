package ru.my.retail.stream;

import ru.my.retail.product.FoodProduct;
import java.util.LinkedList;
import java.util.List;

public class TheStreamThread extends Thread {

    public TheStreamThread(String threadName) {
        super(threadName);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " started...");

       try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
            //System.out.println("Thread has been interrupted");
        }
        System.out.println(Thread.currentThread().getName() + " finished...");
    }

    public void productCountingOnShelf(List<FoodProduct> productsOnAShelf, LinkedList<FoodProduct> productsOnAShelfTwo) {
        System.out.println("Подсчёт продуктов на первой полке.");
        for (int i = 1; i < productsOnAShelf.size(); i++) {
            System.out.println(i + " : " + productsOnAShelf.get(i));
            try {
                Thread.sleep(200);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Подсчёт продуктов на второй полке.");
        for (int i = 1; i < productsOnAShelfTwo.size(); i++) {
            System.out.println(i + " : " + productsOnAShelfTwo.get(i));

            try {
                Thread.sleep(200);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


