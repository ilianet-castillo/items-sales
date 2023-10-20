package org.learn.domain;

import org.learn.domain.discounts.Discountable;



public record Item (double price, double cost, Color color, ItemType itemType) implements Discountable {

}
