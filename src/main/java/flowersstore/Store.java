package flowersstore;

public class Store {
    FlowerFilter flowerFilter = new FlowerFilter();
    FlowerBucket flowerBucket;

    Store(FlowerBucket flowerBucket) {
        this.flowerBucket = flowerBucket;
    }

    Flower search(String color) {
        return flowerFilter.ByColor(flowerBucket, color);
    }

    Flower search(double sepalLength) {
        return flowerFilter.BySepal(flowerBucket, sepalLength);
    }

    Flower search(int flowerPrice) {
        return flowerFilter.ByPrice(flowerBucket, flowerPrice);
    }
}

class FlowerFilter {
    public Flower ByColor(FlowerBucket flowerBucket, String flowerColor) {
        for (FlowerPack pack : flowerBucket.packs) {
            for (Flower flower : pack.flowers) {
                if (flower.getColor() == flowerColor) {return flower;}

            }
        }
        return null;
    }

    public Flower ByPrice(FlowerBucket flowerBucket, int flowerPrice) {
        for (FlowerPack pack : flowerBucket.packs) {
            for (Flower flower : pack.flowers) {
                if (flower.getPrice() == flowerPrice) {return flower;}

            }
        }
        return null;
    }

    public Flower BySepal(FlowerBucket flowerBucket, double flowerSepal) {
        for (FlowerPack pack : flowerBucket.packs) {
            for (Flower flower : pack.flowers) {
                if (flower.getSepalLength() == flowerSepal) {return flower;}

            }
        }
        return null;
    }

}

