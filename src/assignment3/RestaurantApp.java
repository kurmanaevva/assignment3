package assignment3;

public class RestaurantApp {
    public static void main(String[] args) {
        // Creating menu items
        MenuComponent pancakeBreakfast = new MenuItem("Pancake Breakfast", "Pancakes with scrambled eggs and toast", 5.99);
        MenuComponent regularBreakfast = new MenuItem("Regular Breakfast", "Eggs, toast, and sausage", 6.99);
        MenuComponent fruitBowl = new MenuItem("Fruit Bowl", "Assorted fresh fruits", 4.99);

        MenuComponent burgerMeal = new MenuItem("Burger Meal", "Beef burger with fries", 8.99);
        MenuComponent veggieBurger = new MenuItem("Veggie Burger", "Vegetarian burger with fries", 7.99);

        MenuComponent pastaDish = new MenuItem("Pasta", "Penne pasta with marinara sauce", 9.99);
        MenuComponent pizzaDish = new MenuItem("Pizza", "Cheese pizza with a choice of toppings", 11.99);

        // Creating menus
        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Morning items");
        MenuComponent lunchMenu = new Menu("Lunch Menu", "Afternoon items");
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Evening items");

        MenuComponent mainMenu = new Menu("Main Menu", "All available items");

        // Adding items to Breakfast Menu
        breakfastMenu.add(pancakeBreakfast);
        breakfastMenu.add(regularBreakfast);
        breakfastMenu.add(fruitBowl);

        // Adding items to Lunch Menu
        lunchMenu.add(burgerMeal);
        lunchMenu.add(veggieBurger);

        // Adding items to Dinner Menu
        dinnerMenu.add(pastaDish);
        dinnerMenu.add(pizzaDish);

        // Adding sub-menus to Main Menu
        mainMenu.add(breakfastMenu);
        mainMenu.add(lunchMenu);
        mainMenu.add(dinnerMenu);

        // Print the entire menu
        mainMenu.print();
    }
}