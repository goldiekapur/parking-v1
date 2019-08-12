package parkinglotpackage;
import com.sun.jdi.request.InvalidRequestStateException;
import slotpackage.*;
import vehicle.*;


import java.util.*;
public class ParkingLot{

    private final ParkingStorage storage;
    //ParkingStorage storage1;


    public static class Builder{
        private ParkingStorage storage;

        public Builder(){
            storage = new ParkingStorage();
        }

        public static Builder newInstance()
        {

            return new Builder();
        }

        public  Builder setCarSlot(int c) {

            storage.pq1 = new PriorityQueue<Slot>();
            for(int i =1;i<=c;i++){
                storage.pq1.add(new Slot(i));
            }
            return this;
        }
        public Builder setBusSlot(int c) {

            storage.pq2 = new PriorityQueue<Slot>();
            for(int i =1;i<=c;i++){
                storage.pq2.add(new Slot(i));
            }
            return this;
        }
        public Builder setBikeSlot(int c) {

            storage.pq3 = new PriorityQueue<Slot>();
            for(int i =1;i<=c;i++){
                storage.pq3.add(new Slot(i));
            }
            return this;
        }
        public ParkingLot build(){
            return new ParkingLot(this);
        }


    }

    private ParkingLot(Builder builder){
        this.storage = builder.storage;

    }








    public boolean hasSlot(vehicleType t) {

        if (t == null) {

            throw new IllegalArgumentException("The car type cannot be null!");

        }
        if (t == vehicleType.Car) {
            if(storage.pq1==null){
                return false;
            }
            if (storage.pq1.peek() == null) {
                return false;
            } else {
                return true;
            }
        } else if (t == vehicleType.Bus) {
            if(storage.pq2==null){
                return false;
            }

            if (storage.pq2.peek() == null) {
                return false;
            } else {
                return true;
            }
        } else if (t == vehicleType.Bike) {
            if(storage.pq3==null){
                return false;
            }
            if (storage.pq3.peek() == null) {
                return false;
            } else {
                return true;
            }
        }
        else{
            throw new IllegalArgumentException("Invalid car type exception");
        }
    }



    public Slot getSlot(Vehicle v) throws SlotsFullException {
        if(v.getVehicleType() == null){
            throw new IllegalArgumentException("The car type cannot be null!");
        }
        if(v.getRegistrationNumber() == null){
            throw new IllegalArgumentException("The registration number cannot be null!");
        }

        if (v.getVehicleType() == vehicleType.Car) {
            if(storage.pq1==null){
                throw new SlotsFullException(" There are no Car slots in Parking Lot");
            }
            if (storage.pq1.peek() == null) {
                throw new SlotsFullException(" Car Slot Full ");
            }
            Slot slot = storage.pq1.poll();
            if (storage.pl==null){
                storage.allocateHashStorage();
            }
            storage.pl.put(v, slot);
            return slot;
        }
        else if (v.getVehicleType() == vehicleType.Bus) {
            if(storage.pq2==null){
                throw new SlotsFullException(" There are no Bus slots in Parking Lot");
            }
            if (storage.pq2.peek() == null) {
                throw new SlotsFullException(" Bus Slot Full ");
            }
            Slot slot = storage.pq2.poll();
            if (storage.pl==null){
                storage.allocateHashStorage();
            }
            storage.pl.put(v, slot);
            return slot;
        }
        else if (v.getVehicleType() == vehicleType.Bike) {
            if(storage.pq3==null){
                throw new SlotsFullException(" There are no Bike slots in Parking Lot");
            }
            if (storage.pq3.peek() == null) {
                throw new SlotsFullException(" Bike Slot Full ");
            }
            Slot slot = storage.pq3.poll();
            if (storage.pl==null){
                storage.allocateHashStorage();
            }
            storage.pl.put(v, slot);
            return slot;
        }
        else{
            throw new IllegalArgumentException("Invalid Vehicle type exception");
        }
    }



    public Slot getVehicle(Vehicle v) throws InvalidVehicleException {
        if(storage.pl.get(v)==null){
            throw new InvalidVehicleException(" Vehicle not found in Parking lot to be freed");
        }
        else{
            Slot s = storage.pl.get(v);
            vehicleType t = v.getVehicleType();

            switch(t){
                case Car:
                    storage.pq1.add(s);
                    return s;

                case Bus:
                    storage.pq2.add(s);
                    return s;

                case Bike:
                    storage.pq3.add(s);
                    return s;

                default:
                    throw new InvalidRequestStateException("Request cannot be processed");

            }


        }

    }






   

    public boolean isYourVehicleParked(Vehicle v){ //
        if(storage.pl.get(v)!=null){
            return true;
        }
        else{
            return false;
        }
    }
    public Slot knowParkedVehicleSpot(Vehicle v) { //
        Slot s = storage.pl.get(v);
        if (s == null) {
            throw new IllegalArgumentException("Vehicle not found Exception");
        }
        return s;

    }


}