package com.uber;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeeCalculatorListUtils {

    static Map<FeeStartegy,List<FeeCalculator>> feeCalculatorListMap = new HashMap<>();
    static {
        feeCalculatorListMap.put(FeeStartegy.INDIA,
                Arrays.asList(new SurgeFeeCalculator(),new CarTypeFeesCalculator(),new DistanceFeeCalculator()));
    }
    public static List<FeeCalculator> getFeeCalculator(FeeStartegy feeStartegy) {
        return feeCalculatorListMap.get(feeStartegy);
    }
}
