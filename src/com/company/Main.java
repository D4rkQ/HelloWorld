package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

       Money m0 = new Money(15,25);
       Money m1 = new Money(12,11);
       Money m2;

        m2 = m0.add(m1);
        System.out.println(m2);
        m2 = m2.subtract(m1);
        System.out.println(m2);
        m2 = m2.mult(5);
        System.out.println(m2);

        InvoiceBuilder ib = new InvoiceBuilder();

        ib.addLineItem(new LineItem("Papier",new Money(12,10),13));
        ib.addLineItem(new LineItem("Schere",new Money(5,88),3));
        ib.clearLineItems();
        ib.addLineItem(new LineItem("Papier2",new Money(5,88),3));
        ib.addLineItem(new LineItem("Schere2",new Money(5,88),3));
        Invoice invoice1 = ib.create();

        System.out.println(invoice1.sum());



        for (LineItem x: invoice1.getLineItems()) {
            System.out.println(x);
        }

    }
}
