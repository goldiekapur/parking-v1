package vehicle;

public class Car implements Vehicle{
    String registrationNumber;
    vehicleType vType;
    public Car(String registrationNumber){
        this.registrationNumber = registrationNumber;
        vType = vehicleType.Car;
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
        return 40.0;
    }
}