package flowersstore;

import flowersstore.FlowerPack;

import java.util.ArrayList;

public class FlowerBucket {
    ArrayList<FlowerPack> packs = new ArrayList<FlowerPack>();

    void addPack (FlowerPack pack) {
        this.packs.add(pack);
    }

    int price() {
        int totalPrice = 0;
        for (FlowerPack pack : this.packs) {
            totalPrice += + pack.price();
        }
        return totalPrice;
    }
}
