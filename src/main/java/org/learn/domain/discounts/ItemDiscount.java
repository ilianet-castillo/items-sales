package org.learn.domain.discounts;

import org.learn.domain.Item;
import org.learn.domain.ItemType;

public class ItemDiscount extends Discount {
    private final ItemType discountedType;

    public ItemDiscount(double percentage, ItemType type) {
        super(percentage);
        discountedType = type;
    }

    @Override
    public boolean isApplicable(Discountable discountable) {
        return discountable instanceof Item item && item.itemType().equals(discountedType);
    }
}
