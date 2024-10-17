package assignment6;

public class Character {
    private final char value;
    private final String font;
    private final int size;

    public Character(char value, String font, int size) {
        this.value = value;
        this.font = font;
        this.size = size;
    }

    public void render(int x, int y) {
        // Extrinsic state: position (x, y)
        System.out.println("Rendering character '" + value + "' at (" + x + ", " + y + ") with font: " + font + " and size: " + size);
    }
}