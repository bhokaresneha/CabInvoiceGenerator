package com.bridgelabz;

public class RideType {
    static final double MINIMUN_COST_PER_KM = 10.0;
    static final int COST_PER_TIME = 1;
    static final double MINIMUN_FARE = 5;

    static final double MINIMUN_COST_PER_KM_PRE = 15.0;
    static final int COST_PER_TIME_PER = 2;
    static final double MINIMUN_FARE_PER = 20;

    public static double CalculateFareNormal(double distance, int time) {
        double totalFare = distance * MINIMUN_COST_PER_KM + time * COST_PER_TIME;
        return Math.max(totalFare, MINIMUN_FARE);
    }

    public static double CalculateFarePER(double distance, int time) {
        double totalFare = distance * MINIMUN_COST_PER_KM_PRE + time * COST_PER_TIME_PER;
        return Math.max(totalFare, MINIMUN_FARE_PER);
    }

}