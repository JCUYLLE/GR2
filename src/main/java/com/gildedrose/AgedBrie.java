package com.gildedrose;

class AgedBrie extends Item {
    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    /**
     * This method wil decrease SellIn, increase Quality and increase quality again if sellin <1
     */
    @Override
    public void updateQuality() {
        decreaseSellIn();
        increaseQuality();
        if (sellIn < 0) {
            increaseQuality();
        }
    }
    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}