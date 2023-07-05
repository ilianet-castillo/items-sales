package org.learn.domain;

import org.learn.domain.discounts.Discountable;

import java.util.Date;
import java.util.List;

public class Sale implements Discountable {
    private List<Item> soldProduct;
    private Date daySales;

}
