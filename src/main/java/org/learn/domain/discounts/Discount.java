package org.learn.domain.discounts;


public abstract class Discount {
   protected double percentage;

    public Discount(double percentage) {
        this.percentage = percentage;
    }

    public abstract boolean isApplicable(Discountable discountable);

}
