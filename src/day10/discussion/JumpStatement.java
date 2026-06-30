/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10.discussion;


public class JumpStatement {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            
            if (i == 3 || i == 5 || i == 7) {
                continue; 
            }
            
            System.out.println(i);
            
        }
    } // skip: 3 , 5 , 7
}
