package flowersstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    private Rose rose;
    private Chamomile chamomile;
    private Tulip tulip;
    private FlowerPack flowerPack1;
    private FlowerPack flowerPack2;
    private FlowerPack flowerPack3;
    private FlowerBucket flowerBucket;
    private Store store;
    @BeforeEach
    void setUp() {
        rose = new Rose();
        rose.setPrice(119);
        flowerPack1 = new FlowerPack(rose);

        tulip = new Tulip();
        tulip.setColor("blue");
        flowerPack2 = new FlowerPack(tulip);

        chamomile = new Chamomile();
        chamomile.setSepalLength(6.17);
        flowerPack3 = new FlowerPack(chamomile);

        flowerBucket = new FlowerBucket();
        flowerBucket.addPack(flowerPack1);
        flowerBucket.addPack(flowerPack2);
        flowerBucket.addPack(flowerPack3);

        store = new Store(flowerBucket);
    }

    @Test
    void search() {
        assertEquals(119, store.search(119).getPrice());
    }

    @Test
    void testSearch() {
        assertEquals("blue", store.search("blue").getColor());
    }

    @Test
    void testSearch1() {
        assertEquals(6.17, store.search(6.17).getSepalLength());
    }
}