
package mainc;


public class Mainc {

   public static void main(String[] args) {
            
       
        Car car = new Car();
        
        car.setCompany_name("Chevrolet");
        car.setModel_name("Onix");
        car.setYear(2021);

        String company_name = car.getCompany_name();
        String model_name = car.getModel_name();
        int year = car.getYear();
        double mileage = car.getMileage();
   
        
        
        System.out.println("Company name: "+ company_name);
        System.out.println("Model name: "+ model_name);
        System.out.println("Year: "+ year);
        System.out.println("Milage: "+ mileage);
   
   }
   
    
}
