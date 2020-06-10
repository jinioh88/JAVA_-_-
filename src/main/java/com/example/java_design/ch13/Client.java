package com.example.java_design.ch13;

import com.sun.javafx.scene.traversal.Direction;

public class Client {
    public static void main(String[] args) {

        String vendorName = args[0];
        VendorID vendorID;
        if(vendorName.equalsIgnoreCase("LG")) {
            vendorID = VendorID.LG;
        } else if(vendorName.equalsIgnoreCase("SAMSUNG")) {
            vendorID =VendorID.SAMSUNG;
        } else {
            vendorID =VendorID.HYUNDAI;
        }

        ElevatorFactory factory = ElevatorFactoryFactory.getFactory(vendorID);

        Door lgDoor = factory.createDoor();
        Motor lgMotor = factory.createMotor();
        lgMotor.setDoor(lgDoor);

        lgDoor.open();
        lgMotor.move(Direction.UP);
    }
}
