package com.uber;

public class Driver {
    // create a parent person
    private String driverId;
    private String emailId;
    private String mobileNo;
    private String name;
    private String carId;

    public Driver(String driverId, String emailId, String mobileNo, String carId) {
        this.driverId = driverId;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
        this.carId = carId;
    }
}
