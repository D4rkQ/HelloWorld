package com.company;

/**
 * Created by Max on 19.03.2017.
 */
public class Money {

    private final long euro;
    private final int cent;


    public Money(long euro, int cent) throws Exception {
        if (String.valueOf(cent).length()>2)
            throw new Exception();

        this.euro = euro;
        this.cent = cent;
    }

    public Money add(Money a) throws Exception {
        int centsum=0;
        long eurosum=0;
        centsum = a.getCent()+this.getCent();
        eurosum = a.getEuro()+this.getEuro();

        if (centsum > 99) {
            eurosum++;
            centsum -= 100;
        }
        return new Money(eurosum, centsum);
    }

    public Money subtract(Money a) throws Exception {
        int centsum=0;
        long eurosum=0;
        centsum = this.getCent()-a.getCent();
        eurosum = this.getEuro()-a.getEuro();

        if (centsum < 0) {
            eurosum--;
            centsum += 100;
        }
        return new Money(eurosum, centsum);
    }


    public double getValue() {
        return (cent/100.0)+euro;
    }

    public long getEuro() {
        return euro;
    }

    public int getCent() {
        return cent;
    }

    @Override
    public String toString() {
        return euro + "," + cent;


    }
}
