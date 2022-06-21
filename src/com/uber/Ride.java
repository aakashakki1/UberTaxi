package com.uber;

public class Ride {
    private String driverId;
    private String userId;
    private String source;
    private String dest;
    private CarType carType;
    private FeeStartegy feeStartegy;

    public Ride( String userId, String source, String dest,
                CarType carType, FeeStartegy feeStartegy) {
        this.userId = userId;
        this.source = source;
        this.dest = dest;
        this.carType = carType;
        this.feeStartegy = feeStartegy;
    }

    public String getDriverId() {
        return driverId;
    }

    public String getUserId() {
        return userId;
    }

    public String getSource() {
        return source;
    }

    public String getDest() {
        return dest;
    }

    public CarType getCarType() {
        return carType;
    }

    public FeeStartegy getFeeStartegy() {
        return feeStartegy;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }
}
