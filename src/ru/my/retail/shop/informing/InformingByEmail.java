package ru.my.retail.shop.informing;

public class InformingByEmail implements InformingTheCustomer {

    private InformingTheCustomer informingTheCustomer;

    public InformingByEmail (InformingTheCustomer informingTheCustomer) {
        this.informingTheCustomer = informingTheCustomer;
    }

    public InformingByEmail () {

    }

    @Override
    public void send(String massage) {
        if (informingTheCustomer != null) informingTheCustomer.send(massage);
        System.out.println("Сообщение Email отправлено : " + massage);
    }
}
