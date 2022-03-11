package ru.my.retail.shop.informing;

public class InformingBySms implements InformingTheCustomer {

    private InformingTheCustomer informingTheCustomer;

    public InformingBySms (InformingTheCustomer informingTheCustomer) {
        this.informingTheCustomer = informingTheCustomer;
    }
    public InformingBySms () {

    }

    @Override
    public void send(String massage) {
        if (informingTheCustomer != null) informingTheCustomer.send(massage);
        System.out.println("Сообщение Sms отправлено : " + massage);
    }
}
