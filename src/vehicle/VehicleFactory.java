package vehicle;

public class VehicleFactory{
    public Vehicle getVehicle(String rNumber,String vType){

        if(vType == null){  
            throw new IllegalArgumentException("The car type cannot be null!");  
           } 
        if(rNumber == null){
            throw new IllegalArgumentException("The registration number cannot be null!");  
        }    
         if(vType.equalsIgnoreCase("CAR")) {  
                return new Car(rNumber);  
              }   
          else if(vType.equalsIgnoreCase("BUS")){  
               return new Bus(rNumber);  
           }   
         else if(vType.equalsIgnoreCase("BIKE")) {  
               return new Bike(rNumber);  
         }  
    throw new IllegalArgumentException("Invalid car type exception"); 


    }



}