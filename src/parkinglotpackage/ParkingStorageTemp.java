package parkinglotpackage;
import slotpackage.*;
import vehicle.*;
import java.util.HashMap;
import java.util.PriorityQueue;


public class ParkingStorageTemp {
    PriorityQueue<Slot> pq1;
    PriorityQueue<Slot> pq2;
    PriorityQueue<Slot> pq3;
    HashMap<Vehicle,Slot> pl;

    public ParkingStorageTemp setPq1(int c) {
        this.pq1 = new PriorityQueue<Slot>();
        for(int i =1;i<=c;i++){
            Slot s = new Slot(i);
            this.pq1.add(s);
        }
        return this;
    }

    public ParkingStorageTemp setPq2(int c) {
        this.pq2 = new PriorityQueue<Slot>();
        for(int i =1;i<=c;i++){
            this.pq2.add(new Slot(i));
        }
        return this;
    }

    public ParkingStorageTemp setPq3(int c) {
        this.pq3 = new PriorityQueue<Slot>();
        for(int i =1;i<=c;i++){
            this.pq3.add(new Slot(i));
        }
        return this;
    }

    public ParkingStorageTemp setPl() {
        this.pl = new HashMap<Vehicle,Slot>();
        return this;
    }
}
