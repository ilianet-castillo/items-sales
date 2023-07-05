package org.learn.domain;

import org.learn.domain.discounts.Discountable;

public record Item (double price, double cost, Color color, String type) implements Discountable {

}
