package day17.activity;

// Class that represents a Mouse object
public class Mouse {

    // Attributes / Fields
    String color;
    int buttons;
    String connectivity;
    boolean hasRGB;

    // Methods / Behaviors
    public void move() {
        System.out.println("Mouse is moving.");
    }

    public void drag() {
        System.out.println("Mouse is dragging an item.");
    }

    public void drop() {
        System.out.println("Mouse dropped the item.");
    }
}