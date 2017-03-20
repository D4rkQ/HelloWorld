package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

       Money m0 = new Money(12,99);
       Money m1 = new Money(12,11);
       Money m2;

        m2 = m0.add(m1);
        System.out.println(m2);
        m2 = m2.subtract(m1);
        System.out.println(m2);

    }
}
