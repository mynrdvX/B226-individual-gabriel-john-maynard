package day21.discussion;

public class Main {

    public static void main(String[] args) {

        Ballpen ballpen = new Ballpen("Panda", "Black", 25, 0.5);

        ballpen.setId(4);
        ballpen.setBrand("Pilot");
        ballpen.setColor("Black");
        ballpen.setPrice(10.0);
        ballpen.setPointSize(0.5);

//        System.out.println("ID: " + ballpen.getId());
//        System.out.println("Brand: " + ballpen.getBrand());
//        System.out.println("Color: " + ballpen.getColor());
//        System.out.println("Price: " + ballpen.getPrice());
//        System.out.println("Point Size: " + ballpen.getPointSize());
    }
}