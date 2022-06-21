package com.uber;

public class SurgeFeeCalculator implements FeeCalculator {

    @Override
    public double getFeeContribution(Ride ride) {
        return 1.0;
    }
}
