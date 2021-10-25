package flowersstore;

import java.util.ArrayList;

public class FlowerPack {
    Flower flower;
    int amount = 1;
    ArrayList<Flower> flowers = new ArrayList<Flower>();

    FlowerPack(Flower flower) {
        this.flower = flower;
        this.flowers.add(flower);
    }

    void addFlower (Flower flower) {
        this.flowers.add(flower);
        ++this.amount;
    }


    int price() {
        int packPrice = 0;
        for (Flower flower : flowers) {
            packPrice += flower.getPrice();
        }
        return  packPrice;
    }
}
