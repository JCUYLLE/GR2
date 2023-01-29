package com.gildedrose;

public class ConjuredItem extends Item {
    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decreaseQuality();
        decreaseQuality();
        if (sellIn <= 0) {
            decreaseQuality();
            decreaseQuality();
        }
    }
    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}