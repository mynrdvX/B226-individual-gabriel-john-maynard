
package day24.discussion.interfacee;


public class Father implements Person{
    
    public void role() {
        System.out.println("I am a father. I provide "
                + "support and protect my family.");
    }

    @Override
    public void walk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void jump() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
