package JavaCodeChallenges;

import java.util.List;

public class StoreItemMain {
    public static void main(String[] args) {

        List<StoreItem> items = List.of(new StoreItem("soap", 5.00, 0.5),
                new StoreItem("candles", 9.00, 0.9),
                new StoreItem("juice", 9.00, 0.4),
                new StoreItem("cereal", 9.00, 0.6));

        System.out.println(StoreItem.findLeastExpensiveItem(items));


    }


}
