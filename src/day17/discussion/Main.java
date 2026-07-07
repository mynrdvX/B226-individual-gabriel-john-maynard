
package day17.discussion;


public class Main {
    public static void main(String[] args) {
        //Syntax of Instantiation - create object / instance of class
        //ClassName objectName = new Constructor();

        Ballpen ballpen = new Ballpen();
        ballpen.brand = "HBW";
        ballpen.color = "Color";
        ballpen.pointSize = 0.5f;
        ballpen.weightInGrams = 8;

//        ballpen.draw();
//        ballpen.sketch();
//        ballpen.write();
        System.out.println("Brand: " + ballpen.brand);
        System.out.println("Color: " + ballpen.color);
        System.out.println("Point Size: " + ballpen.pointSize);
        System.out.println("Weight In Grams" + ballpen.weightInGrams);
        
        
        
        
        Ballpen ballpen2 = new Ballpen();
        ballpen2.brand ="Panda";
        ballpen2.color ="Blue";
        ballpen2.pointSize = 1f;
        ballpen2.weightInGrams = 10;
//        ballpen2.draw();
//        ballpen2.sketch();
        



        Ballpen ballpen3 = new Ballpen();
        ballpen3.brand ="Pilot";
        ballpen3.color ="Black";
        ballpen3.weightInGrams = 12;
        ballpen3.pointSize = 0.7f;
//        ballpen3.sketch();
        System.out.println("Ballpen3 Color: " + ballpen3.color);
    }
}
