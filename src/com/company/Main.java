package com.company;
import vehicle.*;
import java.util.*;
import parkinglotpackage.*;

import slotpackage.*;

public class Main {

    public static void main(String[] args) throws SlotsFullException, InvalidVehicleException {
	System.out.println("Welcome to Parking lot App");


	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of slots for Car");
	int carSlots = sc.nextInt();
	ParkingLot p = ParkingLot.Builder.newInstance().setCarSlot(carSlots).build();

        VehicleFactory vf = new VehicleFactory();
        Vehicle v = vf.getVehicle("WRTER01","Car");
        Vehicle v1 = vf.getVehicle("WRTER01","Bike");


	System.out.println(p.hasSlot(v.getVehicleType()));


	p.hasSlot(v1.getVehicleType());


        System.out.println(p.getSlot(v));
	//p.getSlot(v1);

        System.out.println(p.getVehicle(v));

     //   p.getVehicle(v1);




    }
}
