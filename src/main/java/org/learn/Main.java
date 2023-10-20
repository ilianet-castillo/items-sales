package org.learn;

import org.learn.domain.Color;
import org.learn.domain.Item;
import org.learn.domain.ItemType;
import org.learn.domain.Sale;
import org.learn.domain.discounts.Discount;
import org.learn.domain.discounts.ItemDiscount;
import org.learn.domain.discounts.PeriodDiscount;
import org.learn.domain.discounts.SaleDiscount;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Discount> discounts = List.of(
                new ItemDiscount(15.5,ItemType.pant),
                new SaleDiscount(25.5,50.0),
                new PeriodDiscount(30.5,new Date(),new Date()));
        Item pant=new Item(30.0,20.0,Color.black,ItemType.pant);
        for (Discount d: discounts) {

            System.out.println(d.isApplicable(pant));
        }
    }
}