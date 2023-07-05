package org.learn.domain.discounts;


public abstract class Discount {
    private double percentage;

    public boolean isApplicable(Discountable discountable){
        return false;

    }

}
