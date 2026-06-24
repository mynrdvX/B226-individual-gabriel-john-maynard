
package day6.discussion;


public class TernaryOperator {
    
    public static void main(String[] args) {

        // syntax
        // (cond) ? true block : false block;
        // Positive or Negative
        int num = -1;
        
        String result = (num > 0) ? "Positive" : "Negative";
        //System.out.println(result);
        
        // Fever or Normal Temp
        
        float temp = 38.5f;
        
        String tempResult = temp >= 38.5 ? "Fever" : "Normal Temp";
        System.out.println(tempResult);
    }
}
