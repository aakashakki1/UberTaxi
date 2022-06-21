package com.uber;

import java.util.HashMap;
import java.util.Map;

// make it dynamic
public class CarTypeFees {
    static Map<CarType,Double> feesByType = new HashMap<>();
    static {
        feesByType.put(CarType.Regular , 0.0);
        feesByType.put(CarType.SUV, 10.0);
        feesByType.put(CarType.SADAN,20.0);
    }

    // throw exception
    static double getFeesByType(CarType carType) {
        return feesByType.get(carType);
    }

}
