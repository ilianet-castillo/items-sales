package org.learn.domain;

import org.learn.domain.discounts.Discountable;

import java.util.Date;
import java.util.List;

public class Sale implements Discountable {
    private final List<Item> soldProduct;
    private final Date daySales;

    public Sale(List<Item> soldProduct, Date daySales){
        this.soldProduct=soldProduct;
        this.daySales=daySales;
    }
    public Date getDaySales(){
        return daySales;
    }

    public double totalPrice(){
        double sum=0;

        for(int i=0; i<soldProduct.size(); i++){
            sum+=soldProduct.get(i).price();
        }
        return sum;
    }

}
