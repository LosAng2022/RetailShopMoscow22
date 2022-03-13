package ru.my.retail.stream;

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


    public void runThread() {
        Thread t = Thread.currentThread();// получаем главный поток
        System.out.println("получаем главный поток - " + t.getName());// main
        t.setName("potok");
        System.out.println(t.getName());
        System.out.println("приоритет потока - " + t.getPriority()); //(5 по умолчанию)
        t.setPriority(1);
        System.out.println("приоритет потока - " + t.getPriority());
        t.setPriority(5);
        System.out.println("живой ли поток ? - " + t.isAlive());
        System.out.println("возвращает true если поток был прерван - " + t.isInterrupted());
        // t.join(); // ожидает завершения потока
        // t.run(); определяет точку входа в поток
        // sleep(); приостанавливает поток на заданное количество миллисекунд
        // start(); запускает поток,вызывая его метод run()
        System.out.println(t);
        System.out.println(Thread.currentThread().getName());

    }
}

    /*


        /* System.out.println("Поток метода main запустился");
        new JThread("Мой первый поток").start();
        new JThread("Мой второй поток").start();
        System.out.println("Поток метода main остановился"); */

//for (int i = 0; i < 10; i++) {
 //       new TheStreamThread("Поток с номером " + i).start();

