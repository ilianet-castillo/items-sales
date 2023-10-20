package org.learn.domain.discounts;

import org.learn.domain.Sale;

import java.util.Date;

public class PeriodDiscount extends Discount {
    private final Date dateInitial;
    private final Date dateFinal;

    public PeriodDiscount(double percentage, Date dateInitial, Date dateFinal) {
        super(percentage);
        this.dateInitial = dateInitial;
        this.dateFinal = dateFinal;
    }

    @Override
    public boolean isApplicable(Discountable discountable) {
       return discountable instanceof Sale sale
               && sale.getDaySales().after(dateInitial)
               && sale.getDaySales().before(dateFinal);



    }
}
