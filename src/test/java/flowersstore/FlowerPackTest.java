package flowersstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {

    private Rose rose;
    private Tulip tulip;
    private Chamomile chamomile;
    private FlowerPack flowerPack;
    @BeforeEach
    void setUp() {
        rose = new Rose();
        rose.setPrice(20);

        tulip = new Tulip();
        tulip.setPrice(40);

        chamomile = new Chamomile();
        chamomile.setPrice(40);

        flowerPack = new FlowerPack(rose);
        flowerPack.addFlower(tulip);
        flowerPack.addFlower(chamomile);
    }

    @Test
    void addFlower() {
        assertTrue(flowerPack.flowers.contains(rose));
        assertTrue(flowerPack.flowers.contains(tulip));
        assertTrue(flowerPack.flowers.contains(chamomile));
    }

    @Test
    void price() {
        assertEquals(100, flowerPack.price());
    }
}