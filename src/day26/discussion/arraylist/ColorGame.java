
package day26.discussion.arraylist;

import java.util.ArrayList;
import java.util.Collections;


public class ColorGame {
    
    public static void main(String[] args) {
        ArrayList<String> dice = new ArrayList<>();
        dice.add("White");
        dice.add("Blue");
        dice.add("Red");
        dice.add("Pink");
        dice.add("Green");
        dice.add("Yellow");
        
        for (int i = 0; i < 3; i++) {
            Collections.shuffle(dice);
            System.out.println("Dice " + (i + 1) + ": " + dice.get(0));
        }
        
        
        //Traverse an ArrayList using For Loop
//        for(int i=0; 0 <dice.size(); i++){
//            System.out.println(dice.get(i));
//        }
          //Lambda Expression - For Each Loop
//          dice.forEach((color) -> System.out.println(color));
        
        
        
        
//        ArrayList<String> dice2 = new ArrayList<>();
//        dice2.add("Black");
//        dice2.addAll(dice);
        
//        System.out.println(dice2);
        
//        System.out.println(dice3);
//        int lastIndexPosition = dice.lastIndexOf("White");
//        System.out.println(lastIndexPosition);
         
         
        
//        System.out.println(dice.contains("Pink"));
        
//        Collections.sort(colors);
//        System.out.println(colors);
        
        //LIFO
//        Collections.reverse(colors);
//        System.out.println(colors);

//        Collections.shuffle(colors);
//        System.out.println(colors);
    }
}
