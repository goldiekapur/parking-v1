package vehicle;

public class Bus implements Vehicle{
    String registrationNumber;
    vehicleType vType;
    public Bus(String registrationNumber){
        this.registrationNumber = registrationNumber;
        vType = vehicleType.Bus;
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
        return 100.0;

    }
}