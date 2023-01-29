package com.gildedrose;

public class ItemFactory {

    public static Item createItem(String name, int sellIn, int quality) {
        if (name.equals("Aged Brie")) {
            return new AgedBrie(name, sellIn, quality);
        } else if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new BackstagePass(name, sellIn, quality);
        } else if (name.equals("Sulfuras, Hand of Ragnaros")) {
            return new Sulfuras(name, sellIn, quality);
        } else if (name.startsWith("Conjured")) {
            return new ConjuredItem(name, sellIn, quality);
        } else {
            return new NormalItem(name, sellIn, quality);
        }
    }
}