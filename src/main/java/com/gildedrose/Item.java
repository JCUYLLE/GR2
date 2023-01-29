package com.gildedrose;

public abstract class Item {
    protected String name;
    protected int sellIn;
    protected int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public abstract void updateQuality();

    public void decreaseSellIn() {
        sellIn -= 1;
    }

    public void decreaseQuality() {
        if (quality > 0) {
            quality -= 1;
        }
    }

    public void increaseQuality() {
        if (quality < 50) {
            quality += 1;
        }
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }


}