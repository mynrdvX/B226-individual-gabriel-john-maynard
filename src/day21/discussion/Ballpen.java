package day21.discussion;

// Model
public class Ballpen {

    // this ->refers to the crrent class object
    //data hiding -> making all the data members private
    //data valitation -> data use setter and getter methods
    
    //private fields / members
    private int id;
    private String brand;
    private String color;
    private double price;
    private double pointSize;
    
    
    //default constructor
    
    
    //parameterized constructor / setter constructor
    public Ballpen(String brand, String color, double price, double pointSize){
       this.brand = brand;
       this.color = color;
       this.price = price;
       this.pointSize = pointSize;
    }
    
    

    // Setter methods (Mutators)
    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPointSize(double pointSize) {
        this.pointSize = pointSize;
    }

    // Getter methods (Accessors)
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public double getPointSize() {
        return pointSize;
    }
}