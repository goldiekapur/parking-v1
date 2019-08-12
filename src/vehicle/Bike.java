package vehicle;

public class Bike implements Vehicle{
    String registrationNumber;
    vehicleType vType;
    public Bike(String registrationNumber){
        this.registrationNumber = registrationNumber;
        vType = vehicleType.Bike;
    }

    @Override
    public vehicleType getVehicleType(){

        return vType;

    }
    
    @Override
    public String getRegistrationNumber(){
        return registrationNumber;
        
    }
    public double getHourlyParkingCost(){
        return 20.0;

    }
}