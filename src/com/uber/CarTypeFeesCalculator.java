package com.uber;

public class CarTypeFeesCalculator implements FeeCalculator {
    @Override
    public double getFeeContribution(Ride ride) {
        return CarTypeFees.getFeesByType(ride.getCarType());
    }
}
