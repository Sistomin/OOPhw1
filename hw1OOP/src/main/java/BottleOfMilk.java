public class BottleOfMilk extends Product {

    private double volume; // объем
    private int fat; // Содержание жирности

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public BottleOfMilk(String brand, String name, double price, double volume, int fat){
        super(brand, name, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    public String displayInfo() {
        return String.format("[МОЛОКО] %s - %s - %.2f - объем: %.2f; жирность: %d", brand, name, price, volume, fat);
    }
}

