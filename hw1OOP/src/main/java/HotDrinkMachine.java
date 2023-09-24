import java.util.List;
//Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
// и реализовать перегруженный метод getProduct(int name, int volume, int temperature),
// выдающий продукт соответствующий имени, объёму и температуре
public class HotDrinkMachine {
    private List<Product> products;

    public HotDrinkMachine(List<Product> products) {
        this.products = products;
    }


    public HotDrink getProduct(String name, int volume, int temperature){
        for (Product product : products){
            if (product instanceof HotDrink){
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getName() == name && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature){
                    return hotDrink;
                }
            }
        }
        return null;
    }
}
