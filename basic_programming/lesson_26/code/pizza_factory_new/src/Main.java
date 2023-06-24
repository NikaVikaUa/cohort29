public class Main {

    /*
    Создать фабрику по производству пиццы. Фабрика должна уметь готовить следующие виды пиццы:
    Гавайи,Моцарелла,Салями. Каждый вид пиццы должен уметь: подготавливаться ( накладывать ингредиенты и т.д.)
    , печься и упаковываться. В каждом случае должно быть понятно о какой пицце идет речь.
    Класс Main не должен создавать новый обьект пиццы, а из него должен поступать "заказ" на изготовление требуемого
    вида пиццы ( создание обьекта) в класс PizzaFactory, который и должен выбрать нужную пиццу для изготовления
     */
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();

        Pizza salami = factory.createPizza("PIZZA_SALAMI");
      //  Pizza salami = new PizzaSalami();
        salami.orderPizza();

        Pizza hawaii = factory.createPizza("PIZZA_HAWAII");
        hawaii.orderPizza();
    }
}
