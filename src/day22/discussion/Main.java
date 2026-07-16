
package day22.discussion;


public class Main {
    
    public static void main(String[] args) {
        
        Admin admin = new Admin("Winter", "winter@gmail.com", "winter123", "Admin", "IT");
        System.out.println(admin.getRoleInfo());
        
        StandardUser user = new StandardUser("Summer", "summer@gmail.com", "summer123", "Standard User");
        System.out.println(user.getRoleInfo());
        
        System.out.println("Company name: " + user.getCompanyName());
        
        
        SuperAdmin superAdmin = new SuperAdmin("Fall", "fall@gmail.com", "fall", "Standard User");
        superAdmin.getRoleInfo();
    }
}
