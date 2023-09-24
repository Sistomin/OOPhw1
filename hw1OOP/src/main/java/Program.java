import java.util.ArrayList;
// Группа 4832 Истомин СА
public class Program {

    public static void main(String[] args) {

        Product product1 = new Product("ООО Источник", "_", -200);
        //product1.name = "Бутылка с водой (1)";
        //product1.brand = "ООО Источник";

        product1.setPrice(-10);
        product1.setName("");

        System.out.println(product1.displayInfo());

        Product product2 = new Product();
        System.out.println(product2.displayInfo());

        Product product3 = new Product("Бутылка с водой (3)", 150);
        System.out.println(product3.displayInfo());

        System.out.println("-------------------------------");
        //Инициаизировал горячие напитки
        Product HotDrink1 = new HotDrink("ООО Г.Напитки", "Кофе", 400, 70, 340);
        System.out.println(HotDrink1.displayInfo());
        Product HotDrink2 = new HotDrink("ООО Петровский и Ко", "Шокалад горячий", 200, 80, 300);
        System.out.println(HotDrink2.displayInfo());
        Product HotDrink3 = new HotDrink("ООО Чашка Кофе", "Кофе с молоком", 300, 74, 400);
        System.out.println(HotDrink3.displayInfo());
        Product HotDrink4 = new HotDrink("ООО Лучший Кофе", "Капучино", 500, 80, 400);
        System.out.println(HotDrink4.displayInfo());
        System.out.println("-------------------------------");



        Product bottleOfWater =
                new BottleOfWater("ООО Источник", "Бутылка с водой (4)", 250, 1.5);
        System.out.println(bottleOfWater.displayInfo());

        Product bottleOfMilk1 =
                new BottleOfMilk("ООО Источник", "Бутылка с молоком (1)", 310, 0.5, 15);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfMilk2 =
                new BottleOfMilk("ООО Источник", "Бутылка с молоком (2)", 330, 1.5, 15);
        System.out.println(bottleOfMilk2.displayInfo());

        Product bottleOfMilk3 =
                new BottleOfMilk("ООО Источник", "Бутылка с молоком (3)", 340, 2.5, 35);
        System.out.println(bottleOfMilk3.displayInfo());

        Product bottleOfMilk4 =
                new BottleOfMilk("ООО Источник", "Бутылка с молоком (4)", 350, 1.5, 25);
        System.out.println(bottleOfMilk4.displayInfo());

        ArrayList<Product> products = new ArrayList<>();
        products.add(bottleOfWater);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(bottleOfMilk4);
        //добавил горячие напитки в продукты
        products.add(HotDrink1);
        products.add(HotDrink2);
        products.add(HotDrink3);
        products.add(HotDrink4);

        VendingMachine vendingMachine = new VendingMachine(products);

        BottleOfMilk bottleOfMilk = vendingMachine.getBottleofMilk(1.5, 15);
        if (bottleOfMilk == null){
            System.out.println("Такой бутылки с молоком нет в автомате.");
        }
        else {
            System.out.println("Вы купили:");
            System.out.println(bottleOfMilk.displayInfo());
        }
        // Поиск горячих напитков в автомате.
        System.out.println("++++++++++++++++++++++");
        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine(products);
        HotDrink hotDrink = hotDrinkMachine.getProduct("Капучино", 400, 80);
        if (hotDrink == null){
            System.out.println("Такого горячего напитка нет в автомате.");
        }
        else {
            System.out.println("Вы купили:");
            System.out.println(hotDrink.displayInfo());
        }


    }

}
