//Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
public class HotDrink extends Product{
    private int temperature; // температура
    private int volume; //объем напитка

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public HotDrink(String brand, String name, double price, int temperature, int volume){
        super(brand, name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[Горячий напиток] %s - %s - %.2f - Температура напитка: %d (градусов) - Объем: %d мл", 
                brand, name, price, temperature, volume);
    }
}
