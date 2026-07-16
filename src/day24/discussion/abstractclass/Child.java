
package day24.discussion.abstractclass;


public class Child extends Person{
    
    @Override
    public void role() {
        System.out.println("I am a Child. I am the one "
                + "being taken care of by my parents.");
    }
    
}
