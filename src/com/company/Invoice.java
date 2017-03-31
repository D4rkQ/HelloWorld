package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sailerm on 31.03.2017.
 */
public class Invoice {

    private final List<LineItem> ListOfLineItems;

    public Invoice(List<LineItem> listOfLineItems) {
        ListOfLineItems = listOfLineItems;
    }

    public double sum() {
        double tmp=0;
        for (LineItem x:ListOfLineItems) {
            tmp += x.sum();
        }
        return tmp;
    }
}
