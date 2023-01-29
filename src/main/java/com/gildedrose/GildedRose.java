package com.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

    private final List<Item> items;

    public GildedRose(Item[] items) {
        this.items = new ArrayList<Item>();
        this.items.add(ItemFactory.createItem("+5 Dexterity Vest", 10, 20));
        this.items.add(ItemFactory.createItem("Aged Brie", 2, 0));
        this.items.add(ItemFactory.createItem("Elixir of the Mongoose", 5, 7));
        this.items.add(ItemFactory.createItem("Sulfuras, Hand of Ragnaros", 0, 80));
        this.items.add(ItemFactory.createItem("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        this.items.add(ItemFactory.createItem("Conjured Mana Cake", 3, 6));
    }

    public void updateQuality() {
        for (Item item : items) {
            item.updateQuality();
        }
    }


}