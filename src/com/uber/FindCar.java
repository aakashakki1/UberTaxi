package com.uber;

import java.io.IOException;
import java.util.List;

public class FindRide {

    private DriversByRegion driversByRegion;
    private NotificationGenerationService notificationGenerationService;
    private FeeCalculatorService feeCalculatorService;
    public FindRide(DriversByRegion driversByRegion,
                    NotificationGenerationService notificationGenerationService) {
        this.driversByRegion = driversByRegion;
    }

    public void findRide(Ride ride) {
        List<Driver> drivers = driversByRegion.getDriversInRegion(ride);
        if (drivers.size() > 0) {
            System.out.println(" do you want" + feeCalculatorService.getTotalFees(ride));
        }
        try {
            notificationGenerationService.generateNotifications(drivers,ride);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
