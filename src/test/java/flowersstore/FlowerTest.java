package flowersstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {

    private Rose rose;
    private Tulip tulip;
    private Chamomile chamomile;
    @BeforeEach
    void setUp() {
        rose = new Rose();
        rose.setPrice(19);
        rose.setColor("white");
        rose.setSepalLength(6.19);

        tulip = new Tulip();
        tulip.setPrice(17);
        tulip.setColor("red");
        tulip.setSepalLength(6.39);

        chamomile = new Chamomile();
        chamomile.setPrice(21);
        chamomile.setColor("transparent");
        chamomile.setSepalLength(7.19);
    }

    @Test
    void getPrice() {
        assertEquals(19, rose.getPrice());
        assertEquals(17, tulip.getPrice());
        assertEquals(21, chamomile.getPrice());

    }

    @Test
    void getColor() {
        assertEquals("white", rose.getColor());
        assertEquals("red", tulip.getColor());
        assertEquals("transparent", chamomile.getColor());
    }

    @Test
    void getSepalLength() {
        assertEquals(6.19, rose.getSepalLength());
        assertEquals(6.39, tulip.getSepalLength());
        assertEquals(7.19, chamomile.getSepalLength());
    }
}