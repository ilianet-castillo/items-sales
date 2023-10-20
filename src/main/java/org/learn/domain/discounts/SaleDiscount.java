package org.learn.domain.discounts;

import org.learn.domain.Sale;

public class SaleDiscount extends Discount {
    private final double minSaleValue;

    public SaleDiscount(double percentage, double minSaleValue) {
        super(percentage);
        this.minSaleValue = minSaleValue;
    }

    public void never() {
    }

    @Override
    public boolean isApplicable(Discountable discountable) {
        return discountable instanceof Sale sale && sale.totalPrice()>=minSaleValue;
    }
}
