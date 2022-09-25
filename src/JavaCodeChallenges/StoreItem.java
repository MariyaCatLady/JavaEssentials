package JavaCodeChallenges;

import java.text.DecimalFormat;
import java.util.List;

public class StoreItem {
    //data fields
    final private String name;
    final private double price;
    final private double discount;

    public StoreItem(String itemName, double itemPrice, double itemDiscount) {
        name = itemName;
        price = itemPrice;
        discount = itemDiscount;
    }

    private double calculateDiscountPrice() {
        return price - (price * discount);
    }

    public static StoreItem findLeastExpensiveItem(List<StoreItem> items) {
        if (items.isEmpty()) {
            return null;
        }

        StoreItem minItem = items.get(0);
        for (int i = 1; i < items.size(); i++) {
            StoreItem item = items.get(i);
            if (item.calculateDiscountPrice() < minItem.calculateDiscountPrice()) {
                minItem = item;
            }
        }

        return minItem;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("##.00");
        DecimalFormat df2 = new DecimalFormat("##.0");

        return "Name: " + name + ", discount: " + df2.format((discount * 100)) + "% , discounted cost: $" + df.format(calculateDiscountPrice());
    }
}

