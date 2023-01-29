package com.gildedrose;

class BackstagePass extends Item {
    public BackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    /**
     * Backstage passes increase in quality with different values
     * the shorter to the concert date, the bigger the increase value
     * less than 50 +1
     * if less than 10 +2
     * if less than 6 +3
     */
    @Override
    public void updateQuality() {
        decreaseSellIn();
        increaseQuality();
        if (sellIn <0){
            quality = 0;
        } else {
            if (sellIn < 10) {
                increaseQuality();
            }
            if (sellIn < 5) {
                increaseQuality();
            }
        }
    }
    public void increaseQuality(){
        if(quality < 50) {
            quality++;
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}