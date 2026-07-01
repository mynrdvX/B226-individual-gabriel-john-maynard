
package day12.discussion;


public class MultidimensionalArray {
    
    public static void main(String[] args) {
        // syntax on how to declare a multi-dimensional array
        
        String[][] colors = { 
            // 0         1         2
            {"white", "yellow", "pink"}, // 0
            {"black", "brown", "gray"},  // 1
            {"green"} // 2
        };
        
        // coordinates        [row][column]
        //System.out.println(colors[1][1]);
        
        //System.out.println(colors[2].length);
        
        // Traverse a multi-dimensional array using nested for-loop
        
        //              1 < 3
//        for (int i = 0; i < colors.length; i++) { // outer loop
//            //              0 <  3
//            for (int j = 0; j < colors[i].length; j++) { // innner loop
//                //                        1  0
//                System.out.println(colors[i][j]);
//            }
//            System.out.println(""); // new line 
//        }
        
        // Printing a multi-dimensional array using nested for-each loop
        for (String[] row : colors) {
            for (String column : row) {
                System.out.println(column);
            }
            System.out.println("");
        }
        
    }
}


//String[][] planets = new String[rows][columns];