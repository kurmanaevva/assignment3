package assignment3;

public abstract class MenuComponent {
    // Common methods
    public String getName() { throw new UnsupportedOperationException(); }
    public String getDescription() { throw new UnsupportedOperationException(); }
    public double getPrice() { throw new UnsupportedOperationException(); }

    // Composite methods for menus (add/remove items)
    public void add(MenuComponent menuComponent) { throw new UnsupportedOperationException(); }
    public void remove(MenuComponent menuComponent) { throw new UnsupportedOperationException(); }
    public MenuComponent getChild(int i) { throw new UnsupportedOperationException(); }

    // Method to print the menu or item
    public void print() { throw new UnsupportedOperationException(); }
}