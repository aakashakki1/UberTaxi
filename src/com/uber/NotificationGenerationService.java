package com.uber;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


public class NotificationGenerationService {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void generateNotifications(List<Driver> driverList, Ride ride) throws IOException {
        driverList.forEach(driver -> {
            System.out.println(ride.getUserId() + "user is in "
                    + ride.getSource() + ", please pick this ride ");
        });
        String driver = br.readLine();

    }
}
