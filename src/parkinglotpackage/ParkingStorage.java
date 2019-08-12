package parkinglotpackage;
import slotpackage.*;
import vehicle.*;
import java.util.HashMap;

import java.util.PriorityQueue;

public class ParkingStorage{
    PriorityQueue<Slot> pq1;
    PriorityQueue<Slot> pq2; 
    PriorityQueue<Slot> pq3; 
    HashMap<Vehicle,Slot> pl;



    public void allocateHashStorage(){
        pl = new HashMap<Vehicle,Slot>();
    }

    @Override
    public String toString() {
        return "Car slot has " + pq1.size() + " empty Slots. Bus slot has  " + pq2.size() + "empty Slots. Bus slot has  " +pq3.size() + "empty Slots.";
    }
    

}