class Candle {
    String color;
    double height;
    double price;

    Candle(String color, double height) {
        this.color = color;
        setHeight(height);
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(double height) {
        this.height = height;
        this.price = height * 2;
    }

    public double getPrice() {
        return price;
    }

    public void displayCandleInfo() {
        System.out.println("color: " + color);
        System.out.println("height: " + height);
        System.out.println("price: " + price);

    }

}

class ScentedCandle extends Candle {
    String scent;

    ScentedCandle(String color, double height) {
        super(color, height);

    }

    public void getScentedCandle(String scent) {
        this.scent = scent;

    }

    public String getScentedCandle() {
        return scent;

    }

    public void setHeight(double height) {
        this.height = height;
        this.price = height * 3;

    }

}

public class Test {
    public static void main(String[] args) {
        Candle candel = new ScentedCandle("green", 3);
        candel.displayCandleInfo();

    }
}