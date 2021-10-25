package flowersstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {

    private Rose rose;
    private Chamomile chamomile;
    private Tulip tulip;
    private FlowerPack flowerPack1;
    private FlowerPack flowerPack2;
    private FlowerPack flowerPack3;
    private FlowerBucket flowerBucket;
    @BeforeEach
    void setUp() {
        rose = new Rose();
        rose.setPrice(119);
        flowerPack1 = new FlowerPack(rose);

        tulip = new Tulip();
        tulip.setColor("blue");
        tulip.setPrice(81);
        flowerPack2 = new FlowerPack(tulip);

        chamomile = new Chamomile();
        chamomile.setSepalLength(6.17);
        chamomile.setPrice(100);
        flowerPack3 = new FlowerPack(chamomile);

        flowerBucket = new FlowerBucket();
        flowerBucket.addPack(flowerPack1);
        flowerBucket.addPack(flowerPack2);
        flowerBucket.addPack(flowerPack3);
    }

    @Test
    void addPack() {
        assertTrue(flowerPack1.flowers.contains(rose));
        assertTrue(flowerPack2.flowers.contains(tulip));
        assertTrue(flowerPack3.flowers.contains(chamomile));
    }

    @Test
    void price() {
        assertEquals(300, flowerBucket.price());
    }
}