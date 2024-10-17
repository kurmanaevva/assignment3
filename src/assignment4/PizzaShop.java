package assignment4;

public class PizzaShop {
    public static void main(String[] args) {
        // Create a basic pizza (Margherita)
        Pizza pizza = new MargheritaPizza();
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        // Add cheese and mushroom toppings
        pizza = new CheeseTopping(pizza);
        pizza = new MushroomTopping(pizza);
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        // Create another pizza (Vegetarian) with pepperoni and cheese
        Pizza pizza2 = new VegetarianPizza();
        pizza2 = new CheeseTopping(pizza2);
        pizza2 = new PepperoniTopping(pizza2);
        System.out.println(pizza2.getDescription() + " Cost: $" + pizza2.getCost());
    }
}