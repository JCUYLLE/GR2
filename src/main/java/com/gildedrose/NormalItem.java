package com.gildedrose;

class NormalItem extends Item {
    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decreaseSellIn();
        decreaseQuality();
        if (sellIn < 0) {
            decreaseQuality();
        }
    }
    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}