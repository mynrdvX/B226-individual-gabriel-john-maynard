package day17.activity;

public class Main {

    public static void main(String[] args) {

        // First Mouse Object
        Mouse mouse1 = new Mouse();
        mouse1.color = "Black";
        mouse1.buttons = 6;
        mouse1.connectivity = "Wireless";
        mouse1.hasRGB = true;

        mouse1.move();
        mouse1.drag();
        mouse1.drop();

        System.out.println("=== Mouse 1 ===");
        System.out.println("Color: " + mouse1.color);
        System.out.println("Buttons: " + mouse1.buttons);
        System.out.println("Connectivity: " + mouse1.connectivity);
        System.out.println("Has RGB: " + mouse1.hasRGB);
        System.out.println();

        // Second Mouse Object
        Mouse mouse2 = new Mouse();
        mouse2.color = "White";
        mouse2.buttons = 3;
        mouse2.connectivity = "Wired";
        mouse2.hasRGB = false;

        mouse2.move();
        mouse2.drag();
        mouse2.drop();
        
        System.out.println("=== Mouse 2 ===");
        System.out.println("Color: " + mouse2.color);
        System.out.println("Buttons: " + mouse2.buttons);
        System.out.println("Connectivity: " + mouse2.connectivity);
        System.out.println("Has RGB: " + mouse2.hasRGB);
        System.out.println();
        

        // Third Mouse Object
        Mouse mouse3 = new Mouse();
        mouse3.color = "Gray";
        mouse3.buttons = 7;
        mouse3.connectivity = "Bluetooth";
        mouse3.hasRGB = true;

        mouse3.move();
        mouse3.drag();
        mouse3.drop();

        System.out.println("=== Mouse 3 ===");
        System.out.println("Color: " + mouse3.color);
        System.out.println("Buttons: " + mouse3.buttons);
        System.out.println("Connectivity: " + mouse3.connectivity);
        System.out.println("Has RGB: " + mouse3.hasRGB);
    }
}