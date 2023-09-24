public class BottleOfWater extends Product{

    private double volume; // объем

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public BottleOfWater(String brand, String name, double price, double volume){
        super(brand, name, price);
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[ВОДА] %s - %s - %.2f - объем: %.2f", brand, name, price, volume);
    }

}