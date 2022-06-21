package com.uber;

public class DistanceFeeCalculator implements FeeCalculator {

    @Override
    public double getFeeContribution(Ride ride) {
        return Double.parseDouble(ride.getSource()) - Double.parseDouble(ride.getDest());
    }
}
