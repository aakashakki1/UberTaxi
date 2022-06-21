package com.uber;

import java.util.List;

public class FeeCalculatorService {
    // it can be removed from constructor

    public double getTotalFees(Ride ride) {
        double fees = 0.0;
        for (FeeCalculator feeCalculator:FeeCalculatorListUtils.getFeeCalculator(ride.getFeeStartegy())) {
            fees += feeCalculator.getFeeContribution(ride);
        }
        return fees;
    }

}
