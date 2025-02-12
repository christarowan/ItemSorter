package rocks.zipcode.io;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */



public class ItemSorter {

    Item[] things;

    public ItemSorter(Item[] items) {
        things = items;
    }

    public Item[] sort(Comparator<Item> comparator) {

        Arrays.sort(things, comparator);

        return things;
    }
}
