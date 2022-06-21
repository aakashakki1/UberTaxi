package com.uber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriversByRegion {
    public List<Driver> getDriversInRegion(Ride ride) {

        return Arrays.asList(new Driver("123","email123","mobileNo123","car123"),
                new Driver("456","email456","mobileNo456","car456"));

    }
}
