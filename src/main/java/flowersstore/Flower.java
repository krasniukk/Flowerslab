package flowersstore;

public abstract class Flower {
    double sepalLength;
    String color;
    int price;


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSepalLength() {
        return sepalLength;
    }

    public void setSepalLength(double sepalLength) {
        this.sepalLength = sepalLength;
    }

    @Override
    public String toString() {
        return String.format(getClass().getSimpleName() + "-- color: " + this.color + ", price: " +
                Integer.toString(this.price) + ", sepalLength: " + Double.toString(this.sepalLength));
    }
}

class Chamomile extends Flower {
}

class Rose extends Flower{
}

class Tulip extends Flower{
}
