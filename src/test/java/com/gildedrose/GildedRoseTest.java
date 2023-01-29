package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void TestAgedBrie() {
        Item agedBrie = ItemFactory.createItem("Aged Brie", 2, 0);
        assertEquals("Aged Brie", agedBrie.getName());
        assertEquals(2, agedBrie.getSellIn());
        assertEquals(0, agedBrie.getQuality());
    }
    @Test
    void TestBackstagePasses(){
        Item backstagePass = ItemFactory.createItem("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", backstagePass.getName());
        assertEquals(15, backstagePass.getSellIn());
        assertEquals(20, backstagePass.getQuality());
    }

    @Test
    void testSulfuras(){
        Item sulfuras = ItemFactory.createItem("Sulfuras, Hand of Ragnaros", 0, 80);
        assertEquals("Sulfuras, Hand of Ragnaros", sulfuras.getName());
        assertEquals(0, sulfuras.getSellIn());
        assertEquals(80, sulfuras.getQuality());
    }
    @Test
    void testConjured(){
        Item item = ItemFactory.createItem("Conjured Mana Cake", 3, 6);
        assertEquals("Conjured Mana Cake", item.name);
        assertEquals(3, item.sellIn);
        assertEquals(6, item.quality);
    }
    @Test
    void testNormal() {
        Item item = ItemFactory.createItem("+5 Dexterity Vest", 10, 20);
        assertEquals("+5 Dexterity Vest", item.name);
        assertEquals(10, item.sellIn);
        assertEquals(20, item.quality);
    }
    @Test
    void testBackstagePass() {
        Item item = ItemFactory.createItem("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", item.name);
        assertEquals(15, item.sellIn);
        assertEquals(20, item.quality);
    }
    @Test
    void testIncreaseQualityBeforeConcert(){
        Item item = ItemFactory.createItem("Backstage passes to a TAFKAL80ETC concert", 10, 49);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", item.name);
        assertEquals(10, item.sellIn);
        assertEquals(49, item.quality);
    }
    @Test
    void testBackstagePassQualityNotBelow0() {
        Item item = ItemFactory.createItem("Backstage passes to a TAFKAL80ETC concert", -1, 20);
        assertEquals(0, item.quality);
    }

}